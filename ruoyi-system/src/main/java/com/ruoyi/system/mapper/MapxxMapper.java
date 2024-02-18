package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Mapxx;

/**
 * 地图信息Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-11
 */
public interface MapxxMapper 
{
    /**
     * 查询地图信息
     * 
     * @param id 地图信息主键
     * @return 地图信息
     */
    public Mapxx selectMapxxById(Long id);

    /**
     * 查询地图信息列表
     * 
     * @param mapxx 地图信息
     * @return 地图信息集合
     */
    public List<Mapxx> selectMapxxList(Mapxx mapxx);

    /**
     * 新增地图信息
     * 
     * @param mapxx 地图信息
     * @return 结果
     */
    public int insertMapxx(Mapxx mapxx);

    /**
     * 修改地图信息
     * 
     * @param mapxx 地图信息
     * @return 结果
     */
    public int updateMapxx(Mapxx mapxx);

    /**
     * 删除地图信息
     * 
     * @param id 地图信息主键
     * @return 结果
     */
    public int deleteMapxxById(Long id);

    /**
     * 批量删除地图信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMapxxByIds(Long[] ids);
}
