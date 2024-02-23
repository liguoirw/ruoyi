package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.YkyBrand;

/**
 * 品牌型号Mapper接口
 * 
 * @author ruoyi
 * @date 2024-02-19
 */
public interface YkyBrandMapper 
{
    /**
     * 查询品牌型号
     * 
     * @param brandId 品牌型号主键
     * @return 品牌型号
     */
    public YkyBrand selectYkyBrandByBrandId(Long brandId);

    /**
     * 查询品牌型号列表
     * 
     * @param ykyBrand 品牌型号
     * @return 品牌型号集合
     */
    public List<YkyBrand> selectYkyBrandList(YkyBrand ykyBrand);

    /**
     * 新增品牌型号
     * 
     * @param ykyBrand 品牌型号
     * @return 结果
     */
    public int insertYkyBrand(YkyBrand ykyBrand);

    /**
     * 修改品牌型号
     * 
     * @param ykyBrand 品牌型号
     * @return 结果
     */
    public int updateYkyBrand(YkyBrand ykyBrand);

    /**
     * 删除品牌型号
     * 
     * @param brandId 品牌型号主键
     * @return 结果
     */
    public int deleteYkyBrandByBrandId(Long brandId);

    /**
     * 批量删除品牌型号
     * 
     * @param brandIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteYkyBrandByBrandIds(Long[] brandIds);
}
