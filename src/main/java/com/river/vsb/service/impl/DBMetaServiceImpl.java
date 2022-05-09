package com.river.vsb.service.impl;

import com.river.vsb.dao.DBMetaMapper;
import com.river.vsb.entity.dto.ColumnDefDTO;
import com.river.vsb.entity.dto.ColumnValDTO;
import com.river.vsb.entity.po.ColumnDefPO;
import com.river.vsb.enums.DBDataTypeEnum;
import com.river.vsb.service.IDBMetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.river.vsb.constants.DBMetaConstant.ROW_ID_COL_NAME;

@Service
public class DBMetaServiceImpl implements IDBMetaService {

    private DBMetaMapper dbMetaMapper;

    @Autowired
    public void setDbMetaMapper(DBMetaMapper dbMetaMapper) {
        this.dbMetaMapper = dbMetaMapper;
    }

    @Override
    public void createTable(String tableName, List<ColumnDefDTO> columnList) {
        List<ColumnDefPO> columnDefPOList = columnList.stream().map(ColumnDefDTO::toPO).collect(Collectors.toList());
        // 默认每一行都必须要有唯一标识
        ColumnDefPO rowIDColDef = new ColumnDefPO();
        rowIDColDef.setName(ROW_ID_COL_NAME);
        rowIDColDef.setType(DBDataTypeEnum.INT.name());
        columnDefPOList.add(rowIDColDef);
        dbMetaMapper.createTable(tableName, columnDefPOList);
    }

    @Override
    public void alterColumn(String tableName, ColumnDefDTO column) {
        dbMetaMapper.alterColumn(tableName, column.toPO());
    }

    @Override
    public int insertData(String tableName, List<ColumnValDTO> columnList) {
        return dbMetaMapper.insertData(tableName, columnList.stream().map(ColumnValDTO::toPO).collect(Collectors.toList()));
    }

    @Override
    public int updateData(String tableName, List<ColumnValDTO> columnList, List<ColumnValDTO> whereList) {
        return dbMetaMapper.updateData(tableName,
                columnList.stream().map(ColumnValDTO::toPO).collect(Collectors.toList()),
                whereList.stream().map(ColumnValDTO::toPO).collect(Collectors.toList()));
    }

    @Override
    public int deleteData(String tableName, List<ColumnValDTO> whereList) {
        return dbMetaMapper.deleteData(tableName, whereList.stream().map(ColumnValDTO::toPO).collect(Collectors.toList()));
    }


}
