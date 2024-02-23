package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.YkyTransation;

/**
 * 交易Service接口
 * 
 * @author ruoyi
 * @date 2024-02-18
 */
public interface IYkyTransationService 
{
    /**
     * 查询交易
     * 
     * @param transId 交易主键
     * @return 交易
     */
    public YkyTransation selectYkyTransationByTransId(Long transId);

    /**
     * 查询交易列表
     * 
     * @param ykyTransation 交易
     * @return 交易集合
     */
    public List<YkyTransation> selectYkyTransationList(YkyTransation ykyTransation);

    /**
     * 新增交易
     * 
     * @param ykyTransation 交易
     * @return 结果
     */
    public int insertYkyTransation(YkyTransation ykyTransation);

    /**
     * 修改交易
     * 
     * @param ykyTransation 交易
     * @return 结果
     */
    public int updateYkyTransation(YkyTransation ykyTransation);

    /**
     * 批量删除交易
     * 
     * @param transIds 需要删除的交易主键集合
     * @return 结果
     */
    public int deleteYkyTransationByTransIds(Long[] transIds);

    /**
     * 删除交易信息
     * 
     * @param transId 交易主键
     * @return 结果
     */
    public int deleteYkyTransationByTransId(Long transId);
}
