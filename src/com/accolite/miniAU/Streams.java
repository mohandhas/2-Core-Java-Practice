package com.accolite.miniAU;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Streams {
	
	static String s="/Users/Sathya/Desktop/hello.ryt";
	
	public static void main(String[] args) throws IOException
	{
		FileReader fr=new FileReader(s);

		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();
		fr.close();
	}

}
