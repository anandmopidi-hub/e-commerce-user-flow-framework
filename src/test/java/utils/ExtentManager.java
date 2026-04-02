package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if (extent == null) {

            // Report path
            ExtentSparkReporter spark =
                    new ExtentSparkReporter("reports/AutomationReport.html");

            // UI Config
            spark.config().setReportName("DemoBlaze Automation Report");
            spark.config().setDocumentTitle("Selenium Test Results");
            spark.config().setEncoding("utf-8");
            spark.config().setTimelineEnabled(true);

            extent = new ExtentReports();
            extent.attachReporter(spark);

            // System Info (shows in report)
            extent.setSystemInfo("Project", "DemoBlaze");
            extent.setSystemInfo("Tester", "Anand");
            extent.setSystemInfo("Browser", "Chrome");
            extent.setSystemInfo("OS", System.getProperty("os.name"));
        }

        return extent;
    }

    // Optional helper method
    public static ExtentReports getReport() {
        return getInstance();
    }
}
