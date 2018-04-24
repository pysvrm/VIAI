package mx.com.vrm.viai.configuration.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ObtienePropiedades {

	private InputStream input = null;
	private  Properties properties = new Properties();
	public Properties obtienePropiedades(String urlFile) throws IOException{
		input = new FileInputStream(urlFile);
		properties.load(input);
		return properties;
		
	}
}
