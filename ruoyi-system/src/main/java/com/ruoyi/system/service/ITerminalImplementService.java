package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TerminalImplement;

/**
 * 机具调拨记录Service接口
 * 
 * @author wutianxiang
 * @date 2024-02-23
 */
public interface ITerminalImplementService 
{
    /**
     * 查询机具调拨记录
     * 
     * @param id 机具调拨记录主键
     * @return 机具调拨记录
     */
    public TerminalImplement selectTerminalImplementById(Long id);

    /**
     * 查询机具调拨记录列表
     * 
     * @param terminalImplement 机具调拨记录
     * @return 机具调拨记录集合
     */
    public List<TerminalImplement> selectTerminalImplementList(TerminalImplement terminalImplement);

    /**
     * 新增机具调拨记录
     * 
     * @param terminalImplement 机具调拨记录
     * @return 结果
     */
    public int insertTerminalImplement(TerminalImplement terminalImplement);

    /**
     * 修改机具调拨记录
     * 
     * @param terminalImplement 机具调拨记录
     * @return 结果
     */
    public int updateTerminalImplement(TerminalImplement terminalImplement);

    /**
     * 批量删除机具调拨记录
     * 
     * @param ids 需要删除的机具调拨记录主键集合
     * @return 结果
     */
    public int deleteTerminalImplementByIds(Long[] ids);

    /**
     * 删除机具调拨记录信息
     * 
     * @param id 机具调拨记录主键
     * @return 结果
     */
    public int deleteTerminalImplementById(Long id);
}
