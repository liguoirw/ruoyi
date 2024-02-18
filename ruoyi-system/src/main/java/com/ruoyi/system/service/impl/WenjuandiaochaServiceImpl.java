package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WenjuandiaochaMapper;
import com.ruoyi.system.domain.Wenjuandiaocha;
import com.ruoyi.system.service.IWenjuandiaochaService;

/**
 * 信用卡申请大数据评估系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-11
 */
@Service
public class WenjuandiaochaServiceImpl implements IWenjuandiaochaService 
{
    @Autowired
    private WenjuandiaochaMapper wenjuandiaochaMapper;

    /**
     * 查询信用卡申请大数据评估系统
     * 
     * @param id 信用卡申请大数据评估系统主键
     * @return 信用卡申请大数据评估系统
     */
    @Override
    public Wenjuandiaocha selectWenjuandiaochaById(Long id)
    {
        return wenjuandiaochaMapper.selectWenjuandiaochaById(id);
    }

    /**
     * 查询信用卡申请大数据评估系统列表
     * 
     * @param wenjuandiaocha 信用卡申请大数据评估系统
     * @return 信用卡申请大数据评估系统
     */
    @Override
    public List<Wenjuandiaocha> selectWenjuandiaochaList(Wenjuandiaocha wenjuandiaocha)
    {
        return wenjuandiaochaMapper.selectWenjuandiaochaList(wenjuandiaocha);
    }

    /**
     * 新增信用卡申请大数据评估系统
     * 
     * @param wenjuandiaocha 信用卡申请大数据评估系统
     * @return 结果
     */
    @Override
    public int insertWenjuandiaocha(Wenjuandiaocha wenjuandiaocha)
    {
        return wenjuandiaochaMapper.insertWenjuandiaocha(wenjuandiaocha);
    }

    /**
     * 修改信用卡申请大数据评估系统
     * 
     * @param wenjuandiaocha 信用卡申请大数据评估系统
     * @return 结果
     */
    @Override
    public int updateWenjuandiaocha(Wenjuandiaocha wenjuandiaocha)
    {
        return wenjuandiaochaMapper.updateWenjuandiaocha(wenjuandiaocha);
    }

    /**
     * 批量删除信用卡申请大数据评估系统
     * 
     * @param ids 需要删除的信用卡申请大数据评估系统主键
     * @return 结果
     */
    @Override
    public int deleteWenjuandiaochaByIds(Long[] ids)
    {
        return wenjuandiaochaMapper.deleteWenjuandiaochaByIds(ids);
    }

    /**
     * 删除信用卡申请大数据评估系统信息
     * 
     * @param id 信用卡申请大数据评估系统主键
     * @return 结果
     */
    @Override
    public int deleteWenjuandiaochaById(Long id)
    {
        return wenjuandiaochaMapper.deleteWenjuandiaochaById(id);
    }
}
