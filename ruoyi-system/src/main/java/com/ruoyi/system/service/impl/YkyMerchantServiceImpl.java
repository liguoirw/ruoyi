package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.YkyMerchantMapper;
import com.ruoyi.system.domain.YkyMerchant;
import com.ruoyi.system.service.IYkyMerchantService;

/**
 * 商户Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-02-02
 */
@Service
public class YkyMerchantServiceImpl implements IYkyMerchantService 
{
    @Autowired
    private YkyMerchantMapper ykyMerchantMapper;

    /**
     * 查询商户
     * 
     * @param merchantId 商户主键
     * @return 商户
     */
    @Override
    public YkyMerchant selectYkyMerchantByMerchantId(Long merchantId)
    {
        return ykyMerchantMapper.selectYkyMerchantByMerchantId(merchantId);
    }

    /**
     * 查询商户列表
     * 
     * @param ykyMerchant 商户
     * @return 商户
     */
    @Override
    public List<YkyMerchant> selectYkyMerchantList(YkyMerchant ykyMerchant)
    {
        return ykyMerchantMapper.selectYkyMerchantList(ykyMerchant);
    }

    /**
     * 新增商户
     * 
     * @param ykyMerchant 商户
     * @return 结果
     */
    @Override
    public int insertYkyMerchant(YkyMerchant ykyMerchant)
    {
        return ykyMerchantMapper.insertYkyMerchant(ykyMerchant);
    }

    /**
     * 修改商户
     * 
     * @param ykyMerchant 商户
     * @return 结果
     */
    @Override
    public int updateYkyMerchant(YkyMerchant ykyMerchant)
    {
        return ykyMerchantMapper.updateYkyMerchant(ykyMerchant);
    }

    /**
     * 批量删除商户
     * 
     * @param merchantIds 需要删除的商户主键
     * @return 结果
     */
    @Override
    public int deleteYkyMerchantByMerchantIds(Long[] merchantIds)
    {
        return ykyMerchantMapper.deleteYkyMerchantByMerchantIds(merchantIds);
    }

    /**
     * 删除商户信息
     * 
     * @param merchantId 商户主键
     * @return 结果
     */
    @Override
    public int deleteYkyMerchantByMerchantId(Long merchantId)
    {
        return ykyMerchantMapper.deleteYkyMerchantByMerchantId(merchantId);
    }
}
