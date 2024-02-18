package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Ceshi1;

/**
 * tupianService接口
 * 
 * @author ruoyi
 * @date 2024-01-15
 */
public interface ICeshi1Service 
{
    /**
     * 查询tupian
     * 
     * @param id tupian主键
     * @return tupian
     */
    public Ceshi1 selectCeshi1ById(Long id);

    /**
     * 查询tupian列表
     * 
     * @param ceshi1 tupian
     * @return tupian集合
     */
    public List<Ceshi1> selectCeshi1List(Ceshi1 ceshi1);

    /**
     * 新增tupian
     * 
     * @param ceshi1 tupian
     * @return 结果
     */
    public int insertCeshi1(Ceshi1 ceshi1);

    /**
     * 修改tupian
     * 
     * @param ceshi1 tupian
     * @return 结果
     */
    public int updateCeshi1(Ceshi1 ceshi1);

    /**
     * 批量删除tupian
     * 
     * @param ids 需要删除的tupian主键集合
     * @return 结果
     */
    public int deleteCeshi1ByIds(Long[] ids);

    /**
     * 删除tupian信息
     * 
     * @param id tupian主键
     * @return 结果
     */
    public int deleteCeshi1ById(Long id);
}
