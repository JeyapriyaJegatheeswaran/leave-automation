package com.sgic.automation.leaveSystem.testData.userRole;

import com.sgic.automation.leaveSystem.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class AddUserRole extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(AddUserRole.class);
    public AddUserRole() {super
            ("src\\test\\resources\\ExcelSheet\\OrangeHrm.xlsx");

    }
    @DataProvider(name = "AttendanceRecord")
    public Object[][] AttendanceRecord() {

        int rows = getRowCount("AttendanceRecord");
        int col = getColumnCount("AttendanceRecord");

        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("AttendanceRecord", i, j);
            }
        }
        return data;
    }
}
