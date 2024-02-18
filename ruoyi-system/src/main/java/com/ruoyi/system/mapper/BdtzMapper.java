package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Bdtz;

/**
 * 绑机通知Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-29
 */
public interface BdtzMapper 
{
    /**
     * 查询绑机通知
     * 
     * @param id 绑机通知主键
     * @return 绑机通知
     */
    public Bdtz selectBdtzById(Long id);

    /**
     * 查询绑机通知列表
     * 
     * @param bdtz 绑机通知
     * @return 绑机通知集合
     */
    public List<Bdtz> selectBdtzList(Bdtz bdtz);

    /**
     * 新增绑机通知
     * 
     * @param bdtz 绑机通知
     * @return 结果
     */
    public int insertBdtz(Bdtz bdtz);

    /**
     * 修改绑机通知
     * 
     * @param bdtz 绑机通知
     * @return 结果
     */
    public int updateBdtz(Bdtz bdtz);

    /**
     * 删除绑机通知
     * 
     * @param id 绑机通知主键
     * @return 结果
     */
    public int deleteBdtzById(Long id);

    /**
     * 批量删除绑机通知
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBdtzByIds(Long[] ids);
}
