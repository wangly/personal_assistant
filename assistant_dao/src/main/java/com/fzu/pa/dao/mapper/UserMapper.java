package com.fzu.pa.dao.mapper;

import com.fzu.pa.dao.domain.UserDO;
import com.fzu.pa.dao.domain.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(UserExample example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(UserExample example);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(UserDO record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(UserDO record);

    /**
     * 根据条件查询记录集
     */
    List<UserDO> selectByExampleWithBLOBs(UserExample example);

    /**
     * 根据条件查询记录集
     */
    List<UserDO> selectByExample(UserExample example);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") UserDO record, @Param("example") UserExample example);

    /**
     * 根据条件更新记录
     */
    int updateByExampleWithBLOBs(@Param("record") UserDO record, @Param("example") UserExample example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") UserDO record, @Param("example") UserExample example);
}