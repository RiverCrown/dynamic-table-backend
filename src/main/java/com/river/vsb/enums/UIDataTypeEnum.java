package com.river.vsb.enums;

public enum UIDataTypeEnum {

    LINK_TO_ANOTHER_RECORD,
    SINGLE_LINE_TEXT,
    LONG_TEXT,
    ATTACHMENT,
    CHECKBOX,
    MULTIPLE_SELECT,
    SINGLE_SELECT,
    DATETIME,
    PERCENT,
    FORMULA,
    ROLL_UP,
    LOOK_UP,
    DECIMAL,
    INT;

    public DBDataTypeEnum toDBDataType() {
        switch (this) {
            case LINK_TO_ANOTHER_RECORD:
                return DBDataTypeEnum.UNKNOWN;
            case SINGLE_LINE_TEXT:
            case LONG_TEXT:
            case ATTACHMENT:
            case FORMULA:
            case MULTIPLE_SELECT:
            case SINGLE_SELECT:
                return DBDataTypeEnum.TEXT;
            case CHECKBOX:
                return DBDataTypeEnum.BOOLEAN;
            case DATETIME:
                return DBDataTypeEnum.DATETIME;
            case ROLL_UP:
                return DBDataTypeEnum.UNKNOWN;
            case LOOK_UP:
                return DBDataTypeEnum.UNKNOWN;
            case INT:
                return DBDataTypeEnum.INT;
            case DECIMAL:
            case PERCENT:
                return DBDataTypeEnum.DECIMAL;
            default:
                return DBDataTypeEnum.UNKNOWN;
        }
    }
}
