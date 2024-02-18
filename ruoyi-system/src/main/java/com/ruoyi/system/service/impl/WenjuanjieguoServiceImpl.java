package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WenjuanjieguoMapper;
import com.ruoyi.system.domain.Wenjuanjieguo;
import com.ruoyi.system.service.IWenjuanjieguoService;

/**
 * 问卷结果Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-12
 */
@Service
public class WenjuanjieguoServiceImpl implements IWenjuanjieguoService 
{
    @Autowired
    private WenjuanjieguoMapper wenjuanjieguoMapper;

    /**
     * 查询问卷结果
     * 
     * @param id 问卷结果主键
     * @return 问卷结果
     */
    @Override
    public Wenjuanjieguo selectWenjuanjieguoById(Long id)
    {
        return wenjuanjieguoMapper.selectWenjuanjieguoById(id);
    }

    /**
     * 查询问卷结果列表
     * 
     * @param wenjuanjieguo 问卷结果
     * @return 问卷结果
     */
    @Override
    public List<Wenjuanjieguo> selectWenjuanjieguoList(Wenjuanjieguo wenjuanjieguo)
    {
        return wenjuanjieguoMapper.selectWenjuanjieguoList(wenjuanjieguo);
    }

    /**
     * 新增问卷结果
     * 
     * @param wenjuanjieguo 问卷结果
     * @return 结果
     */
    @Override
    public int insertWenjuanjieguo(Wenjuanjieguo wenjuanjieguo)
    {
        return wenjuanjieguoMapper.insertWenjuanjieguo(wenjuanjieguo);
    }

    /**
     * 修改问卷结果
     * 
     * @param wenjuanjieguo 问卷结果
     * @return 结果
     */
    @Override
    public int updateWenjuanjieguo(Wenjuanjieguo wenjuanjieguo)
    {
        return wenjuanjieguoMapper.updateWenjuanjieguo(wenjuanjieguo);
    }

    /**
     * 批量删除问卷结果
     * 
     * @param ids 需要删除的问卷结果主键
     * @return 结果
     */
    @Override
    public int deleteWenjuanjieguoByIds(Long[] ids)
    {
        return wenjuanjieguoMapper.deleteWenjuanjieguoByIds(ids);
    }

    /**
     * 删除问卷结果信息
     * 
     * @param id 问卷结果主键
     * @return 结果
     */
    @Override
    public int deleteWenjuanjieguoById(Long id)
    {
        return wenjuanjieguoMapper.deleteWenjuanjieguoById(id);
    }
}
