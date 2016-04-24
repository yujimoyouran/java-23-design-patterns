package com.design.patterns.facade;

/*
 * One class has a method that performs a complex process calling several other classes.
 * 
 * 外形类(Facade)：整合子系统，并且处理客户的请求
 */
public class FacadeCuppaMaker {  
	    
	   public FacadeCuppaMaker() {
	       System.out.println(
	         "FacadeCuppaMaker ready to make you a cuppa!");
	   }
	   
	   public FacadeTeaCup makeACuppa() {
	       FacadeTeaCup cup = new FacadeTeaCup();
	       FacadeTeaBag teaBag = new FacadeTeaBag();
	       FacadeWater water = new FacadeWater();
	       cup.addFacadeTeaBag(teaBag);
	       water.boilFacadeWater();
	       cup.addFacadeWater(water);
	       cup.steepTeaBag();
	       return cup;
	   }
	}