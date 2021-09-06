package com.ruoyi.almighty.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.almighty.mapper.AlmightyUserMapper;
import com.ruoyi.almighty.domain.AlmightyUser;
import com.ruoyi.almighty.service.IAlmightyUserService;

/**
 * 用户管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-09-05
 */
@Service
public class AlmightyUserServiceImpl implements IAlmightyUserService 
{
    @Autowired
    private AlmightyUserMapper almightyUserMapper;

    /**
     * 查询用户管理
     * 
     * @param uId 用户管理主键
     * @return 用户管理
     */
    @Override
    public AlmightyUser selectAlmightyUserByUId(Long uId)
    {
        return almightyUserMapper.selectAlmightyUserByUId(uId);
    }

    /**
     * 查询用户管理列表
     * 
     * @param almightyUser 用户管理
     * @return 用户管理
     */
    @Override
    public List<AlmightyUser> selectAlmightyUserList(AlmightyUser almightyUser)
    {
        return almightyUserMapper.selectAlmightyUserList(almightyUser);
    }

    /**
     * 新增用户管理
     * 
     * @param almightyUser 用户管理
     * @return 结果
     */
    @Override
    public int insertAlmightyUser(AlmightyUser almightyUser)
    {
        return almightyUserMapper.insertAlmightyUser(almightyUser);
    }

    /**
     * 修改用户管理
     * 
     * @param almightyUser 用户管理
     * @return 结果
     */
    @Override
    public int updateAlmightyUser(AlmightyUser almightyUser)
    {
        return almightyUserMapper.updateAlmightyUser(almightyUser);
    }

    /**
     * 批量删除用户管理
     * 
     * @param uIds 需要删除的用户管理主键
     * @return 结果
     */
    @Override
    public int deleteAlmightyUserByUIds(Long[] uIds)
    {
        return almightyUserMapper.deleteAlmightyUserByUIds(uIds);
    }

    /**
     * 删除用户管理信息
     * 
     * @param uId 用户管理主键
     * @return 结果
     */
    @Override
    public int deleteAlmightyUserByUId(Long uId)
    {
        return almightyUserMapper.deleteAlmightyUserByUId(uId);
    }
}
