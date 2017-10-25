package extent;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

	private static ExtentReports extent;
	public static String reportPath = System.getProperty("user.dir") + "//ExtentReports//Report.html";

	public static ExtentReports getInstance() {
		if (extent == null) {
			extent = new ExtentReports(reportPath, true, DisplayOrder.NEWEST_FIRST);

			extent.loadConfig(new File(System.getProperty("user.dir") + "//ConfigReport.xml"));
//			Optional data ::
			extent.addSystemInfo("Selenium Version", "3.6.6").addSystemInfo("Environment", "QA");
		}
		return extent;
	}

}
