package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Wenjuanjieguo;

/**
 * 问卷结果Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-12
 */
public interface WenjuanjieguoMapper 
{
    /**
     * 查询问卷结果
     * 
     * @param id 问卷结果主键
     * @return 问卷结果
     */
    public Wenjuanjieguo selectWenjuanjieguoById(Long id);

    /**
     * 查询问卷结果列表
     * 
     * @param wenjuanjieguo 问卷结果
     * @return 问卷结果集合
     */
    public List<Wenjuanjieguo> selectWenjuanjieguoList(Wenjuanjieguo wenjuanjieguo);

    /**
     * 新增问卷结果
     * 
     * @param wenjuanjieguo 问卷结果
     * @return 结果
     */
    public int insertWenjuanjieguo(Wenjuanjieguo wenjuanjieguo);

    /**
     * 修改问卷结果
     * 
     * @param wenjuanjieguo 问卷结果
     * @return 结果
     */
    public int updateWenjuanjieguo(Wenjuanjieguo wenjuanjieguo);

    /**
     * 删除问卷结果
     * 
     * @param id 问卷结果主键
     * @return 结果
     */
    public int deleteWenjuanjieguoById(Long id);

    /**
     * 批量删除问卷结果
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWenjuanjieguoByIds(Long[] ids);
}
