package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CeshiMapper;
import com.ruoyi.system.domain.Ceshi;
import com.ruoyi.system.service.ICeshiService;

/**
 * 测试Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-15
 */
@Service
public class CeshiServiceImpl implements ICeshiService 
{
    @Autowired
    private CeshiMapper ceshiMapper;

    /**
     * 查询测试
     * 
     * @param id 测试主键
     * @return 测试
     */
    @Override
    public Ceshi selectCeshiById(Long id)
    {
        return ceshiMapper.selectCeshiById(id);
    }

    /**
     * 查询测试列表
     * 
     * @param ceshi 测试
     * @return 测试
     */
    @Override
    public List<Ceshi> selectCeshiList(Ceshi ceshi)
    {
        return ceshiMapper.selectCeshiList(ceshi);
    }

    /**
     * 新增测试
     * 
     * @param ceshi 测试
     * @return 结果
     */
    @Override
    public int insertCeshi(Ceshi ceshi)
    {
        return ceshiMapper.insertCeshi(ceshi);
    }

    /**
     * 修改测试
     * 
     * @param ceshi 测试
     * @return 结果
     */
    @Override
    public int updateCeshi(Ceshi ceshi)
    {
        return ceshiMapper.updateCeshi(ceshi);
    }

    /**
     * 批量删除测试
     * 
     * @param ids 需要删除的测试主键
     * @return 结果
     */
    @Override
    public int deleteCeshiByIds(Long[] ids)
    {
        return ceshiMapper.deleteCeshiByIds(ids);
    }

    /**
     * 删除测试信息
     * 
     * @param id 测试主键
     * @return 结果
     */
    @Override
    public int deleteCeshiById(Long id)
    {
        return ceshiMapper.deleteCeshiById(id);
    }
}
