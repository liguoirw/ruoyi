package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Jytzz;

/**
 * 交易通知主Service接口
 * 
 * @author ruoyi
 * @date 2024-01-29
 */
public interface IJytzzService 
{
    /**
     * 查询交易通知主
     * 
     * @param id 交易通知主主键
     * @return 交易通知主
     */
    public Jytzz selectJytzzById(Long id);

    /**
     * 查询交易通知主列表
     * 
     * @param jytzz 交易通知主
     * @return 交易通知主集合
     */
    public List<Jytzz> selectJytzzList(Jytzz jytzz);
    public List<Jytzz> selectJytzzListzx(Jytzz jytzz);

    /**
     * 新增交易通知主
     * 
     * @param jytzz 交易通知主
     * @return 结果
     */
    public int insertJytzz(Jytzz jytzz);

    /**
     * 修改交易通知主
     * 
     * @param jytzz 交易通知主
     * @return 结果
     */
    public int updateJytzz(Jytzz jytzz);

    /**
     * 批量删除交易通知主
     * 
     * @param ids 需要删除的交易通知主主键集合
     * @return 结果
     */
    public int deleteJytzzByIds(Long[] ids);

    /**
     * 删除交易通知主信息
     * 
     * @param id 交易通知主主键
     * @return 结果
     */
    public int deleteJytzzById(Long id);
}
