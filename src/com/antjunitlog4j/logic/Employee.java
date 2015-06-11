package com.antjunitlog4j.logic;

import java.util.Date;

public class Employee {
	
	
	private int additonResult=0;
	private int substractionResult=0;
	
	public int addition(int x,int y){
		System.out.println("addition call");
		return additonResult=x+y;
	}
	
	public int substraction(int x,int y){
		return substractionResult=x-y;
	}
	
}
