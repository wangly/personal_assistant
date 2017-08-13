package com.fzu.pa.dao.mapper;

import com.fzu.pa.dao.domain.KnowledgeDO;
import com.fzu.pa.dao.domain.KnowledgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KnowledgeMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(KnowledgeExample example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(KnowledgeExample example);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(KnowledgeDO record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(KnowledgeDO record);

    /**
     * 根据条件查询记录集
     */
    List<KnowledgeDO> selectByExampleWithBLOBs(KnowledgeExample example);

    /**
     * 根据条件查询记录集
     */
    List<KnowledgeDO> selectByExample(KnowledgeExample example);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") KnowledgeDO record, @Param("example") KnowledgeExample example);

    /**
     * 根据条件更新记录
     */
    int updateByExampleWithBLOBs(@Param("record") KnowledgeDO record, @Param("example") KnowledgeExample example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") KnowledgeDO record, @Param("example") KnowledgeExample example);
}