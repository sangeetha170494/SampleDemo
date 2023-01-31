package com.demo.version.Main;

import junit.framework.TestCase;


import com.demo.version.Main.VersionService;

public class testCase extends TestCase {
 
	private VersionService versionService;
	
    public void testCompare() {
        assertEquals(-1, versionService.versionCompare("1.0.1","1.0.2"));
        assertEquals(1, versionService.versionCompare("1.0.1","1.0.2"));
        assertEquals(0, versionService.versionCompare("1.0.1","1.0.2"));
    }

}
