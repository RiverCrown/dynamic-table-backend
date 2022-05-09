package com.river.vsb.entity.dto;

import java.util.List;

public class DeleteDataDTO {

    private String tableName;
    private List<ColumnValDTO> whereList;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<ColumnValDTO> getWhereList() {
        return whereList;
    }

    public void setWhereList(List<ColumnValDTO> whereList) {
        this.whereList = whereList;
    }
}
