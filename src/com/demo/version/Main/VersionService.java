package com.demo.version.Main;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class VersionService {
	private static final Logger logger = Logger.getLogger(VersionService.class.getName());  


	public static int versionCompare(String str1, String str2) {
		try {
	      String [] ver1 = str1.split("\\.");
	      String [] ver2 =  str2.split("\\.");
	      
	      if(StringUtils.isNotEmpty(str2) && StringUtils.isNotEmpty(str1) && str1.matches("^\\d+(\\.\\d+)+$") && str2.matches("^\\d+(\\.\\d+)+$")) {
          for(int i =0; i < ver1.length && i <  ver2.length; i++) {         
		        int v1 = Integer.parseInt(ver1[i]);
	            int v2 = Integer.parseInt(ver2[i]);
	            if (v1 < v2) {
	                return -1;
	            } else if (v1 > v2) {
	                return 1;
	            }
	        }
	      }
	        
	    } 
		catch (Exception e) {
			System.out.println(e);
		}
		return 0;
		
	}
}
