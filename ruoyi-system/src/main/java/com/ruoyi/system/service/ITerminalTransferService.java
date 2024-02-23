package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TerminalTransfer;

/**
 * 划拨记录Service接口
 * 
 * @author wutianxiang
 * @date 2024-02-23
 */
public interface ITerminalTransferService 
{
    /**
     * 查询划拨记录
     * 
     * @param id 划拨记录主键
     * @return 划拨记录
     */
    public TerminalTransfer selectTerminalTransferById(Long id);

    /**
     * 查询划拨记录列表
     * 
     * @param terminalTransfer 划拨记录
     * @return 划拨记录集合
     */
    public List<TerminalTransfer> selectTerminalTransferList(TerminalTransfer terminalTransfer);

    /**
     * 新增划拨记录
     * 
     * @param terminalTransfer 划拨记录
     * @return 结果
     */
    public int insertTerminalTransfer(TerminalTransfer terminalTransfer);

    /**
     * 修改划拨记录
     * 
     * @param terminalTransfer 划拨记录
     * @return 结果
     */
    public int updateTerminalTransfer(TerminalTransfer terminalTransfer);

    /**
     * 批量删除划拨记录
     * 
     * @param ids 需要删除的划拨记录主键集合
     * @return 结果
     */
    public int deleteTerminalTransferByIds(Long[] ids);

    /**
     * 删除划拨记录信息
     * 
     * @param id 划拨记录主键
     * @return 结果
     */
    public int deleteTerminalTransferById(Long id);
}
