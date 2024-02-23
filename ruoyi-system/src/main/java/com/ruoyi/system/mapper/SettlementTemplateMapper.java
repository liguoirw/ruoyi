package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SettlementTemplate;

/**
 * 金控Mapper接口
 * 
 * @author ztc
 * @date 2024-02-23
 */
public interface SettlementTemplateMapper 
{
    /**
     * 查询金控
     * 
     * @param id 金控主键
     * @return 金控
     */
    public SettlementTemplate selectSettlementTemplateById(Long id);

    /**
     * 查询金控列表
     * 
     * @param settlementTemplate 金控
     * @return 金控集合
     */
    public List<SettlementTemplate> selectSettlementTemplateList(SettlementTemplate settlementTemplate);

    /**
     * 新增金控
     * 
     * @param settlementTemplate 金控
     * @return 结果
     */
    public int insertSettlementTemplate(SettlementTemplate settlementTemplate);

    /**
     * 修改金控
     * 
     * @param settlementTemplate 金控
     * @return 结果
     */
    public int updateSettlementTemplate(SettlementTemplate settlementTemplate);

    /**
     * 删除金控
     * 
     * @param id 金控主键
     * @return 结果
     */
    public int deleteSettlementTemplateById(Long id);

    /**
     * 批量删除金控
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSettlementTemplateByIds(Long[] ids);
}
