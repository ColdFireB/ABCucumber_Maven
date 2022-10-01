package Reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	static FileInputStream input_file;
	Properties prop = new Properties();

	public ConfigFileReader() throws IOException {
		try {
			input_file = new FileInputStream("./Config.properties");
			prop.load(input_file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String getReportConfigPath() {
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if (reportConfigPath != null) {
			return reportConfigPath;
		} else {
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
		}
	}

}
