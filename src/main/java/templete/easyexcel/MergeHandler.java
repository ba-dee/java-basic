package templete.easyexcel;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.merge.AbstractMergeStrategy;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;

import java.util.List;

public class MergeHandler extends AbstractMergeStrategy {

    List<ExportVo> dataList;

    public MergeHandler(List<ExportVo> dataList) {
        this.dataList = dataList;
    }

    @Override
    protected void merge(Sheet sheet, Cell cell, Head head, Integer integer) {
        CellRangeAddress cellRangeAddress = new CellRangeAddress(1, 6,0,0);
        sheet.addMergedRegionUnsafe(cellRangeAddress);
        sheet.addMergedRegionUnsafe(new CellRangeAddress(1, 2,1,1));
        sheet.addMergedRegionUnsafe(new CellRangeAddress(3, 5,1,1));
        sheet.addMergedRegionUnsafe(new CellRangeAddress(1, 2,2,2));
        sheet.addMergedRegionUnsafe(new CellRangeAddress(3, 5,2,2));
    }
}
