package com.along;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertyTest {

	public static void main(String[] args) {
		Properties prop= new Properties();
		InputStream in=BufferedInputStream(new FileInputStream("a.properties"));
		prop.load(in);

	}

}
