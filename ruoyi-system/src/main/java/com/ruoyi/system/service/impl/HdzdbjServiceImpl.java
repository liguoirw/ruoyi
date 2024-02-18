package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.HdzdbjMapper;
import com.ruoyi.system.domain.Hdzdbj;
import com.ruoyi.system.service.IHdzdbjService;

/**
 * 活动终端标记Service业务层处理
 * 
 * @author liguo
 * @date 2024-01-29
 */
@Service
public class HdzdbjServiceImpl implements IHdzdbjService 
{
    @Autowired
    private HdzdbjMapper hdzdbjMapper;

    /**
     * 查询活动终端标记
     * 
     * @param id 活动终端标记主键
     * @return 活动终端标记
     */
    @Override
    public Hdzdbj selectHdzdbjById(Long id)
    {
        return hdzdbjMapper.selectHdzdbjById(id);
    }

    /**
     * 查询活动终端标记列表
     * 
     * @param hdzdbj 活动终端标记
     * @return 活动终端标记
     */
    @Override
    public List<Hdzdbj> selectHdzdbjList(Hdzdbj hdzdbj)
    {
        return hdzdbjMapper.selectHdzdbjList(hdzdbj);
    }

    /**
     * 新增活动终端标记
     * 
     * @param hdzdbj 活动终端标记
     * @return 结果
     */
    @Override
    public int insertHdzdbj(Hdzdbj hdzdbj)
    {
        return hdzdbjMapper.insertHdzdbj(hdzdbj);
    }

    /**
     * 修改活动终端标记
     * 
     * @param hdzdbj 活动终端标记
     * @return 结果
     */
    @Override
    public int updateHdzdbj(Hdzdbj hdzdbj)
    {
        return hdzdbjMapper.updateHdzdbj(hdzdbj);
    }

    /**
     * 批量删除活动终端标记
     * 
     * @param ids 需要删除的活动终端标记主键
     * @return 结果
     */
    @Override
    public int deleteHdzdbjByIds(Long[] ids)
    {
        return hdzdbjMapper.deleteHdzdbjByIds(ids);
    }

    /**
     * 删除活动终端标记信息
     * 
     * @param id 活动终端标记主键
     * @return 结果
     */
    @Override
    public int deleteHdzdbjById(Long id)
    {
        return hdzdbjMapper.deleteHdzdbjById(id);
    }
}
