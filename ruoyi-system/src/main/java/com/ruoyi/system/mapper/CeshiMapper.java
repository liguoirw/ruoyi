package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Ceshi;

/**
 * 测试Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-15
 */
public interface CeshiMapper 
{
    /**
     * 查询测试
     * 
     * @param id 测试主键
     * @return 测试
     */
    public Ceshi selectCeshiById(Long id);

    /**
     * 查询测试列表
     * 
     * @param ceshi 测试
     * @return 测试集合
     */
    public List<Ceshi> selectCeshiList(Ceshi ceshi);

    /**
     * 新增测试
     * 
     * @param ceshi 测试
     * @return 结果
     */
    public int insertCeshi(Ceshi ceshi);

    /**
     * 修改测试
     * 
     * @param ceshi 测试
     * @return 结果
     */
    public int updateCeshi(Ceshi ceshi);

    /**
     * 删除测试
     * 
     * @param id 测试主键
     * @return 结果
     */
    public int deleteCeshiById(Long id);

    /**
     * 批量删除测试
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCeshiByIds(Long[] ids);
}
