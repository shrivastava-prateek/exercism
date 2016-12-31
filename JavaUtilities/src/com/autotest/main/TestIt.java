package com.autotest.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class TestIt {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		TestIt testIt = new TestIt();
		
		Properties props=testIt.loadFile();

		String clsName = props.getProperty("class");
		String[] mNames = props.getProperty("methods").split(",");

		Class[] noParams={};

		try{
		Class cls = Class.forName(clsName);
		Object obj = cls.newInstance();
		for(String mName:mNames){
		Method m = cls.getDeclaredMethod(mName,noParams);
		m.invoke(obj);
		}
		}catch(Exception e){
		System.out.println("got exception");

		System.out.println(e);
		}



		}

		

	
    public Properties loadFile() throws FileNotFoundException, IOException{
	Properties props = new Properties();
	InputStream is = new FileInputStream("class.properties");
	props.load(is);
	System.out.println(props.getProperty("class"));
	System.out.println(props.getProperty("methods"));
	return props;
	}

}
