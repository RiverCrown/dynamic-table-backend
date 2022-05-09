package com.river.vsb.entity.dto;

public class AlterTableDTO {

    private String tableName;
    private ColumnDefDTO column;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ColumnDefDTO getColumn() {
        return column;
    }

    public void setColumn(ColumnDefDTO column) {
        this.column = column;
    }
}
