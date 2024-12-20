package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportGeneration
{
    protected   ExtentReports extent;
    protected   ExtentTest test;
    public void setUpExtentReport()
    {
        ExtentSparkReporter extSparkReporter = new ExtentSparkReporter("extentReport.html");
        extSparkReporter.config().setTheme(Theme.STANDARD);
        extSparkReporter.config().setDocumentTitle("AUTOMATION");
        extSparkReporter.config().setReportName("CUCUMBER REPORT");
        extent = new ExtentReports();
        extent.attachReporter(extSparkReporter);
    }

    public void tearDownExtentReport()
    {
        extent.flush();
    }
}

