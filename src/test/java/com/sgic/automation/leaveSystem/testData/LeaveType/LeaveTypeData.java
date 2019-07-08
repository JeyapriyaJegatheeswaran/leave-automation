package com.sgic.automation.leaveSystem.testData.LeaveType;

import com.sgic.automation.leaveSystem.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class LeaveTypeData extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(LeaveTypeData.class);

    public LeaveTypeData() {
        super("src\\test\\resources\\ExcelSheet\\Designation.xlsx");
    }

    @DataProvider(name = "LeaveTypeData")
    public Object[][] LeaveTypeData() {

        int rows = getRowCount("Sheet1");
        int col = getColumnCount("Sheet1");

        LOGGER.info("row = " + rows + " columns = " + col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Sheet1", i, j);
            }
        }
        return data;
    }
}
