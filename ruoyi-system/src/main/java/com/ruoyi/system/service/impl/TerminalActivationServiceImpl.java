package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TerminalActivationMapper;
import com.ruoyi.system.domain.TerminalActivation;
import com.ruoyi.system.service.ITerminalActivationService;

/**
 * 伪激活机械Service业务层处理
 * 
 * @author wutianxiang
 * @date 2024-02-23
 */
@Service
public class TerminalActivationServiceImpl implements ITerminalActivationService 
{
    @Autowired
    private TerminalActivationMapper terminalActivationMapper;

    /**
     * 查询伪激活机械
     * 
     * @param id 伪激活机械主键
     * @return 伪激活机械
     */
    @Override
    public TerminalActivation selectTerminalActivationById(Long id)
    {
        return terminalActivationMapper.selectTerminalActivationById(id);
    }

    /**
     * 查询伪激活机械列表
     * 
     * @param terminalActivation 伪激活机械
     * @return 伪激活机械
     */
    @Override
    public List<TerminalActivation> selectTerminalActivationList(TerminalActivation terminalActivation)
    {
        return terminalActivationMapper.selectTerminalActivationList(terminalActivation);
    }

    /**
     * 新增伪激活机械
     * 
     * @param terminalActivation 伪激活机械
     * @return 结果
     */
    @Override
    public int insertTerminalActivation(TerminalActivation terminalActivation)
    {
        terminalActivation.setCreateTime(DateUtils.getNowDate());
        return terminalActivationMapper.insertTerminalActivation(terminalActivation);
    }

    /**
     * 修改伪激活机械
     * 
     * @param terminalActivation 伪激活机械
     * @return 结果
     */
    @Override
    public int updateTerminalActivation(TerminalActivation terminalActivation)
    {
        return terminalActivationMapper.updateTerminalActivation(terminalActivation);
    }

    /**
     * 批量删除伪激活机械
     * 
     * @param ids 需要删除的伪激活机械主键
     * @return 结果
     */
    @Override
    public int deleteTerminalActivationByIds(Long[] ids)
    {
        return terminalActivationMapper.deleteTerminalActivationByIds(ids);
    }

    /**
     * 删除伪激活机械信息
     * 
     * @param id 伪激活机械主键
     * @return 结果
     */
    @Override
    public int deleteTerminalActivationById(Long id)
    {
        return terminalActivationMapper.deleteTerminalActivationById(id);
    }
}
