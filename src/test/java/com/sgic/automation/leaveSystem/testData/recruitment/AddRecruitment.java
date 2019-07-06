package com.sgic.automation.leaveSystem.testData.recruitment;

import com.sgic.automation.leaveSystem.testData.userRole.AddUserRole;
import com.sgic.automation.leaveSystem.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class AddRecruitment extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(AddUserRole.class);
    public AddRecruitment() {super
            ("src\\test\\resources\\ExcelSheet\\Recruitment.xlsx");

    }
    @DataProvider(name = "AddRecruitment")
    public Object[][] AddRecruitment() {

        int rows = getRowCount("AddRecruitment");
        int col = getColumnCount("AddRecruitment");

        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("AddRecruitment", i, j);
            }
        }
        return data;
    }
}
