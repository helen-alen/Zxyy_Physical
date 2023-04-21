package com.ruoyi.project.system.brfpb.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.brfpb.mapper.TBrfpbMapper;
import com.ruoyi.project.system.brfpb.domain.TBrfpb;
import com.ruoyi.project.system.brfpb.service.ITBrfpbService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 病人分配Service业务层处理
 * 
 * @author helen
 * @date 2023-04-21
 */
@Service
public class TBrfpbServiceImpl implements ITBrfpbService 
{
    @Autowired
    private TBrfpbMapper tBrfpbMapper;

    /**
     * 查询病人分配
     * 
     * @param brtjh 病人分配主键
     * @return 病人分配
     */
    @Override
    public TBrfpb selectTBrfpbByBrtjh(String brtjh)
    {
        return tBrfpbMapper.selectTBrfpbByBrtjh(brtjh);
    }

    /**
     * 查询病人分配列表
     * 
     * @param tBrfpb 病人分配
     * @return 病人分配
     */
    @Override
    public List<TBrfpb> selectTBrfpbList(TBrfpb tBrfpb)
    {
        return tBrfpbMapper.selectTBrfpbList(tBrfpb);
    }

    /**
     * 新增病人分配
     * 
     * @param tBrfpb 病人分配
     * @return 结果
     */
    @Override
    public int insertTBrfpb(TBrfpb tBrfpb)
    {
        return tBrfpbMapper.insertTBrfpb(tBrfpb);
    }

    /**
     * 修改病人分配
     * 
     * @param tBrfpb 病人分配
     * @return 结果
     */
    @Override
    public int updateTBrfpb(TBrfpb tBrfpb)
    {
        return tBrfpbMapper.updateTBrfpb(tBrfpb);
    }

    /**
     * 批量删除病人分配
     * 
     * @param brtjhs 需要删除的病人分配主键
     * @return 结果
     */
    @Override
    public int deleteTBrfpbByBrtjhs(String brtjhs)
    {
        return tBrfpbMapper.deleteTBrfpbByBrtjhs(Convert.toStrArray(brtjhs));
    }

    /**
     * 删除病人分配信息
     * 
     * @param brtjh 病人分配主键
     * @return 结果
     */
    @Override
    public int deleteTBrfpbByBrtjh(String brtjh)
    {
        return tBrfpbMapper.deleteTBrfpbByBrtjh(brtjh);
    }
}
