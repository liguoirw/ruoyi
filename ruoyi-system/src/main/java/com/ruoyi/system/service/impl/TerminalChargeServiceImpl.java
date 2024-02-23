package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TerminalChargeMapper;
import com.ruoyi.system.domain.TerminalCharge;
import com.ruoyi.system.service.ITerminalChargeService;

/**
 * 服务费冻结记录Service业务层处理
 * 
 * @author wutianxiang
 * @date 2024-02-22
 */
@Service
public class TerminalChargeServiceImpl implements ITerminalChargeService 
{
    @Autowired
    private TerminalChargeMapper terminalChargeMapper;

    /**
     * 查询服务费冻结记录
     * 
     * @param id 服务费冻结记录主键
     * @return 服务费冻结记录
     */
    @Override
    public TerminalCharge selectTerminalChargeById(Long id)
    {
        return terminalChargeMapper.selectTerminalChargeById(id);
    }

    /**
     * 查询服务费冻结记录列表
     * 
     * @param terminalCharge 服务费冻结记录
     * @return 服务费冻结记录
     */
    @Override
    public List<TerminalCharge> selectTerminalChargeList(TerminalCharge terminalCharge)
    {
        return terminalChargeMapper.selectTerminalChargeList(terminalCharge);
    }

    /**
     * 新增服务费冻结记录
     * 
     * @param terminalCharge 服务费冻结记录
     * @return 结果
     */
    @Override
    public int insertTerminalCharge(TerminalCharge terminalCharge)
    {
        terminalCharge.setCreateTime(DateUtils.getNowDate());
        return terminalChargeMapper.insertTerminalCharge(terminalCharge);
    }

    /**
     * 修改服务费冻结记录
     * 
     * @param terminalCharge 服务费冻结记录
     * @return 结果
     */
    @Override
    public int updateTerminalCharge(TerminalCharge terminalCharge)
    {
        terminalCharge.setUpdateTime(DateUtils.getNowDate());
        return terminalChargeMapper.updateTerminalCharge(terminalCharge);
    }

    /**
     * 批量删除服务费冻结记录
     * 
     * @param ids 需要删除的服务费冻结记录主键
     * @return 结果
     */
    @Override
    public int deleteTerminalChargeByIds(Long[] ids)
    {
        return terminalChargeMapper.deleteTerminalChargeByIds(ids);
    }

    /**
     * 删除服务费冻结记录信息
     * 
     * @param id 服务费冻结记录主键
     * @return 结果
     */
    @Override
    public int deleteTerminalChargeById(Long id)
    {
        return terminalChargeMapper.deleteTerminalChargeById(id);
    }
}
