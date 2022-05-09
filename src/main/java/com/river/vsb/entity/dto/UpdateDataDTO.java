package com.river.vsb.entity.dto;

import java.util.List;

public class UpdateDataDTO {

    private String tableName;
    private List<ColumnValDTO> columnList;
    private List<ColumnValDTO> whereList;

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

    public List<ColumnValDTO> getWhereList() {
        return whereList;
    }

    public void setWhereList(List<ColumnValDTO> whereList) {
        this.whereList = whereList;
    }
}
