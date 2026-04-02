package utils;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class ScreenshotUtil extends BaseTest {

	public static String captureScreenshot(WebDriver driver, String testName) {

        String path = "screenshots/" + testName + ".png";

        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File dest = new File(path);

            dest.getParentFile().mkdirs(); // create folder if not exists

            FileUtils.copyFile(src, dest);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return path;
    }
}
