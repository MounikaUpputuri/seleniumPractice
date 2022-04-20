package corejava;

import java.lang.reflect.Method;

public class Methods {

	public static void main(String[] args) {
		// Method will not write in inside main method
		//create object access public method
		//syntax: classname objectname =memory allocation class name
		Methods d=new Methods();
		String name=d.getdata();
		System.out.println(name);
		MethodWithAnotherClass d1=new MethodWithAnotherClass();
		d.getdata();
		GetEmaildata();
//if we want to access the method without creating object we can access by using keyword static
	}
	
	public String getdata() 
	{
		System.out.println("Hello World");
		return "Mounika";
	}
	public static String GetEmaildata() 
	{
		System.out.println("Hey are u there!");
		return "Upputuri";
	}
	
	
	
	
	

}
