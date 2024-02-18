package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.JytzfcMapper;
import com.ruoyi.system.domain.Jytzfc;
import com.ruoyi.system.service.IJytzfcService;

/**
 * 交易通知返参Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-29
 */
@Service
public class JytzfcServiceImpl implements IJytzfcService 
{
    @Autowired
    private JytzfcMapper jytzfcMapper;

    /**
     * 查询交易通知返参
     * 
     * @param id 交易通知返参主键
     * @return 交易通知返参
     */
    @Override
    public Jytzfc selectJytzfcById(Long id)
    {
        return jytzfcMapper.selectJytzfcById(id);
    }

    /**
     * 查询交易通知返参列表
     * 
     * @param jytzfc 交易通知返参
     * @return 交易通知返参
     */
    @Override
    public List<Jytzfc> selectJytzfcList(Jytzfc jytzfc)
    {
        return jytzfcMapper.selectJytzfcList(jytzfc);
    }

    /**
     * 新增交易通知返参
     * 
     * @param jytzfc 交易通知返参
     * @return 结果
     */
    @Override
    public int insertJytzfc(Jytzfc jytzfc)
    {

        return jytzfcMapper.insertJytzfc(jytzfc);
    }

    /**
     * 修改交易通知返参
     * 
     * @param jytzfc 交易通知返参
     * @return 结果
     */
    @Override
    public int updateJytzfc(Jytzfc jytzfc)
    {
        return jytzfcMapper.updateJytzfc(jytzfc);
    }

    /**
     * 批量删除交易通知返参
     * 
     * @param ids 需要删除的交易通知返参主键
     * @return 结果
     */
    @Override
    public int deleteJytzfcByIds(Long[] ids)
    {
        return jytzfcMapper.deleteJytzfcByIds(ids);
    }

    /**
     * 删除交易通知返参信息
     * 
     * @param id 交易通知返参主键
     * @return 结果
     */
    @Override
    public int deleteJytzfcById(Long id)
    {
        return jytzfcMapper.deleteJytzfcById(id);
    }
}
