package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.YkyBrandMapper;
import com.ruoyi.system.domain.YkyBrand;
import com.ruoyi.system.service.IYkyBrandService;

/**
 * 品牌型号Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-02-19
 */
@Service
public class YkyBrandServiceImpl implements IYkyBrandService 
{
    @Autowired
    private YkyBrandMapper ykyBrandMapper;

    /**
     * 查询品牌型号
     * 
     * @param brandId 品牌型号主键
     * @return 品牌型号
     */
    @Override
    public YkyBrand selectYkyBrandByBrandId(Long brandId)
    {
        return ykyBrandMapper.selectYkyBrandByBrandId(brandId);
    }

    /**
     * 查询品牌型号列表
     * 
     * @param ykyBrand 品牌型号
     * @return 品牌型号
     */
    @Override
    public List<YkyBrand> selectYkyBrandList(YkyBrand ykyBrand)
    {
        return ykyBrandMapper.selectYkyBrandList(ykyBrand);
    }

    /**
     * 新增品牌型号
     * 
     * @param ykyBrand 品牌型号
     * @return 结果
     */
    @Override
    public int insertYkyBrand(YkyBrand ykyBrand)
    {
        return ykyBrandMapper.insertYkyBrand(ykyBrand);
    }

    /**
     * 修改品牌型号
     * 
     * @param ykyBrand 品牌型号
     * @return 结果
     */
    @Override
    public int updateYkyBrand(YkyBrand ykyBrand)
    {
        return ykyBrandMapper.updateYkyBrand(ykyBrand);
    }

    /**
     * 批量删除品牌型号
     * 
     * @param brandIds 需要删除的品牌型号主键
     * @return 结果
     */
    @Override
    public int deleteYkyBrandByBrandIds(Long[] brandIds)
    {
        return ykyBrandMapper.deleteYkyBrandByBrandIds(brandIds);
    }

    /**
     * 删除品牌型号信息
     * 
     * @param brandId 品牌型号主键
     * @return 结果
     */
    @Override
    public int deleteYkyBrandByBrandId(Long brandId)
    {
        return ykyBrandMapper.deleteYkyBrandByBrandId(brandId);
    }
}
