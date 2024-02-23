package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TerminalFlowMapper;
import com.ruoyi.system.domain.TerminalFlow;
import com.ruoyi.system.service.ITerminalFlowService;

/**
 * 流量费冻结记录Service业务层处理
 * 
 * @author wutianxiang
 * @date 2024-02-22
 */
@Service
public class TerminalFlowServiceImpl implements ITerminalFlowService 
{
    @Autowired
    private TerminalFlowMapper terminalFlowMapper;

    /**
     * 查询流量费冻结记录
     * 
     * @param id 流量费冻结记录主键
     * @return 流量费冻结记录
     */
    @Override
    public TerminalFlow selectTerminalFlowById(Long id)
    {
        return terminalFlowMapper.selectTerminalFlowById(id);
    }

    /**
     * 查询流量费冻结记录列表
     * 
     * @param terminalFlow 流量费冻结记录
     * @return 流量费冻结记录
     */
    @Override
    public List<TerminalFlow> selectTerminalFlowList(TerminalFlow terminalFlow)
    {
        return terminalFlowMapper.selectTerminalFlowList(terminalFlow);
    }

    /**
     * 新增流量费冻结记录
     * 
     * @param terminalFlow 流量费冻结记录
     * @return 结果
     */
    @Override
    public int insertTerminalFlow(TerminalFlow terminalFlow)
    {
        terminalFlow.setCreateTime(DateUtils.getNowDate());
        return terminalFlowMapper.insertTerminalFlow(terminalFlow);
    }

    /**
     * 修改流量费冻结记录
     * 
     * @param terminalFlow 流量费冻结记录
     * @return 结果
     */
    @Override
    public int updateTerminalFlow(TerminalFlow terminalFlow)
    {
        terminalFlow.setUpdateTime(DateUtils.getNowDate());
        return terminalFlowMapper.updateTerminalFlow(terminalFlow);
    }

    /**
     * 批量删除流量费冻结记录
     * 
     * @param ids 需要删除的流量费冻结记录主键
     * @return 结果
     */
    @Override
    public int deleteTerminalFlowByIds(Long[] ids)
    {
        return terminalFlowMapper.deleteTerminalFlowByIds(ids);
    }

    /**
     * 删除流量费冻结记录信息
     * 
     * @param id 流量费冻结记录主键
     * @return 结果
     */
    @Override
    public int deleteTerminalFlowById(Long id)
    {
        return terminalFlowMapper.deleteTerminalFlowById(id);
    }
}
