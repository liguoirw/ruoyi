package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.YkyTransationMapper;
import com.ruoyi.system.domain.YkyTransation;
import com.ruoyi.system.service.IYkyTransationService;

/**
 * 交易Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-02-18
 */
@Service
public class YkyTransationServiceImpl implements IYkyTransationService 
{
    @Autowired
    private YkyTransationMapper ykyTransationMapper;

    /**
     * 查询交易
     * 
     * @param transId 交易主键
     * @return 交易
     */
    @Override
    public YkyTransation selectYkyTransationByTransId(Long transId)
    {
        return ykyTransationMapper.selectYkyTransationByTransId(transId);
    }

    /**
     * 查询交易列表
     * 
     * @param ykyTransation 交易
     * @return 交易
     */
    @Override
    public List<YkyTransation> selectYkyTransationList(YkyTransation ykyTransation)
    {
        return ykyTransationMapper.selectYkyTransationList(ykyTransation);
    }

    /**
     * 新增交易
     * 
     * @param ykyTransation 交易
     * @return 结果
     */
    @Override
    public int insertYkyTransation(YkyTransation ykyTransation)
    {
        return ykyTransationMapper.insertYkyTransation(ykyTransation);
    }

    /**
     * 修改交易
     * 
     * @param ykyTransation 交易
     * @return 结果
     */
    @Override
    public int updateYkyTransation(YkyTransation ykyTransation)
    {
        return ykyTransationMapper.updateYkyTransation(ykyTransation);
    }

    /**
     * 批量删除交易
     * 
     * @param transIds 需要删除的交易主键
     * @return 结果
     */
    @Override
    public int deleteYkyTransationByTransIds(Long[] transIds)
    {
        return ykyTransationMapper.deleteYkyTransationByTransIds(transIds);
    }

    /**
     * 删除交易信息
     * 
     * @param transId 交易主键
     * @return 结果
     */
    @Override
    public int deleteYkyTransationByTransId(Long transId)
    {
        return ykyTransationMapper.deleteYkyTransationByTransId(transId);
    }
}
