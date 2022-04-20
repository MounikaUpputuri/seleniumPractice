package corejava;

import java.util.ArrayList;

import javax.swing.Spring;

public class CoreJavaBrushUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		String name="Mounika";
		boolean Hi= true;
		double dec=10.5;
		System.out.println(a +" is number of integer");
		System.out.println(name);
		
		//arrays concept
		int[] arr= new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		//another way of declaring array
		int[] arr1= {1,2,3,4};
		System.out.println(arr[3]);
		System.out.println(arr1[2]);
		//for loop
		for(int i=0;i<arr1.length;i++ )
		{
			System.out.println(arr[i]);
			
		}
		String[] name1= {"hello","Hi","Mounika"};
		for(int j=0;j<name1.length;j++) {
			System.out.println(name1[j]);
		}
		//enhanced for loop
		for (String s: name1)
		{
			System.out.println(s);
		}
		//number divided by 2
		int array[]= {1,2,4,6,8,4,10,14,12,13,15,17,119};
		for(int i=0;i<array.length;i++) 
		{
			if(array[i]%2==0) //checking the condition 
			{
				System.out.println(array[i]);
				}
			else 
			{
				System.out.println(array[i] + "is not multiply by 2");
			}
			}
			//arraylist
		ArrayList<String> b= new ArrayList<String>();
		b.add("Mounika");
		b.add("upputuri");
		b.add("nature");
		b.add("green");
		System.out.println(b.get(3));
		
		//String is an object in java it is sequence of characters
		//
		//if we want split by test in the string it will take left and right
		String s="Mounika Upputuri Mandava Hello Hi";
		String[] SplitedString=s.split("Upputuri");
		System.out.println(SplitedString[0]);
		System.out.println(SplitedString[1]);
		System.out.println(SplitedString[1].trim());
		for(int i=0;i<s.length();i++) {
	System.out.println(s.charAt(i));
		}
		//print the string reverse order
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));	
		}
		
		
		
		
		

	}

}
