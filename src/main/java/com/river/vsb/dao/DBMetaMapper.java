package com.river.vsb.dao;

import com.river.vsb.entity.po.ColumnDefPO;
import com.river.vsb.entity.po.ColumnValPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DBMetaMapper {

    void createTable(@Param("tableName") String tableName, @Param("columnList") List<ColumnDefPO> columnList);

    void alterColumn(@Param("tableName") String tableName, @Param("column") ColumnDefPO column);

    int insertData(@Param("tableName") String tableName, @Param("columnList") List<ColumnValPO> columnList);

    int updateData(@Param("tableName") String tableName, @Param("columnList") List<ColumnValPO> columnList,
                          @Param("whereList") List<ColumnValPO> whereList);

    int deleteData(@Param("tableName") String tableName, @Param("whereList") List<ColumnValPO> whereList);
}
