package com.river.vsb.entity.dto;

import com.river.vsb.entity.po.ColumnValPO;

public class ColumnValDTO {

    private String name;
    private Object val;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }

    public ColumnValPO toPO() {
        ColumnValPO columnValPO = new ColumnValPO();
        columnValPO.setName(name);
        columnValPO.setVal(val);
        return columnValPO;
    }
}
