package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.YkyAgent;

/**
 * 代理商Service接口
 * 
 * @author ruoyi
 * @date 2024-02-01
 */
public interface IYkyAgentService 
{
    /**
     * 查询代理商
     * 
     * @param id 代理商主键
     * @return 代理商
     */
    public YkyAgent selectYkyAgentById(Long id);

    /**
     * 查询代理商列表
     * 
     * @param ykyAgent 代理商
     * @return 代理商集合
     */
    public List<YkyAgent> selectYkyAgentList(YkyAgent ykyAgent);

    /**
     * 新增代理商
     * 
     * @param ykyAgent 代理商
     * @return 结果
     */
    public int insertYkyAgent(YkyAgent ykyAgent);

    /**
     * 修改代理商
     * 
     * @param ykyAgent 代理商
     * @return 结果
     */
    public int updateYkyAgent(YkyAgent ykyAgent);

    /**
     * 批量删除代理商
     * 
     * @param ids 需要删除的代理商主键集合
     * @return 结果
     */
    public int deleteYkyAgentByIds(Long[] ids);

    /**
     * 删除代理商信息
     * 
     * @param id 代理商主键
     * @return 结果
     */
    public int deleteYkyAgentById(Long id);

    /**
     * 查询上级代理商
     *
     * @param promotionNo 推广号码
     * @return 上级代理商
     */
    public YkyAgent selectAgentByProNo(String promotionNo);
}
