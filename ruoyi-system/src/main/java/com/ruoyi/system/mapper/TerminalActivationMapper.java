package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TerminalActivation;

/**
 * 伪激活机械Mapper接口
 * 
 * @author wutianxiang
 * @date 2024-02-23
 */
public interface TerminalActivationMapper 
{
    /**
     * 查询伪激活机械
     * 
     * @param id 伪激活机械主键
     * @return 伪激活机械
     */
    public TerminalActivation selectTerminalActivationById(Long id);

    /**
     * 查询伪激活机械列表
     * 
     * @param terminalActivation 伪激活机械
     * @return 伪激活机械集合
     */
    public List<TerminalActivation> selectTerminalActivationList(TerminalActivation terminalActivation);

    /**
     * 新增伪激活机械
     * 
     * @param terminalActivation 伪激活机械
     * @return 结果
     */
    public int insertTerminalActivation(TerminalActivation terminalActivation);

    /**
     * 修改伪激活机械
     * 
     * @param terminalActivation 伪激活机械
     * @return 结果
     */
    public int updateTerminalActivation(TerminalActivation terminalActivation);

    /**
     * 删除伪激活机械
     * 
     * @param id 伪激活机械主键
     * @return 结果
     */
    public int deleteTerminalActivationById(Long id);

    /**
     * 批量删除伪激活机械
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTerminalActivationByIds(Long[] ids);
}
