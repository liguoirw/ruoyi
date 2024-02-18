package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Jytzfc;

/**
 * 交易通知返参Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-29
 */
public interface JytzfcMapper 
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
     * 删除交易通知返参
     * 
     * @param id 交易通知返参主键
     * @return 结果
     */
    public int deleteJytzfcById(Long id);

    /**
     * 批量删除交易通知返参
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteJytzfcByIds(Long[] ids);
}
