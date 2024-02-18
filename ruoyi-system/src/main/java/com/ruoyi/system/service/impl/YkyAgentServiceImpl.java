package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.YkyAgentMapper;
import com.ruoyi.system.domain.YkyAgent;
import com.ruoyi.system.service.IYkyAgentService;

/**
 * 代理商Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-02-01
 */
@Service
public class YkyAgentServiceImpl implements IYkyAgentService 
{
    @Autowired
    private YkyAgentMapper ykyAgentMapper;

    /**
     * 查询代理商
     * 
     * @param id 代理商主键
     * @return 代理商
     */
    @Override
    public YkyAgent selectYkyAgentById(Long id)
    {
        return ykyAgentMapper.selectYkyAgentById(id);
    }

    /**
     * 查询代理商列表
     * 
     * @param ykyAgent 代理商
     * @return 代理商
     */
    @Override
    public List<YkyAgent> selectYkyAgentList(YkyAgent ykyAgent)
    {
        return ykyAgentMapper.selectYkyAgentList(ykyAgent);
    }

    /**
     * 新增代理商
     * 
     * @param ykyAgent 代理商
     * @return 结果
     */
    @Override
    public int insertYkyAgent(YkyAgent ykyAgent)
    {
        return ykyAgentMapper.insertYkyAgent(ykyAgent);
    }

    /**
     * 修改代理商
     * 
     * @param ykyAgent 代理商
     * @return 结果
     */
    @Override
    public int updateYkyAgent(YkyAgent ykyAgent)
    {
        return ykyAgentMapper.updateYkyAgent(ykyAgent);
    }

    /**
     * 批量删除代理商
     * 
     * @param ids 需要删除的代理商主键
     * @return 结果
     */
    @Override
    public int deleteYkyAgentByIds(Long[] ids)
    {
        return ykyAgentMapper.deleteYkyAgentByIds(ids);
    }

    /**
     * 删除代理商信息
     * 
     * @param id 代理商主键
     * @return 结果
     */
    @Override
    public int deleteYkyAgentById(Long id)
    {
        return ykyAgentMapper.deleteYkyAgentById(id);
    }

    /**
     * 查询上级代理商列表
     *
     * @param promotionNo 推广号码
     * @return 上级代理商
     */
    @Override
    public YkyAgent selectAgentByProNo(String promotionNo)
    {
        return ykyAgentMapper.selectAgentByProNo(promotionNo);
    }
}
