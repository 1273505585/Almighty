package com.ruoyi.web.controller.almighty;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.almighty.domain.AlmightyGoods;
import com.ruoyi.almighty.service.IAlmightyGoodsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 二手物品Controller
 *
 * @author ruoyi
 * @date 2021-09-05
 */
@RestController
@RequestMapping("/almighty/goods")
public class AlmightyGoodsController extends BaseController
{
    @Autowired
    private IAlmightyGoodsService almightyGoodsService;

    /**
     * 查询二手物品列表
     */
    @PreAuthorize("@ss.hasPermi('almighty:goods:list')")
    @GetMapping("/list")
    public TableDataInfo list(AlmightyGoods almightyGoods)
    {
        startPage();
        List<AlmightyGoods> list = almightyGoodsService.selectAlmightyGoodsList(almightyGoods);
        return getDataTable(list);
    }

    /**
     * 导出二手物品列表
     */
    @PreAuthorize("@ss.hasPermi('almighty:goods:export')")
    @Log(title = "二手物品", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(AlmightyGoods almightyGoods)
    {
        List<AlmightyGoods> list = almightyGoodsService.selectAlmightyGoodsList(almightyGoods);
        ExcelUtil<AlmightyGoods> util = new ExcelUtil<AlmightyGoods>(AlmightyGoods.class);
        return util.exportExcel(list, "二手物品数据");
    }

    /**
     * 获取二手物品详细信息
     */
    @PreAuthorize("@ss.hasPermi('almighty:goods:query')")
    @GetMapping(value = "/{goodsId}")
    public AjaxResult getInfo(@PathVariable("goodsId") Long goodsId)
    {
        return AjaxResult.success(almightyGoodsService.selectAlmightyGoodsByGoodsId(goodsId));
    }

    /**
     * 新增二手物品
     */
    @PreAuthorize("@ss.hasPermi('almighty:goods:add')")
    @Log(title = "二手物品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AlmightyGoods almightyGoods)
    {
        return toAjax(almightyGoodsService.insertAlmightyGoods(almightyGoods));
    }

    /**
     * 修改二手物品
     */
    @PreAuthorize("@ss.hasPermi('almighty:goods:edit')")
    @Log(title = "二手物品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AlmightyGoods almightyGoods)
    {
        return toAjax(almightyGoodsService.updateAlmightyGoods(almightyGoods));
    }

    /**
     * 删除二手物品
     */
    @PreAuthorize("@ss.hasPermi('almighty:goods:remove')")
    @Log(title = "二手物品", businessType = BusinessType.DELETE)
	@DeleteMapping("/{goodsIds}")
    public AjaxResult remove(@PathVariable Long[] goodsIds)
    {
        return toAjax(almightyGoodsService.deleteAlmightyGoodsByGoodsIds(goodsIds));
    }
}
