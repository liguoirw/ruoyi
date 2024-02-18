package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.YkyMerchant;

/**
 * 商户Mapper接口
 * 
 * @author ruoyi
 * @date 2024-02-02
 */
public interface YkyMerchantMapper 
{
    /**
     * 查询商户
     * 
     * @param merchantId 商户主键
     * @return 商户
     */
    public YkyMerchant selectYkyMerchantByMerchantId(Long merchantId);

    /**
     * 查询商户列表
     * 
     * @param ykyMerchant 商户
     * @return 商户集合
     */
    public List<YkyMerchant> selectYkyMerchantList(YkyMerchant ykyMerchant);

    /**
     * 新增商户
     * 
     * @param ykyMerchant 商户
     * @return 结果
     */
    public int insertYkyMerchant(YkyMerchant ykyMerchant);

    /**
     * 修改商户
     * 
     * @param ykyMerchant 商户
     * @return 结果
     */
    public int updateYkyMerchant(YkyMerchant ykyMerchant);

    /**
     * 删除商户
     * 
     * @param merchantId 商户主键
     * @return 结果
     */
    public int deleteYkyMerchantByMerchantId(Long merchantId);

    /**
     * 批量删除商户
     * 
     * @param merchantIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteYkyMerchantByMerchantIds(Long[] merchantIds);
}
