package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TerminalImplementMapper;
import com.ruoyi.system.domain.TerminalImplement;
import com.ruoyi.system.service.ITerminalImplementService;

/**
 * 机具调拨记录Service业务层处理
 * 
 * @author wutianxiang
 * @date 2024-02-23
 */
@Service
public class TerminalImplementServiceImpl implements ITerminalImplementService 
{
    @Autowired
    private TerminalImplementMapper terminalImplementMapper;

    /**
     * 查询机具调拨记录
     * 
     * @param id 机具调拨记录主键
     * @return 机具调拨记录
     */
    @Override
    public TerminalImplement selectTerminalImplementById(Long id)
    {
        return terminalImplementMapper.selectTerminalImplementById(id);
    }

    /**
     * 查询机具调拨记录列表
     * 
     * @param terminalImplement 机具调拨记录
     * @return 机具调拨记录
     */
    @Override
    public List<TerminalImplement> selectTerminalImplementList(TerminalImplement terminalImplement)
    {
        return terminalImplementMapper.selectTerminalImplementList(terminalImplement);
    }

    /**
     * 新增机具调拨记录
     * 
     * @param terminalImplement 机具调拨记录
     * @return 结果
     */
    @Override
    public int insertTerminalImplement(TerminalImplement terminalImplement)
    {
        terminalImplement.setCreateTime(DateUtils.getNowDate());
        return terminalImplementMapper.insertTerminalImplement(terminalImplement);
    }

    /**
     * 修改机具调拨记录
     * 
     * @param terminalImplement 机具调拨记录
     * @return 结果
     */
    @Override
    public int updateTerminalImplement(TerminalImplement terminalImplement)
    {
        terminalImplement.setUpdateTime(DateUtils.getNowDate());
        return terminalImplementMapper.updateTerminalImplement(terminalImplement);
    }

    /**
     * 批量删除机具调拨记录
     * 
     * @param ids 需要删除的机具调拨记录主键
     * @return 结果
     */
    @Override
    public int deleteTerminalImplementByIds(Long[] ids)
    {
        return terminalImplementMapper.deleteTerminalImplementByIds(ids);
    }

    /**
     * 删除机具调拨记录信息
     * 
     * @param id 机具调拨记录主键
     * @return 结果
     */
    @Override
    public int deleteTerminalImplementById(Long id)
    {
        return terminalImplementMapper.deleteTerminalImplementById(id);
    }
}
