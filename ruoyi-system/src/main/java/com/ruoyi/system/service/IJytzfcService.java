package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Jytzfc;

/**
 * 交易通知返参Service接口
 * 
 * @author ruoyi
 * @date 2024-01-29
 */
public interface IJytzfcService 
{
    /**
     * 查询交易通知返参
     * 
     * @param id 交易通知返参主键
     * @return 交易通知返参
     */
    public Jytzfc selectJytzfcById(Long id);

    /**
     * 查询交易通知返参列表
     * 
     * @param jytzfc 交易通知返参
     * @return 交易通知返参集合
     */
    public List<Jytzfc> selectJytzfcList(Jytzfc jytzfc);

    /**
     * 新增交易通知返参
     * 
     * @param jytzfc 交易通知返参
     * @return 结果
     */
    public int insertJytzfc(Jytzfc jytzfc);

    /**
     * 修改交易通知返参
     * 
     * @param jytzfc 交易通知返参
     * @return 结果
     */
    public int updateJytzfc(Jytzfc jytzfc);

    /**
     * 批量删除交易通知返参
     * 
     * @param ids 需要删除的交易通知返参主键集合
     * @return 结果
     */
    public int deleteJytzfcByIds(Long[] ids);

    /**
     * 删除交易通知返参信息
     * 
     * @param id 交易通知返参主键
     * @return 结果
     */
    public int deleteJytzfcById(Long id);
}
