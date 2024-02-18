package com.ruoyi.system.service.impl.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.MapxxMapper;
import com.ruoyi.system.domain.Mapxx;
import com.ruoyi.system.service.IMapxxService;

/**
 * 地图信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-11
 */
@Service
public class MapxxServiceImpl implements IMapxxService 
{
    @Autowired
    private MapxxMapper mapxxMapper;

    /**
     * 查询地图信息
     * 
     * @param id 地图信息主键
     * @return 地图信息
     */
    @Override
    public Mapxx selectMapxxById(Long id)
    {
        return mapxxMapper.selectMapxxById(id);
    }

    /**
     * 查询地图信息列表
     * 
     * @param mapxx 地图信息
     * @return 地图信息
     */
    @Override
    public List<Mapxx> selectMapxxList(Mapxx mapxx)
    {
        return mapxxMapper.selectMapxxList(mapxx);
    }

    /**
     * 新增地图信息
     * 
     * @param mapxx 地图信息
     * @return 结果
     */
    @Override
    public int insertMapxx(Mapxx mapxx)
    {
        return mapxxMapper.insertMapxx(mapxx);
    }

    /**
     * 修改地图信息
     * 
     * @param mapxx 地图信息
     * @return 结果
     */
    @Override
    public int updateMapxx(Mapxx mapxx)
    {
        return mapxxMapper.updateMapxx(mapxx);
    }

    /**
     * 批量删除地图信息
     * 
     * @param ids 需要删除的地图信息主键
     * @return 结果
     */
    @Override
    public int deleteMapxxByIds(Long[] ids)
    {
        return mapxxMapper.deleteMapxxByIds(ids);
    }

    /**
     * 删除地图信息信息
     * 
     * @param id 地图信息主键
     * @return 结果
     */
    @Override
    public int deleteMapxxById(Long id)
    {
        return mapxxMapper.deleteMapxxById(id);
    }
}
