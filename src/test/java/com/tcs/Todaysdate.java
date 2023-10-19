package com.tcs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Todaysdate {
	
	public static void main(String[] args) {
		
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat dateformat=new SimpleDateFormat("dd.MM.YY");
		String format = dateformat.format(date);
		System.out.println(format);
		
		
	}

}
