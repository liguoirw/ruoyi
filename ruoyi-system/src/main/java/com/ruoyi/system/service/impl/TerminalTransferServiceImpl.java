package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TerminalTransferMapper;
import com.ruoyi.system.domain.TerminalTransfer;
import com.ruoyi.system.service.ITerminalTransferService;

/**
 * 划拨记录Service业务层处理
 * 
 * @author wutianxiang
 * @date 2024-02-23
 */
@Service
public class TerminalTransferServiceImpl implements ITerminalTransferService 
{
    @Autowired
    private TerminalTransferMapper terminalTransferMapper;

    /**
     * 查询划拨记录
     * 
     * @param id 划拨记录主键
     * @return 划拨记录
     */
    @Override
    public TerminalTransfer selectTerminalTransferById(Long id)
    {
        return terminalTransferMapper.selectTerminalTransferById(id);
    }

    /**
     * 查询划拨记录列表
     * 
     * @param terminalTransfer 划拨记录
     * @return 划拨记录
     */
    @Override
    public List<TerminalTransfer> selectTerminalTransferList(TerminalTransfer terminalTransfer)
    {
        return terminalTransferMapper.selectTerminalTransferList(terminalTransfer);
    }

    /**
     * 新增划拨记录
     * 
     * @param terminalTransfer 划拨记录
     * @return 结果
     */
    @Override
    public int insertTerminalTransfer(TerminalTransfer terminalTransfer)
    {
        terminalTransfer.setCreateTime(DateUtils.getNowDate());
        return terminalTransferMapper.insertTerminalTransfer(terminalTransfer);
    }

    /**
     * 修改划拨记录
     * 
     * @param terminalTransfer 划拨记录
     * @return 结果
     */
    @Override
    public int updateTerminalTransfer(TerminalTransfer terminalTransfer)
    {
        terminalTransfer.setUpdateTime(DateUtils.getNowDate());
        return terminalTransferMapper.updateTerminalTransfer(terminalTransfer);
    }

    /**
     * 批量删除划拨记录
     * 
     * @param ids 需要删除的划拨记录主键
     * @return 结果
     */
    @Override
    public int deleteTerminalTransferByIds(Long[] ids)
    {
        return terminalTransferMapper.deleteTerminalTransferByIds(ids);
    }

    /**
     * 删除划拨记录信息
     * 
     * @param id 划拨记录主键
     * @return 结果
     */
    @Override
    public int deleteTerminalTransferById(Long id)
    {
        return terminalTransferMapper.deleteTerminalTransferById(id);
    }
}
