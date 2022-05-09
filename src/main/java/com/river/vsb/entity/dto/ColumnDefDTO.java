package com.river.vsb.entity.dto;

import com.river.vsb.entity.po.ColumnDefPO;
import com.river.vsb.enums.UIDataTypeEnum;

public class ColumnDefDTO {

    private String name;
    private UIDataTypeEnum type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UIDataTypeEnum getType() {
        return type;
    }

    public void setType(UIDataTypeEnum type) {
        this.type = type;
    }

    public ColumnDefPO toPO() {
        ColumnDefPO columnDefPO = new ColumnDefPO();
        columnDefPO.setName(name);
        columnDefPO.setType(type.toDBDataType().name());
        return columnDefPO;
    }
}
