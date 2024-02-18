package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.Ceshi1Mapper;
import com.ruoyi.system.domain.Ceshi1;
import com.ruoyi.system.service.ICeshi1Service;

/**
 * tupianService业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-15
 */
@Service
public class Ceshi1ServiceImpl implements ICeshi1Service 
{
    @Autowired
    private Ceshi1Mapper ceshi1Mapper;

    /**
     * 查询tupian
     * 
     * @param id tupian主键
     * @return tupian
     */
    @Override
    public Ceshi1 selectCeshi1ById(Long id)
    {
        return ceshi1Mapper.selectCeshi1ById(id);
    }

    /**
     * 查询tupian列表
     * 
     * @param ceshi1 tupian
     * @return tupian
     */
    @Override
    public List<Ceshi1> selectCeshi1List(Ceshi1 ceshi1)
    {
        return ceshi1Mapper.selectCeshi1List(ceshi1);
    }

    /**
     * 新增tupian
     * 
     * @param ceshi1 tupian
     * @return 结果
     */
    @Override
    public int insertCeshi1(Ceshi1 ceshi1)
    {
        return ceshi1Mapper.insertCeshi1(ceshi1);
    }

    /**
     * 修改tupian
     * 
     * @param ceshi1 tupian
     * @return 结果
     */
    @Override
    public int updateCeshi1(Ceshi1 ceshi1)
    {
        return ceshi1Mapper.updateCeshi1(ceshi1);
    }

    /**
     * 批量删除tupian
     * 
     * @param ids 需要删除的tupian主键
     * @return 结果
     */
    @Override
    public int deleteCeshi1ByIds(Long[] ids)
    {
        return ceshi1Mapper.deleteCeshi1ByIds(ids);
    }

    /**
     * 删除tupian信息
     * 
     * @param id tupian主键
     * @return 结果
     */
    @Override
    public int deleteCeshi1ById(Long id)
    {
        return ceshi1Mapper.deleteCeshi1ById(id);
    }
}
