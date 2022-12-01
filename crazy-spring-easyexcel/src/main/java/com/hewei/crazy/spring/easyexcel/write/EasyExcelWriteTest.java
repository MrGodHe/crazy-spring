package com.hewei.crazy.spring.easyexcel.write;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.data.HyperlinkData;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.write.merge.LoopMergeStrategy;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.hewei.crazy.spring.easyexcel.data.HyperlinkExcelData;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EasyExcelWriteTest {

    @Test
    public void hyperlinkWrite() {
        String fileName = EasyExcelWriteTest.class.getResource("/").getPath()+System.currentTimeMillis() + ".xlsx";

        WriteCellData<String> hyperlink = createHyperlink("官方网站",
                "https://github.com/alibaba/easyexcel", HyperlinkData.HyperlinkType.URL);

        //构建数据
        List<HyperlinkExcelData> dataList = new ArrayList<>();
        dataList.add(new HyperlinkExcelData("1", "建工项目", hyperlink));

        //写入数据
        EasyExcel.write(fileName, HyperlinkExcelData.class).sheet("模板").doWrite(dataList);

    }

    @Test
    public void hyperlinkMergeWrite() {
        String fileName = EasyExcelWriteTest.class.getResource("/").getPath()+System.currentTimeMillis() + ".xlsx";

        WriteCellData<String> hyperlink1 = createHyperlink("官方网站",
                "https://github.com/alibaba/easyexcel", HyperlinkData.HyperlinkType.URL);
        WriteCellData<String> hyperlink2 = createHyperlink("百度",
                "https://www.baidu.com", HyperlinkData.HyperlinkType.URL);
        //构建数据
        List<HyperlinkExcelData> dataList = new ArrayList<>();
        dataList.add(new HyperlinkExcelData("1", "建工项目", hyperlink1));
        dataList.add(new HyperlinkExcelData("1", "建工项目", hyperlink2));

        //写入数据
//        EasyExcel.write(fileName, HyperlinkExcelData.class).registerWriteHandler(new MyMergeStrategy())
//                .sheet("模板").doWrite(dataList);

        try (ExcelWriter excelWriter = EasyExcel.write(fileName, HyperlinkExcelData.class).build()) {
            WriteSheet writeSheet = EasyExcel.writerSheet("模板")
                    .registerWriteHandler(new MyMergeStrategy(Arrays.asList(0,1))).build();
            for (int i = 0; i < 1; i++) {
                excelWriter.write(dataList, writeSheet);
            }
        }
    }


    private WriteCellData<String> createHyperlink(String name, String address,
                                                  HyperlinkData.HyperlinkType hyperlinkTyp){
        WriteCellData<String> hyperlink = new WriteCellData<>(name);
        HyperlinkData hyperlinkData = new HyperlinkData();
        hyperlink.setHyperlinkData(hyperlinkData);
        hyperlinkData.setAddress(address);
        hyperlinkData.setHyperlinkType(hyperlinkTyp);
        return hyperlink;
    }
}
