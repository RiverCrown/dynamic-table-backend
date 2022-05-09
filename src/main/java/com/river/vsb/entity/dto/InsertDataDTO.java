package com.river.vsb.entity.dto;

import java.util.List;

public class InsertDataDTO {

    private String tableName;
    private List<ColumnValDTO> columnList;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<ColumnValDTO> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<ColumnValDTO> columnList) {
        this.columnList = columnList;
    }
}
