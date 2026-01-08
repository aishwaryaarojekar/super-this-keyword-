package com.tka.jan7;

public class A {

	private int roll;
	private String name;
	
	@Override
	public String toString() {
		return "A [roll=" + roll + ", name=" + name + "]";
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	A(){
		System.out.println("zero para constructor");
	}
	A(int r){
		this();
		System.out.println("1 para constructor");
		this.roll=r;
	}
	A(int r,String n){
		this(r);
		System.out.println("2 para constructor");
		this.name=n;	
	}
}
class B extends A{
	private String sub;
	
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}

	B(int r,String n,String s){
		super(r,n);
		System.out.println("3 para constructor");
		this.sub=s;
	}
	
}
