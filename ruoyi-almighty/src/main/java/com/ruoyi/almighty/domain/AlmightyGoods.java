package com.ruoyi.almighty.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 二手物品对象 almighty_goods
 * 
 * @author ruoyi
 * @date 2021-09-05
 */
public class AlmightyGoods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增主键 */
    private Long goodsId;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String gName;

    /** 发布时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date gPublishdate;

    /** 详细 */
    @Excel(name = "详细")
    private String gDetail;

    /** 价格 */
    @Excel(name = "价格")
    private BigDecimal gPrice;

    /** $column.columnComment */
    @Excel(name = "价格")
    private Long uId;

    public void setGoodsId(Long goodsId) 
    {
        this.goodsId = goodsId;
    }

    public Long getGoodsId() 
    {
        return goodsId;
    }
    public void setgName(String gName) 
    {
        this.gName = gName;
    }

    public String getgName() 
    {
        return gName;
    }
    public void setgPublishdate(Date gPublishdate) 
    {
        this.gPublishdate = gPublishdate;
    }

    public Date getgPublishdate() 
    {
        return gPublishdate;
    }
    public void setgDetail(String gDetail) 
    {
        this.gDetail = gDetail;
    }

    public String getgDetail() 
    {
        return gDetail;
    }
    public void setgPrice(BigDecimal gPrice) 
    {
        this.gPrice = gPrice;
    }

    public BigDecimal getgPrice() 
    {
        return gPrice;
    }
    public void setuId(Long uId) 
    {
        this.uId = uId;
    }

    public Long getuId() 
    {
        return uId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("goodsId", getGoodsId())
            .append("gName", getgName())
            .append("gPublishdate", getgPublishdate())
            .append("gDetail", getgDetail())
            .append("gPrice", getgPrice())
            .append("uId", getuId())
            .toString();
    }
}
