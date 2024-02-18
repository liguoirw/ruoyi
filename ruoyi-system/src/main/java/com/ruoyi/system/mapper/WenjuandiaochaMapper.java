package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Wenjuandiaocha;

/**
 * 信用卡申请大数据评估系统Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-11
 */
public interface WenjuandiaochaMapper 
{
    /**
     * 查询信用卡申请大数据评估系统
     * 
     * @param id 信用卡申请大数据评估系统主键
     * @return 信用卡申请大数据评估系统
     */
    public Wenjuandiaocha selectWenjuandiaochaById(Long id);

    /**
     * 查询信用卡申请大数据评估系统列表
     * 
     * @param wenjuandiaocha 信用卡申请大数据评估系统
     * @return 信用卡申请大数据评估系统集合
     */
    public List<Wenjuandiaocha> selectWenjuandiaochaList(Wenjuandiaocha wenjuandiaocha);

    /**
     * 新增信用卡申请大数据评估系统
     * 
     * @param wenjuandiaocha 信用卡申请大数据评估系统
     * @return 结果
     */
    public int insertWenjuandiaocha(Wenjuandiaocha wenjuandiaocha);

    /**
     * 修改信用卡申请大数据评估系统
     * 
     * @param wenjuandiaocha 信用卡申请大数据评估系统
     * @return 结果
     */
    public int updateWenjuandiaocha(Wenjuandiaocha wenjuandiaocha);

    /**
     * 删除信用卡申请大数据评估系统
     * 
     * @param id 信用卡申请大数据评估系统主键
     * @return 结果
     */
    public int deleteWenjuandiaochaById(Long id);

    /**
     * 批量删除信用卡申请大数据评估系统
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWenjuandiaochaByIds(Long[] ids);
}
