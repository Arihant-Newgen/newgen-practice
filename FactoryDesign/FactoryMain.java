package com.FactoryDesign;

public class FactoryMain {

	public static void main(String args[])
	{
//		OS obj=new Android();
//		OS obj=new Windows();
//		OS obj=new IOS();
		OperatingFactory osf= new OperatingFactory();
		OS obj= osf.getInstance("Open");
		obj.specs();
	}
}
