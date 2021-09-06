package com.ruoyi.almighty.service;

import java.util.List;
import com.ruoyi.almighty.domain.AlmightyUser;

/**
 * 用户管理Service接口
 * 
 * @author ruoyi
 * @date 2021-09-05
 */
public interface IAlmightyUserService 
{
    /**
     * 查询用户管理
     * 
     * @param uId 用户管理主键
     * @return 用户管理
     */
    public AlmightyUser selectAlmightyUserByUId(Long uId);

    /**
     * 查询用户管理列表
     * 
     * @param almightyUser 用户管理
     * @return 用户管理集合
     */
    public List<AlmightyUser> selectAlmightyUserList(AlmightyUser almightyUser);

    /**
     * 新增用户管理
     * 
     * @param almightyUser 用户管理
     * @return 结果
     */
    public int insertAlmightyUser(AlmightyUser almightyUser);

    /**
     * 修改用户管理
     * 
     * @param almightyUser 用户管理
     * @return 结果
     */
    public int updateAlmightyUser(AlmightyUser almightyUser);

    /**
     * 批量删除用户管理
     * 
     * @param uIds 需要删除的用户管理主键集合
     * @return 结果
     */
    public int deleteAlmightyUserByUIds(Long[] uIds);

    /**
     * 删除用户管理信息
     * 
     * @param uId 用户管理主键
     * @return 结果
     */
    public int deleteAlmightyUserByUId(Long uId);
}
