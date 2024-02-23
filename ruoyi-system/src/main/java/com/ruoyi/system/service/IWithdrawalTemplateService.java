package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.WithdrawalTemplate;

/**
 * 提现模板Service接口
 * 
 * @author ztc
 * @date 2024-02-22
 */
public interface IWithdrawalTemplateService 
{
    /**
     * 查询提现模板
     * 
     * @param id 提现模板主键
     * @return 提现模板
     */
    public WithdrawalTemplate selectWithdrawalTemplateById(Long id);

    /**
     * 查询提现模板列表
     * 
     * @param withdrawalTemplate 提现模板
     * @return 提现模板集合
     */
    public List<WithdrawalTemplate> selectWithdrawalTemplateList(WithdrawalTemplate withdrawalTemplate);

    /**
     * 新增提现模板
     * 
     * @param withdrawalTemplate 提现模板
     * @return 结果
     */
    public int insertWithdrawalTemplate(WithdrawalTemplate withdrawalTemplate);

    /**
     * 修改提现模板
     * 
     * @param withdrawalTemplate 提现模板
     * @return 结果
     */
    public int updateWithdrawalTemplate(WithdrawalTemplate withdrawalTemplate);

    /**
     * 批量删除提现模板
     * 
     * @param ids 需要删除的提现模板主键集合
     * @return 结果
     */
    public int deleteWithdrawalTemplateByIds(Long[] ids);

    /**
     * 删除提现模板信息
     * 
     * @param id 提现模板主键
     * @return 结果
     */
    public int deleteWithdrawalTemplateById(Long id);
}
