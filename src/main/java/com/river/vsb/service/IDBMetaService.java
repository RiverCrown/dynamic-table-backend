package com.river.vsb.service;


import com.river.vsb.entity.dto.ColumnDefDTO;
import com.river.vsb.entity.dto.ColumnValDTO;

import java.util.List;

public interface IDBMetaService {

    void createTable(String tableName, List<ColumnDefDTO> columnList);

    void alterColumn(String tableName, ColumnDefDTO column);

    int insertData(String tableName, List<ColumnValDTO> columnList);

    int updateData(String tableName, List<ColumnValDTO> columnList, List<ColumnValDTO> whereList);

    int deleteData(String tableName, List<ColumnValDTO> whereList);
}
