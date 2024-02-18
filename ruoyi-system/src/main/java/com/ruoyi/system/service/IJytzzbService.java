package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Jytzzb;

/**
 * 交易通知子Service接口
 * 
 * @author ruoyi
 * @date 2024-01-29
 */
public interface IJytzzbService 
{
    /**
     * 查询交易通知子
     * 
     * @param id 交易通知子主键
     * @return 交易通知子
     */
    public Jytzzb selectJytzzbById(Long id);

    /**
     * 查询交易通知子列表
     * 
     * @param jytzzb 交易通知子
     * @return 交易通知子集合
     */
    public List<Jytzzb> selectJytzzbList(Jytzzb jytzzb);

    /**
     * 新增交易通知子
     * 
     * @param jytzzb 交易通知子
     * @return 结果
     */
    public int insertJytzzb(Jytzzb jytzzb);

    /**
     * 修改交易通知子
     * 
     * @param jytzzb 交易通知子
     * @return 结果
     */
    public int updateJytzzb(Jytzzb jytzzb);

    /**
     * 批量删除交易通知子
     * 
     * @param ids 需要删除的交易通知子主键集合
     * @return 结果
     */
    public int deleteJytzzbByIds(Long[] ids);

    /**
     * 删除交易通知子信息
     * 
     * @param id 交易通知子主键
     * @return 结果
     */
    public int deleteJytzzbById(Long id);
}
