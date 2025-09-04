/**********************************************************************
  
  Program Title : Demonstrating Identifier Rules in Java
  File Name: "IdentifierRules.java"
  
  Programmer : Sit Aung Htoo
  Contact Details : j24041188@student.newinti.edu.my
  Date : 04 September 2025
  
 **********************************************************************/
 
// Intentionally incorrect program to demonstrate invalid Java identifiers.

/*class switch{
	String SwitchStatus = "On";
	
}*/

public class IdentifierRules {
	
/*    public static void 1start() { 
		System.out.println("Static Method Output");
	}*/

    public static void main(String[] args) {

        int /*2ndPlace*/ Second_Place = 2;
        //The variable shouldn't have a number
        
        int /*first name*/firstname = 10;
        System.out.println(firstname);
        //There shouldn't be a space
        
        int /*price#*/price$ = 99;
        //The symbol is reduncant in Java Programming Language
        
		int /*user name*/username = 25;
		//There shouldn't be a space in variable

		int /*Class*/one = 1;
		//Class is a template
		
		int /*Double*/ three = 3;
        //Double is a data type
        
        int Score = 10;
        System.out.println(/*score*/Score);
		//There's a typo of the variable
		System.out.println("This program is executed after all errors are rectified.");


        //1start();
    }

}
