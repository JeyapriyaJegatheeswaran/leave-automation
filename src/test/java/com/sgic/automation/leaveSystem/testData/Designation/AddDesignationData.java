package com.sgic.automation.leaveSystem.testData.Designation;

import com.sgic.automation.leaveSystem.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class AddDesignationData extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(AddDesignationData.class);

    public AddDesignationData() {
        super("src\\test\\resources\\ExcelSheet\\Designation.xlsx");
    }

    @DataProvider(name = "AddDesignation")
    public Object[][] AddDesignation() {

        int rows = getRowCount("AddDesignation");
        int col = getColumnCount("AddDesignation");

        LOGGER.info("row = " + rows + " columns = " + col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("AddDesignation", i, j);
            }
        }
        return data;
    }

}
