package com.demo.version.Main;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.regex.Pattern; 

public class Main
{
	private static final Logger logger = Logger.getLogger(Main.class.getName());  


     
	public static void main(String[] args) {
		VersionService versionService = new VersionService();
		int v = versionService.versionCompare("1.0","2.0");
		logger.info("the version return value::" + v);
	   	}
}