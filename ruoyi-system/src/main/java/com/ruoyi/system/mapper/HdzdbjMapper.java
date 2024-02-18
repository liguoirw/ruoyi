package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Hdzdbj;

/**
 * 活动终端标记Mapper接口
 * 
 * @author liguo
 * @date 2024-01-29
 */
public interface HdzdbjMapper 
{
    /**
     * 查询活动终端标记
     * 
     * @param id 活动终端标记主键
     * @return 活动终端标记
     */
    public Hdzdbj selectHdzdbjById(Long id);

    /**
     * 查询活动终端标记列表
     * 
     * @param hdzdbj 活动终端标记
     * @return 活动终端标记集合
     */
    public List<Hdzdbj> selectHdzdbjList(Hdzdbj hdzdbj);

    /**
     * 新增活动终端标记
     * 
     * @param hdzdbj 活动终端标记
     * @return 结果
     */
    public int insertHdzdbj(Hdzdbj hdzdbj);

    /**
     * 修改活动终端标记
     * 
     * @param hdzdbj 活动终端标记
     * @return 结果
     */
    public int updateHdzdbj(Hdzdbj hdzdbj);

    /**
     * 删除活动终端标记
     * 
     * @param id 活动终端标记主键
     * @return 结果
     */
    public int deleteHdzdbjById(Long id);

    /**
     * 批量删除活动终端标记
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHdzdbjByIds(Long[] ids);
}
