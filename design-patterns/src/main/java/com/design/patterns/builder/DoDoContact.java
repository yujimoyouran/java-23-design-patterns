package com.design.patterns.builder;

public class DoDoContact {
	private final int age;
	private final int sefeID;
	private final String name;
	private final String address;
	
	private DoDoContact(Builder b) {
		age = b.age;
		sefeID = b.sefeID;
		name = b.name;
		address = b.address;
	}
	
	public int getAge() {
		return age;
	}
	public int getSefeID() {
		return sefeID;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
	public static class Builder{
		private int age = 0;
		private int sefeID = 0;
		private String name = null;
		private String address = null;
		
		public Builder(String name) {
			this.name = name;
		}
		
		public Builder age(int age){
			this.age = age;
			return this;
		}
		
		public Builder sefeID(int sefeID){
			this.sefeID = sefeID;
			return this;
		}
		
		public Builder address(String address){
			this.address = address;
			return this;
		}
		
		public DoDoContact builder(){
			return new DoDoContact(this);
		}
	}
	
	@Override
	public String toString() {
		return "name : " + name + " 的年龄是： " + age + " 生活在 ： " + address; 
	}
	

}
