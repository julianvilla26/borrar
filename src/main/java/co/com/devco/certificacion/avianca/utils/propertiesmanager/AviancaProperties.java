package co.com.devco.certificacion.avianca.utils.propertiesmanager;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class AviancaProperties {
	
	private static Properties properties = null;

	private AviancaProperties() {
		throw new IllegalStateException();
	}
	
	public static String getUrlAvianca() throws IOException {
		cargarUrl();
		return properties.getProperty("UrlFront");
	}
	
	public static void cargarUrl() throws IOException {
		if(properties == null) {
			properties = new Properties();
			File fileUrl = new File(System.getProperty("user.dir"));
			String pathUrl = fileUrl.getAbsolutePath();
			properties.load(new FileReader(pathUrl + "/front-avianca.properties"));
		}
	}
}
