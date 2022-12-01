package com.hewei.crazy.spring.easyexcel.write;

import com.alibaba.excel.write.handler.RowWriteHandler;
import com.alibaba.excel.write.handler.context.RowWriteHandlerContext;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;

public class MyMergeStrategy implements RowWriteHandler {

    private List<Integer> columnIndexList;

    private String projectId;

    @Override
    public void afterRowDispose(RowWriteHandlerContext context) {
        if (CollectionUtils.isEmpty(columnIndexList)) {
            return;
        }
        if (!context.getHead() && context.getRelativeRowIndex() != null) {
            String currentProjectId = context.getRow().getCell(0).getStringCellValue();
            if (!StringUtils.hasText(currentProjectId)) {
                return;
            }
            if (!StringUtils.hasText(projectId) || !currentProjectId.equals(projectId)) {
                projectId = currentProjectId;
            } else {
                columnIndexList.forEach(columnIndex -> {
                    CellRangeAddress cellRangeAddress = new CellRangeAddress(
                            context.getRowIndex() - 1, context.getRowIndex(), columnIndex, columnIndex);
                    context.getWriteSheetHolder().getSheet().addMergedRegionUnsafe(cellRangeAddress);
                });
            }
        }
    }

    public MyMergeStrategy() {
    }

    public MyMergeStrategy(List<Integer> columnIndexList) {
        this.columnIndexList = columnIndexList;
    }
}
