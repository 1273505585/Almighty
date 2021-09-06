package com.ruoyi.almighty.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户管理对象 almighty_user
 * 
 * @author ruoyi
 * @date 2021-09-05
 */
public class AlmightyUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Long uId;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String mobile;

    /** 微信openid */
    @Excel(name = "微信openid")
    private String uWxopenid;

    /** 姓名 */
    @Excel(name = "姓名")
    private String uName;

    /** 性别 */
    @Excel(name = "性别")
    private String uAge;

    /** 头像存放路径 */
    @Excel(name = "头像存放路径")
    private String uPortrait;

    /** 密码 */
    @Excel(name = "密码")
    private String uPassword;

    public void setuId(Long uId) 
    {
        this.uId = uId;
    }

    public Long getuId() 
    {
        return uId;
    }
    public void setMobile(String mobile) 
    {
        this.mobile = mobile;
    }

    public String getMobile() 
    {
        return mobile;
    }
    public void setuWxopenid(String uWxopenid) 
    {
        this.uWxopenid = uWxopenid;
    }

    public String getuWxopenid() 
    {
        return uWxopenid;
    }
    public void setuName(String uName) 
    {
        this.uName = uName;
    }

    public String getuName() 
    {
        return uName;
    }
    public void setuAge(String uAge) 
    {
        this.uAge = uAge;
    }

    public String getuAge() 
    {
        return uAge;
    }
    public void setuPortrait(String uPortrait) 
    {
        this.uPortrait = uPortrait;
    }

    public String getuPortrait() 
    {
        return uPortrait;
    }
    public void setuPassword(String uPassword) 
    {
        this.uPassword = uPassword;
    }

    public String getuPassword() 
    {
        return uPassword;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("uId", getuId())
            .append("mobile", getMobile())
            .append("uWxopenid", getuWxopenid())
            .append("uName", getuName())
            .append("uAge", getuAge())
            .append("uPortrait", getuPortrait())
            .append("uPassword", getuPassword())
            .toString();
    }
}
