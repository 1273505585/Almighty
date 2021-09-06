package com.ruoyi.almighty.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.almighty.mapper.AlmightyGoodsMapper;
import com.ruoyi.almighty.domain.AlmightyGoods;
import com.ruoyi.almighty.service.IAlmightyGoodsService;

/**
 * 二手物品Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-09-05
 */
@Service
public class AlmightyGoodsServiceImpl implements IAlmightyGoodsService 
{
    @Autowired
    private AlmightyGoodsMapper almightyGoodsMapper;

    /**
     * 查询二手物品
     * 
     * @param goodsId 二手物品主键
     * @return 二手物品
     */
    @Override
    public AlmightyGoods selectAlmightyGoodsByGoodsId(Long goodsId)
    {
        return almightyGoodsMapper.selectAlmightyGoodsByGoodsId(goodsId);
    }

    /**
     * 查询二手物品列表
     * 
     * @param almightyGoods 二手物品
     * @return 二手物品
     */
    @Override
    public List<AlmightyGoods> selectAlmightyGoodsList(AlmightyGoods almightyGoods)
    {
        return almightyGoodsMapper.selectAlmightyGoodsList(almightyGoods);
    }

    /**
     * 新增二手物品
     * 
     * @param almightyGoods 二手物品
     * @return 结果
     */
    @Override
    public int insertAlmightyGoods(AlmightyGoods almightyGoods)
    {
        return almightyGoodsMapper.insertAlmightyGoods(almightyGoods);
    }

    /**
     * 修改二手物品
     * 
     * @param almightyGoods 二手物品
     * @return 结果
     */
    @Override
    public int updateAlmightyGoods(AlmightyGoods almightyGoods)
    {
        return almightyGoodsMapper.updateAlmightyGoods(almightyGoods);
    }

    /**
     * 批量删除二手物品
     * 
     * @param goodsIds 需要删除的二手物品主键
     * @return 结果
     */
    @Override
    public int deleteAlmightyGoodsByGoodsIds(Long[] goodsIds)
    {
        return almightyGoodsMapper.deleteAlmightyGoodsByGoodsIds(goodsIds);
    }

    /**
     * 删除二手物品信息
     * 
     * @param goodsId 二手物品主键
     * @return 结果
     */
    @Override
    public int deleteAlmightyGoodsByGoodsId(Long goodsId)
    {
        return almightyGoodsMapper.deleteAlmightyGoodsByGoodsId(goodsId);
    }
}
