package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TerminalFlow;

/**
 * 流量费冻结记录Service接口
 * 
 * @author wutianxiang
 * @date 2024-02-22
 */
public interface ITerminalFlowService 
{
    /**
     * 查询流量费冻结记录
     * 
     * @param id 流量费冻结记录主键
     * @return 流量费冻结记录
     */
    public TerminalFlow selectTerminalFlowById(Long id);

    /**
     * 查询流量费冻结记录列表
     * 
     * @param terminalFlow 流量费冻结记录
     * @return 流量费冻结记录集合
     */
    public List<TerminalFlow> selectTerminalFlowList(TerminalFlow terminalFlow);

    /**
     * 新增流量费冻结记录
     * 
     * @param terminalFlow 流量费冻结记录
     * @return 结果
     */
    public int insertTerminalFlow(TerminalFlow terminalFlow);

    /**
     * 修改流量费冻结记录
     * 
     * @param terminalFlow 流量费冻结记录
     * @return 结果
     */
    public int updateTerminalFlow(TerminalFlow terminalFlow);

    /**
     * 批量删除流量费冻结记录
     * 
     * @param ids 需要删除的流量费冻结记录主键集合
     * @return 结果
     */
    public int deleteTerminalFlowByIds(Long[] ids);

    /**
     * 删除流量费冻结记录信息
     * 
     * @param id 流量费冻结记录主键
     * @return 结果
     */
    public int deleteTerminalFlowById(Long id);
}
