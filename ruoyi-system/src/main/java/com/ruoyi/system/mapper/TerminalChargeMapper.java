package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TerminalCharge;

/**
 * 服务费冻结记录Mapper接口
 * 
 * @author wutianxiang
 * @date 2024-02-22
 */
public interface TerminalChargeMapper 
{
    /**
     * 查询服务费冻结记录
     * 
     * @param id 服务费冻结记录主键
     * @return 服务费冻结记录
     */
    public TerminalCharge selectTerminalChargeById(Long id);

    /**
     * 查询服务费冻结记录列表
     * 
     * @param terminalCharge 服务费冻结记录
     * @return 服务费冻结记录集合
     */
    public List<TerminalCharge> selectTerminalChargeList(TerminalCharge terminalCharge);

    /**
     * 新增服务费冻结记录
     * 
     * @param terminalCharge 服务费冻结记录
     * @return 结果
     */
    public int insertTerminalCharge(TerminalCharge terminalCharge);

    /**
     * 修改服务费冻结记录
     * 
     * @param terminalCharge 服务费冻结记录
     * @return 结果
     */
    public int updateTerminalCharge(TerminalCharge terminalCharge);

    /**
     * 删除服务费冻结记录
     * 
     * @param id 服务费冻结记录主键
     * @return 结果
     */
    public int deleteTerminalChargeById(Long id);

    /**
     * 批量删除服务费冻结记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTerminalChargeByIds(Long[] ids);
}
