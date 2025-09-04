/**********************************************************************
  
  Program Title : Demonstrating Variable Data Types in Java with Sizes
  File Name: "DataTypeSize.java"
  
  Programmer : Sathish Sarma
  Contact Details : sathish.sarma@newinti.edu.my
  Date : 28 August 2025
  
 **********************************************************************/

public class DataTypeSize {
    public static void main(String[] args) {
        System.out.println("Demonstrating Data Type Size in Java");
        System.out.println("-----------------------------------------");

        // Primitive Data Types
        byte b = 120;
        short s = 32000;
        int i = 123456789;
        long l = 9876543210L;
        float f = 5.75f;
        double d = 19.99;
        char c = 'A';


		//Instruction
		System.out.println("This application shows the basic code that is needed to calculate data type size, the range (min & max value) for each data type.");

        System.out.println("\n--- Finding data type size using BYTES ---\n");

		//Finding data type size using BYTES
		System.out.println("The variable i is int data type has the value "+ i + "\nSize of int:" + Integer.BYTES + " bytes.");
		System.out.println("The variable l is int data type has the value "+ l + "\nSize of int:" + Long.BYTES + " bytes.");
		System.out.println("The variable b is int data type has the value "+ b + "\nSize of int:" + Byte.BYTES + " bytes.");
		System.out.println("The variable s is int data type has the value "+ s + "\nSize of int:" + Short.BYTES + " bytes.");
		System.out.println("The variable f is int data type has the value "+ f + "\nSize of int:" + Float.BYTES + " bytes.");
		System.out.println("The variable d is int data type has the value "+ d + "\nSize of int:" + Double.BYTES + " bytes.");
		System.out.println("The variable c is int data type has the value "+ c + "\nSize of int:" + Character.BYTES + " bytes.");
		
        System.out.println("\n--- Finding data type size using SIZE ---\n");
		
		//Finding data type size using SIZE
		System.out.println("The variable i is int data type has the value "+ i + "\nSize of int:" + Integer.SIZE + " bits.");
		System.out.println("The variable l is int data type has the value "+ l + "\nSize of int:" + Long.SIZE + " bits.");
		System.out.println("The variable b is int data type has the value "+ b + "\nSize of int:" + Byte.SIZE + " bits.");
		System.out.println("The variable s is int data type has the value "+ s + "\nSize of int:" + Short.SIZE + " bits.");
		System.out.println("The variable f is int data type has the value "+ f + "\nSize of int:" + Float.SIZE + " bits.");
		System.out.println("The variable d is int data type has the value "+ d + "\nSize of int:" + Double.SIZE + " bits.");
		System.out.println("The variable c is int data type has the value "+ c + "\nSize of int:" + Character.SIZE + " bits.");
		
        System.out.println("\n--- Finding data type size using minimum and maximum value ---\n");
		
		//Finding data type range minimum and maximum value
		System.out.println("The variable i is int data type has the value "+ i + "\nMinimum value of int range: " + Integer.MIN_VALUE + ".");
		System.out.println("Maximum value of int range: " + Integer.MAX_VALUE + ".\n");
		System.out.println("The variable l is int data type has the value "+ l + "\nMinimum value of int range: " + Long.MIN_VALUE + ".");
		System.out.println("Maximum value of int range: " + Long.MAX_VALUE + ".\n");
		System.out.println("The variable b is int data type has the value "+ b + "\nMinimum value of int range: " + Byte.MIN_VALUE + ".");
		System.out.println("Maximum value of int range: " + Byte.MAX_VALUE + ".\n");
		System.out.println("The variable s is int data type has the value "+ s + "\nMinimum value of int range: " + Short.MIN_VALUE + ".");
        System.out.println("Maximum value of int range: " + Short.MAX_VALUE + ".\n");
        System.out.println("The variable f is int data type has the value "+ f + "\nMinimum value of int range: " + Float.MIN_VALUE + ".");
        System.out.println("Maximum value of int range: " + Float.MAX_VALUE + ".\n");
        System.out.println("The variable d is int data type has the value "+ d + "\nMinimum value of int range: " + Double.MIN_VALUE + ".");
        System.out.println("Maximum value of int range: " + Double.MAX_VALUE + ".\n");
        System.out.println("The variable c is int data type has the value "+ c + "\nMinimum value of int range: " + Character.MIN_VALUE + ".");
        System.out.println("Maximum value of int range: " + Character.MAX_VALUE + ".");
    }
}
