package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ShoujiceshiMapper;
import com.ruoyi.system.domain.Shoujiceshi;
import com.ruoyi.system.service.IShoujiceshiService;

/**
 * shoujiceshiService业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-05
 */
@Service
public class ShoujiceshiServiceImpl implements IShoujiceshiService 
{
    @Autowired
    private ShoujiceshiMapper shoujiceshiMapper;

    /**
     * 查询shoujiceshi
     * 
     * @param id shoujiceshi主键
     * @return shoujiceshi
     */
    @Override
    public Shoujiceshi selectShoujiceshiById(Long id)
    {
        return shoujiceshiMapper.selectShoujiceshiById(id);
    }

    /**
     * 查询shoujiceshi列表
     * 
     * @param shoujiceshi shoujiceshi
     * @return shoujiceshi
     */
    @Override
    public List<Shoujiceshi> selectShoujiceshiList(Shoujiceshi shoujiceshi)
    {
        return shoujiceshiMapper.selectShoujiceshiList(shoujiceshi);
    }

    /**
     * 新增shoujiceshi
     * 
     * @param shoujiceshi shoujiceshi
     * @return 结果
     */
    @Override
    public int insertShoujiceshi(Shoujiceshi shoujiceshi)
    {
        return shoujiceshiMapper.insertShoujiceshi(shoujiceshi);
    }

    /**
     * 修改shoujiceshi
     * 
     * @param shoujiceshi shoujiceshi
     * @return 结果
     */
    @Override
    public int updateShoujiceshi(Shoujiceshi shoujiceshi)
    {
        return shoujiceshiMapper.updateShoujiceshi(shoujiceshi);
    }

    /**
     * 批量删除shoujiceshi
     * 
     * @param ids 需要删除的shoujiceshi主键
     * @return 结果
     */
    @Override
    public int deleteShoujiceshiByIds(Long[] ids)
    {
        return shoujiceshiMapper.deleteShoujiceshiByIds(ids);
    }

    /**
     * 删除shoujiceshi信息
     * 
     * @param id shoujiceshi主键
     * @return 结果
     */
    @Override
    public int deleteShoujiceshiById(Long id)
    {
        return shoujiceshiMapper.deleteShoujiceshiById(id);
    }
}
