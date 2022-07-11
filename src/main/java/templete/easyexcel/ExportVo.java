package templete.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;

public class ExportVo {

    @ExcelProperty(index = 0, value = {"姓名"})
    String name;
    @ExcelProperty(index = 1, value = {"年龄"})
    String age;
    @ExcelProperty(index = 2, value = {"日期"})
    String date;
    @ExcelProperty(index = 3, value = {"值"})
    String value;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ExportVo(String name, String age, String date, String value) {
        this.name = name;
        this.age = age;
        this.date = date;
        this.value = value;
    }
}
