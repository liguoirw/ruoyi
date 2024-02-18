package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BdtzMapper;
import com.ruoyi.system.domain.Bdtz;
import com.ruoyi.system.service.IBdtzService;

/**
 * 绑机通知Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-29
 */
@Service
public class BdtzServiceImpl implements IBdtzService 
{
    @Autowired
    private BdtzMapper bdtzMapper;

    /**
     * 查询绑机通知
     * 
     * @param id 绑机通知主键
     * @return 绑机通知
     */
    @Override
    public Bdtz selectBdtzById(Long id)
    {
        return bdtzMapper.selectBdtzById(id);
    }

    /**
     * 查询绑机通知列表
     * 
     * @param bdtz 绑机通知
     * @return 绑机通知
     */
    @Override
    public List<Bdtz> selectBdtzList(Bdtz bdtz)
    {
        return bdtzMapper.selectBdtzList(bdtz);
    }

    /**
     * 新增绑机通知
     * 
     * @param bdtz 绑机通知
     * @return 结果
     */
    @Override
    public int insertBdtz(Bdtz bdtz)
    {
        return bdtzMapper.insertBdtz(bdtz);
    }

    /**
     * 修改绑机通知
     * 
     * @param bdtz 绑机通知
     * @return 结果
     */
    @Override
    public int updateBdtz(Bdtz bdtz)
    {
        return bdtzMapper.updateBdtz(bdtz);
    }

    /**
     * 批量删除绑机通知
     * 
     * @param ids 需要删除的绑机通知主键
     * @return 结果
     */
    @Override
    public int deleteBdtzByIds(Long[] ids)
    {
        return bdtzMapper.deleteBdtzByIds(ids);
    }

    /**
     * 删除绑机通知信息
     * 
     * @param id 绑机通知主键
     * @return 结果
     */
    @Override
    public int deleteBdtzById(Long id)
    {
        return bdtzMapper.deleteBdtzById(id);
    }
}
