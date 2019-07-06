package com.sgic.automation.leaveSystem.testData;

import com.sgic.automation.leaveSystem.utils.ExcelDataConfig;
import org.testng.annotations.DataProvider;


public class LeaveTestDatas extends ExcelDataConfig {

    private static final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger.getLogger(LeaveTestDatas.class);
    public LeaveTestDatas () {
        super("src\\test\\resources\\ExcelSheet\\LeaveTestData.xlsx");
    }


    @DataProvider(name = "TestData")
    public Object[][] TestData() {

        int rows = getRowCount("Sheet1");
        int col = getColumnCount("Sheet1");


        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Sheet1", i, j);
            }
        }
        return data;
    }

}
