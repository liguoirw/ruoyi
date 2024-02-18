package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Shoujiceshi;

/**
 * shoujiceshiMapper接口
 * 
 * @author ruoyi
 * @date 2024-01-05
 */
public interface ShoujiceshiMapper 
{
    /**
     * 查询shoujiceshi
     * 
     * @param id shoujiceshi主键
     * @return shoujiceshi
     */
    public Shoujiceshi selectShoujiceshiById(Long id);

    /**
     * 查询shoujiceshi列表
     * 
     * @param shoujiceshi shoujiceshi
     * @return shoujiceshi集合
     */
    public List<Shoujiceshi> selectShoujiceshiList(Shoujiceshi shoujiceshi);

    /**
     * 新增shoujiceshi
     * 
     * @param shoujiceshi shoujiceshi
     * @return 结果
     */
    public int insertShoujiceshi(Shoujiceshi shoujiceshi);

    /**
     * 修改shoujiceshi
     * 
     * @param shoujiceshi shoujiceshi
     * @return 结果
     */
    public int updateShoujiceshi(Shoujiceshi shoujiceshi);

    /**
     * 删除shoujiceshi
     * 
     * @param id shoujiceshi主键
     * @return 结果
     */
    public int deleteShoujiceshiById(Long id);

    /**
     * 批量删除shoujiceshi
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShoujiceshiByIds(Long[] ids);
}
