/**********************************************************************
  
  Program Title : Demonstrating Identifier Rules in Java
  File Name: "IdentifierRules.java"
  
  Programmer : Sathish Sarma
  Contact Details : sathish.sarma@newinti.edu.my
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

        int /*first name*/firstname = 10;

        int /*price#*/price$ = 99;
		int /*user name*/username = 25;

		int /*Class*/one = 1;
		int /*Double*/ three = 3;

        int Score = 10;
        System.out.println(/*score*/Score);
		
		System.out.println("This program is executed after all errors are rectified.");


        //1start();
    }

}