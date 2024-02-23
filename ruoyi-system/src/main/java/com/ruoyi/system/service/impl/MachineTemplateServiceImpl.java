package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.MachineTemplateMapper;
import com.ruoyi.system.domain.MachineTemplate;
import com.ruoyi.system.service.IMachineTemplateService;

/**
 * 机具模版Service业务层处理
 * 
 * @author ztc
 * @date 2024-02-22
 */
@Service
public class MachineTemplateServiceImpl implements IMachineTemplateService 
{
    @Autowired
    private MachineTemplateMapper machineTemplateMapper;

    /**
     * 查询机具模版
     * 
     * @param id 机具模版主键
     * @return 机具模版
     */
    @Override
    public MachineTemplate selectMachineTemplateById(Long id)
    {
        return machineTemplateMapper.selectMachineTemplateById(id);
    }

    /**
     * 查询机具模版列表
     * 
     * @param machineTemplate 机具模版
     * @return 机具模版
     */
    @Override
    public List<MachineTemplate> selectMachineTemplateList(MachineTemplate machineTemplate)
    {
        return machineTemplateMapper.selectMachineTemplateList(machineTemplate);
    }

    /**
     * 新增机具模版
     * 
     * @param machineTemplate 机具模版
     * @return 结果
     */
    @Override
    public int insertMachineTemplate(MachineTemplate machineTemplate)
    {
        return machineTemplateMapper.insertMachineTemplate(machineTemplate);
    }

    /**
     * 修改机具模版
     * 
     * @param machineTemplate 机具模版
     * @return 结果
     */
    @Override
    public int updateMachineTemplate(MachineTemplate machineTemplate)
    {
        machineTemplate.setUpdateTime(DateUtils.getNowDate());
        return machineTemplateMapper.updateMachineTemplate(machineTemplate);
    }

    /**
     * 批量删除机具模版
     * 
     * @param ids 需要删除的机具模版主键
     * @return 结果
     */
    @Override
    public int deleteMachineTemplateByIds(Long[] ids)
    {
        return machineTemplateMapper.deleteMachineTemplateByIds(ids);
    }

    /**
     * 删除机具模版信息
     * 
     * @param id 机具模版主键
     * @return 结果
     */
    @Override
    public int deleteMachineTemplateById(Long id)
    {
        return machineTemplateMapper.deleteMachineTemplateById(id);
    }
}
