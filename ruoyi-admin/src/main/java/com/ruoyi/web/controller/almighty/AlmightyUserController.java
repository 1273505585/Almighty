package com.ruoyi.web.controller.almighty;

import com.ruoyi.almighty.domain.AlmightyUser;
import com.ruoyi.almighty.service.IAlmightyUserService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户管理Controller
 *
 * @author ruoyi
 * @date 2021-09-05
 */
@RestController
@RequestMapping("/almighty/user")
public class AlmightyUserController extends BaseController
{
    @Autowired
    private IAlmightyUserService almightyUserService;

    /**
     * 查询用户管理列表
     */
    @PreAuthorize("@ss.hasPermi('almighty:user:list')")
    @GetMapping("/list")
    public TableDataInfo list(AlmightyUser almightyUser)
    {
        startPage();
        List<AlmightyUser> list = almightyUserService.selectAlmightyUserList(almightyUser);
        return getDataTable(list);
    }

    /**
     * 导出用户管理列表
     */
    @PreAuthorize("@ss.hasPermi('almighty:user:export')")
    @Log(title = "用户管理", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(AlmightyUser almightyUser)
    {
        List<AlmightyUser> list = almightyUserService.selectAlmightyUserList(almightyUser);
        ExcelUtil<AlmightyUser> util = new ExcelUtil<AlmightyUser>(AlmightyUser.class);
        return util.exportExcel(list, "用户管理数据");
    }

    /**
     * 获取用户管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('almighty:user:query')")
    @GetMapping(value = "/{uId}")
    public AjaxResult getInfo(@PathVariable("uId") Long uId)
    {
        return AjaxResult.success(almightyUserService.selectAlmightyUserByUId(uId));
    }

    /**
     * 新增用户管理
     */
    @PreAuthorize("@ss.hasPermi('almighty:user:add')")
    @Log(title = "用户管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AlmightyUser almightyUser)
    {
        return toAjax(almightyUserService.insertAlmightyUser(almightyUser));
    }

    /**
     * 修改用户管理
     */
    @PreAuthorize("@ss.hasPermi('almighty:user:edit')")
    @Log(title = "用户管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AlmightyUser almightyUser)
    {
        return toAjax(almightyUserService.updateAlmightyUser(almightyUser));
    }

    /**
     * 删除用户管理
     */
    @PreAuthorize("@ss.hasPermi('almighty:user:remove')")
    @Log(title = "用户管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{uIds}")
    public AjaxResult remove(@PathVariable Long[] uIds)
    {
        return toAjax(almightyUserService.deleteAlmightyUserByUIds(uIds));
    }
}
