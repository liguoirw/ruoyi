package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Shoujiceshi;

/**
 * shoujiceshiService接口
 * 
 * @author ruoyi
 * @date 2024-01-05
 */
public interface IShoujiceshiService 
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
     * 批量删除shoujiceshi
     * 
     * @param ids 需要删除的shoujiceshi主键集合
     * @return 结果
     */
    public int deleteShoujiceshiByIds(Long[] ids);

    /**
     * 删除shoujiceshi信息
     * 
     * @param id shoujiceshi主键
     * @return 结果
     */
    public int deleteShoujiceshiById(Long id);
}
