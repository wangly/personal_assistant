package com.fzu.pa.dao.mapper;

import com.fzu.pa.dao.domain.QALogDO;

public interface QALogMapper {
    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(QALogDO record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(QALogDO record);
}