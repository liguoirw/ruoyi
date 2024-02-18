package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.JytzzMapper;
import com.ruoyi.system.domain.Jytzz;
import com.ruoyi.system.service.IJytzzService;

/**
 * 交易通知主Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-29
 */
@Service
public class JytzzServiceImpl implements IJytzzService 
{
    @Autowired
    private JytzzMapper jytzzMapper;

    /**
     * 查询交易通知主
     * 
     * @param id 交易通知主主键
     * @return 交易通知主
     */
    @Override
    public Jytzz selectJytzzById(Long id)
    {
        return jytzzMapper.selectJytzzById(id);
    }

    /**
     * 查询交易通知主列表
     * 
     * @param jytzz 交易通知主
     * @return 交易通知主
     */
    @Override
    public List<Jytzz> selectJytzzList(Jytzz jytzz)
    {
        return jytzzMapper.selectJytzzList(jytzz);
    }



    @Override
    public List<Jytzz> selectJytzzListzx(Jytzz jytzz)
    {
        return jytzzMapper.selectJytzzListzx(jytzz);
    }
    /**
     * 新增交易通知主
     * 
     * @param jytzz 交易通知主
     * @return 结果
     */
    @Override
    public int insertJytzz(Jytzz jytzz)
    {
        return jytzzMapper.insertJytzz(jytzz);
    }

    /**
     * 修改交易通知主
     * 
     * @param jytzz 交易通知主
     * @return 结果
     */
    @Override
    public int updateJytzz(Jytzz jytzz)
    {
        return jytzzMapper.updateJytzz(jytzz);
    }

    /**
     * 批量删除交易通知主
     * 
     * @param ids 需要删除的交易通知主主键
     * @return 结果
     */
    @Override
    public int deleteJytzzByIds(Long[] ids)
    {
        return jytzzMapper.deleteJytzzByIds(ids);
    }

    /**
     * 删除交易通知主信息
     * 
     * @param id 交易通知主主键
     * @return 结果
     */
    @Override
    public int deleteJytzzById(Long id)
    {
        return jytzzMapper.deleteJytzzById(id);
    }
}
