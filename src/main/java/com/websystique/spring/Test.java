package com.websystique.spring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
	
	static char encodedChar(String str,int k)
    {
		Map<String, Integer> map = new HashMap<String, Integer>();
		char[] charArr = str.toCharArray();
		for(char c : charArr)
		return 'a';
    }
      
    // Driver program to test the string
    public static void main(String args[])
    {
        String str = "ab4c12ed3";
        int k = 21;
        System.out.println(encodedChar(str, k));
    }
}
//abbbbcccccccccccceddd
//aaaabbbbcccccccccccceeeddd
