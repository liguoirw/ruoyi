package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SettlementTemplateMapper;
import com.ruoyi.system.domain.SettlementTemplate;
import com.ruoyi.system.service.ISettlementTemplateService;

/**
 * 金控Service业务层处理
 * 
 * @author ztc
 * @date 2024-02-23
 */
@Service
public class SettlementTemplateServiceImpl implements ISettlementTemplateService 
{
    @Autowired
    private SettlementTemplateMapper settlementTemplateMapper;

    /**
     * 查询金控
     * 
     * @param id 金控主键
     * @return 金控
     */
    @Override
    public SettlementTemplate selectSettlementTemplateById(Long id)
    {
        return settlementTemplateMapper.selectSettlementTemplateById(id);
    }

    /**
     * 查询金控列表
     * 
     * @param settlementTemplate 金控
     * @return 金控
     */
    @Override
    public List<SettlementTemplate> selectSettlementTemplateList(SettlementTemplate settlementTemplate)
    {
        return settlementTemplateMapper.selectSettlementTemplateList(settlementTemplate);
    }

    /**
     * 新增金控
     * 
     * @param settlementTemplate 金控
     * @return 结果
     */
    @Override
    public int insertSettlementTemplate(SettlementTemplate settlementTemplate)
    {
        return settlementTemplateMapper.insertSettlementTemplate(settlementTemplate);
    }

    /**
     * 修改金控
     * 
     * @param settlementTemplate 金控
     * @return 结果
     */
    @Override
    public int updateSettlementTemplate(SettlementTemplate settlementTemplate)
    {
        settlementTemplate.setUpdateTime(DateUtils.getNowDate());
        return settlementTemplateMapper.updateSettlementTemplate(settlementTemplate);
    }

    /**
     * 批量删除金控
     * 
     * @param ids 需要删除的金控主键
     * @return 结果
     */
    @Override
    public int deleteSettlementTemplateByIds(Long[] ids)
    {
        return settlementTemplateMapper.deleteSettlementTemplateByIds(ids);
    }

    /**
     * 删除金控信息
     * 
     * @param id 金控主键
     * @return 结果
     */
    @Override
    public int deleteSettlementTemplateById(Long id)
    {
        return settlementTemplateMapper.deleteSettlementTemplateById(id);
    }
}
