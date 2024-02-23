package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.MachineTemplate;

/**
 * 机具模版Mapper接口
 * 
 * @author ztc
 * @date 2024-02-22
 */
public interface MachineTemplateMapper 
{
    /**
     * 查询机具模版
     * 
     * @param id 机具模版主键
     * @return 机具模版
     */
    public MachineTemplate selectMachineTemplateById(Long id);

    /**
     * 查询机具模版列表
     * 
     * @param machineTemplate 机具模版
     * @return 机具模版集合
     */
    public List<MachineTemplate> selectMachineTemplateList(MachineTemplate machineTemplate);

    /**
     * 新增机具模版
     * 
     * @param machineTemplate 机具模版
     * @return 结果
     */
    public int insertMachineTemplate(MachineTemplate machineTemplate);

    /**
     * 修改机具模版
     * 
     * @param machineTemplate 机具模版
     * @return 结果
     */
    public int updateMachineTemplate(MachineTemplate machineTemplate);

    /**
     * 删除机具模版
     * 
     * @param id 机具模版主键
     * @return 结果
     */
    public int deleteMachineTemplateById(Long id);

    /**
     * 批量删除机具模版
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMachineTemplateByIds(Long[] ids);
}
