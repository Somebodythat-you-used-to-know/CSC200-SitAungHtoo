/**********************************************************************
  
  Program Title : Demonstrating Variable Scope in Java
  File Name     : "VariableScope.java"
  
  Programmer    : Sathish Sarma
  Contact       : sathish.sarma@newinti.edu.my
  Date          : 04 September 2025
  
 **********************************************************************/

public class Variable_Scoop {

    // Static variable (class-level, shared by all objects)
    static int staticVar = 100;

    // Instance variable 
    int instanceVar = 50;

    public void printOutputMethod() {
        // Local variable 
        int localVar = 10;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        // Create two different objects
        Variable_Scoop obj1 = new Variable_Scoop();
        Variable_Scoop obj2 = new Variable_Scoop();

        System.out.println("---- Object 1 ----");
        obj1.printOutputMethod();

        // Change instanceVar in obj1
        obj1.instanceVar = 200;

        // Change staticVar (affects all objects)
        Variable_Scoop.staticVar = 500;

        System.out.println("\n---- Object 2 ----");
        obj2.printOutputMethod();   // ✅ fixed

        System.out.println("\n---- Object 1 Again ----");
        obj1.printOutputMethod();   // ✅ fixed
    }
}
