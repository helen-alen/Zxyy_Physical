package com.ruoyi.project.system.brfpb.mapper;

import java.util.List;

import com.ruoyi.project.system.brfpb.domain.TBrfpb;

/**
 * 病人分配Mapper接口
 *
 * @author helen
 * @date 2023-04-21
 */
public interface TBrfpbMapper {
    /**
     * 查询病人分配
     *
     * @param brtjh 病人分配主键
     * @return 病人分配
     */
    public TBrfpb selectTBrfpbByBrtjh(String brtjh);

    /**
     * 查询病人分配
     *
     * @param czsj 病人分配操作时间
     * @return 病人分配信息
     */
    public TBrfpb selectTBrfpbByCzsj(String czsj);


    /**
     * 查询病人分配列表
     *
     * @param tBrfpb 病人分配
     * @return 病人分配集合
     */
    public List<TBrfpb> selectTBrfpbList(TBrfpb tBrfpb);

    /**
     * 新增病人分配
     *
     * @param tBrfpb 病人分配
     * @return 结果
     */
    public int insertTBrfpb(TBrfpb tBrfpb);

    /**
     * 修改病人分配
     *
     * @param tBrfpb 病人分配
     * @return 结果
     */
    public int updateTBrfpb(TBrfpb tBrfpb);

    /**
     * 删除病人分配
     *
     * @param brtjh 病人分配主键
     * @return 结果
     */
    public int deleteTBrfpbByBrtjh(String brtjh);

    /**
     * 批量删除病人分配
     *
     * @param brtjhs 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTBrfpbByBrtjhs(String[] brtjhs);
}
