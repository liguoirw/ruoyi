package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.JytzzbMapper;
import com.ruoyi.system.domain.Jytzzb;
import com.ruoyi.system.service.IJytzzbService;

/**
 * 交易通知子Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-29
 */
@Service
public class JytzzbServiceImpl implements IJytzzbService 
{
    @Autowired
    private JytzzbMapper jytzzbMapper;

    /**
     * 查询交易通知子
     * 
     * @param id 交易通知子主键
     * @return 交易通知子
     */
    @Override
    public Jytzzb selectJytzzbById(Long id)
    {
        return jytzzbMapper.selectJytzzbById(id);
    }

    /**
     * 查询交易通知子列表
     * 
     * @param jytzzb 交易通知子
     * @return 交易通知子
     */
    @Override
    public List<Jytzzb> selectJytzzbList(Jytzzb jytzzb)
    {
        return jytzzbMapper.selectJytzzbList(jytzzb);
    }

    /**
     * 新增交易通知子
     * 
     * @param jytzzb 交易通知子
     * @return 结果
     */
    @Override
    public int insertJytzzb(Jytzzb jytzzb)
    {
        return jytzzbMapper.insertJytzzb(jytzzb);
    }

    /**
     * 修改交易通知子
     * 
     * @param jytzzb 交易通知子
     * @return 结果
     */
    @Override
    public int updateJytzzb(Jytzzb jytzzb)
    {
        return jytzzbMapper.updateJytzzb(jytzzb);
    }

    /**
     * 批量删除交易通知子
     * 
     * @param ids 需要删除的交易通知子主键
     * @return 结果
     */
    @Override
    public int deleteJytzzbByIds(Long[] ids)
    {
        return jytzzbMapper.deleteJytzzbByIds(ids);
    }

    /**
     * 删除交易通知子信息
     * 
     * @param id 交易通知子主键
     * @return 结果
     */
    @Override
    public int deleteJytzzbById(Long id)
    {
        return jytzzbMapper.deleteJytzzbById(id);
    }
}
