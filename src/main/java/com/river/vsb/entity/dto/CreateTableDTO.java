package com.river.vsb.entity.dto;

import java.util.List;

public class CreateTableDTO {

    private String tableName;
    private List<ColumnDefDTO> columnList;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<ColumnDefDTO> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<ColumnDefDTO> columnList) {
        this.columnList = columnList;
    }
}
