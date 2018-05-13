package com.examples.entity;

public class Calculator {
	public int add(int i,int j){
		return i+j;
	}
	public static void main(String args[]){
		Calculator c = new Calculator();
		System.out.println("Sum is:"+c.add(2,3));
	}
}
