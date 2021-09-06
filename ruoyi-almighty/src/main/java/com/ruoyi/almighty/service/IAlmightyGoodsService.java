package com.ruoyi.almighty.service;

import java.util.List;
import com.ruoyi.almighty.domain.AlmightyGoods;

/**
 * 二手物品Service接口
 * 
 * @author ruoyi
 * @date 2021-09-05
 */
public interface IAlmightyGoodsService 
{
    /**
     * 查询二手物品
     * 
     * @param goodsId 二手物品主键
     * @return 二手物品
     */
    public AlmightyGoods selectAlmightyGoodsByGoodsId(Long goodsId);

    /**
     * 查询二手物品列表
     * 
     * @param almightyGoods 二手物品
     * @return 二手物品集合
     */
    public List<AlmightyGoods> selectAlmightyGoodsList(AlmightyGoods almightyGoods);

    /**
     * 新增二手物品
     * 
     * @param almightyGoods 二手物品
     * @return 结果
     */
    public int insertAlmightyGoods(AlmightyGoods almightyGoods);

    /**
     * 修改二手物品
     * 
     * @param almightyGoods 二手物品
     * @return 结果
     */
    public int updateAlmightyGoods(AlmightyGoods almightyGoods);

    /**
     * 批量删除二手物品
     * 
     * @param goodsIds 需要删除的二手物品主键集合
     * @return 结果
     */
    public int deleteAlmightyGoodsByGoodsIds(Long[] goodsIds);

    /**
     * 删除二手物品信息
     * 
     * @param goodsId 二手物品主键
     * @return 结果
     */
    public int deleteAlmightyGoodsByGoodsId(Long goodsId);
}
