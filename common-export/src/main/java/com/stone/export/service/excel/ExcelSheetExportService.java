package com.stone.export.service.excel;

import org.apache.poi.ss.usermodel.Workbook;

/**
 * sheet 生成
 *
 * @author yuanxiu
 * @date 2020/11/7
 */
public interface ExcelSheetExportService {

    void doSheetExport(Workbook workbook) throws Exception;

}
