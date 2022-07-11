package templete.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.metadata.WriteSheet;


import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        String fileName = "F:\\exprot\\test.xls";
        ExcelWriter excelWriter = EasyExcel.write(fileName).excelType(ExcelTypeEnum.XLSX).build();
        List<ExportVo> dataList = listVo();

        WriteSheet writeSheet = EasyExcel.writerSheet("模板1").head(ExportVo.class)
                .registerWriteHandler(new MergeHandler(dataList))
                .registerWriteHandler(new StyleHandler())
                .build();


        excelWriter.write(dataList, writeSheet);
        excelWriter.finish();
    }

    static List<ExportVo> listVo(){
        List<ExportVo> list = new ArrayList<>();
        list.add(new ExportVo("apple","18","1-1","1"));
        list.add(new ExportVo("apple","18","1-1","2"));
        list.add(new ExportVo("apple","18","1-2","3"));
        list.add(new ExportVo("apple","18","1-2","4"));
        list.add(new ExportVo("apple","18","1-2","5"));
        list.add(new ExportVo("apple","18","1-3","6"));
        return list;
    }
}
