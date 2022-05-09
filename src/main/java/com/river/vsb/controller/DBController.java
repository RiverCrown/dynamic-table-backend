package com.river.vsb.controller;

import com.river.vsb.entity.dto.*;
import com.river.vsb.service.IDBMetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/db")
public class DBController {

    private IDBMetaService dbMetaService;

    @Autowired
    public void setDbMetaService(IDBMetaService dbMetaService) {
        this.dbMetaService = dbMetaService;
    }

    @PostMapping("/table/create")
    public void createTable(@RequestBody CreateTableDTO table) {
        dbMetaService.createTable(table.getTableName(), table.getColumnList());
    }

    @PostMapping("/table/alter")
    public void alterTable(@RequestBody AlterTableDTO table) {
        dbMetaService.alterColumn(table.getTableName(), table.getColumn());
    }

    @PostMapping("/table/insert")
    public void insertData(@RequestBody InsertDataDTO insertDataDTO) {
        dbMetaService.insertData(insertDataDTO.getTableName(), insertDataDTO.getColumnList());
    }

    @PostMapping("/table/update")
    public void updateData(@RequestBody UpdateDataDTO updateDataDTO) {
        dbMetaService.updateData(updateDataDTO.getTableName(), updateDataDTO.getColumnList(), updateDataDTO.getWhereList());
    }

    @PostMapping("/table/delete")
    public void deleteData(@RequestBody DeleteDataDTO deleteDataDTO) {
        dbMetaService.deleteData(deleteDataDTO.getTableName(), deleteDataDTO.getWhereList());
    }

}
