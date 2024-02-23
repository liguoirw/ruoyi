package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WithdrawalTemplateMapper;
import com.ruoyi.system.domain.WithdrawalTemplate;
import com.ruoyi.system.service.IWithdrawalTemplateService;

/**
 * 提现模板Service业务层处理
 * 
 * @author ztc
 * @date 2024-02-22
 */
@Service
public class WithdrawalTemplateServiceImpl implements IWithdrawalTemplateService 
{
    @Autowired
    private WithdrawalTemplateMapper withdrawalTemplateMapper;

    /**
     * 查询提现模板
     * 
     * @param id 提现模板主键
     * @return 提现模板
     */
    @Override
    public WithdrawalTemplate selectWithdrawalTemplateById(Long id)
    {
        return withdrawalTemplateMapper.selectWithdrawalTemplateById(id);
    }

    /**
     * 查询提现模板列表
     * 
     * @param withdrawalTemplate 提现模板
     * @return 提现模板
     */
    @Override
    public List<WithdrawalTemplate> selectWithdrawalTemplateList(WithdrawalTemplate withdrawalTemplate)
    {
        return withdrawalTemplateMapper.selectWithdrawalTemplateList(withdrawalTemplate);
    }

    /**
     * 新增提现模板
     * 
     * @param withdrawalTemplate 提现模板
     * @return 结果
     */
    @Override
    public int insertWithdrawalTemplate(WithdrawalTemplate withdrawalTemplate)
    {
        return withdrawalTemplateMapper.insertWithdrawalTemplate(withdrawalTemplate);
    }

    /**
     * 修改提现模板
     * 
     * @param withdrawalTemplate 提现模板
     * @return 结果
     */
    @Override
    public int updateWithdrawalTemplate(WithdrawalTemplate withdrawalTemplate)
    {
        withdrawalTemplate.setUpdateTime(DateUtils.getNowDate());
        return withdrawalTemplateMapper.updateWithdrawalTemplate(withdrawalTemplate);
    }

    /**
     * 批量删除提现模板
     * 
     * @param ids 需要删除的提现模板主键
     * @return 结果
     */
    @Override
    public int deleteWithdrawalTemplateByIds(Long[] ids)
    {
        return withdrawalTemplateMapper.deleteWithdrawalTemplateByIds(ids);
    }

    /**
     * 删除提现模板信息
     * 
     * @param id 提现模板主键
     * @return 结果
     */
    @Override
    public int deleteWithdrawalTemplateById(Long id)
    {
        return withdrawalTemplateMapper.deleteWithdrawalTemplateById(id);
    }
}
