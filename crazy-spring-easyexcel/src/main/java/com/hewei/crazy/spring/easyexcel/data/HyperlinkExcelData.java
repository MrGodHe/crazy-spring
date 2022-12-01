package com.hewei.crazy.spring.easyexcel.data;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ContentStyle;
import com.alibaba.excel.enums.poi.HorizontalAlignmentEnum;
import com.alibaba.excel.enums.poi.VerticalAlignmentEnum;
import com.alibaba.excel.metadata.data.WriteCellData;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class HyperlinkExcelData implements Serializable {

    /**
     * 项目ID
     */
    @ContentStyle(horizontalAlignment= HorizontalAlignmentEnum.CENTER,
            verticalAlignment = VerticalAlignmentEnum.CENTER)
    @ExcelProperty("项目ID")
    private String projectId;

    /**
     * 项目名称
     */
    @ContentStyle(horizontalAlignment= HorizontalAlignmentEnum.CENTER,
            verticalAlignment = VerticalAlignmentEnum.CENTER)
    @ExcelProperty("项目名称")
    private String projectName;

    /**
     * 超链接
     */
    @ExcelProperty("超链接")
    private WriteCellData<String> hyperlink;

    public HyperlinkExcelData() {
    }

    public HyperlinkExcelData(String projectId, String projectName, WriteCellData<String> hyperlink) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.hyperlink = hyperlink;
    }

}
