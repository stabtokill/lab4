

package lab4;

import java.util.Scanner;

/**
 *  section 2
 * Zimmer, Hoffman, last name
 */
public class Lab4 {

   public static Scanner s = new Scanner(System.in);
   
    public static void main(String[] args) {
       Employee e1 = new Employee();
       Employee e2 = new Employee();
       Employee e3 = new Employee();
       Employee e4 = new Employee();
       Employee e5 = new Employee();
       Employee e6 = new Employee();
       Employee e7 = new Employee();
       Employee e8 = new Employee();
       Employee e9 = new Employee();
       Employee e10 = new Employee();
   
       enterInEmployee(e1);
       enterInEmployee(e2);
       enterInEmployee(e3);
       enterInEmployee(e4);
       enterInEmployee(e5);
       enterInEmployee(e6);
       enterInEmployee(e7);
       enterInEmployee(e8);
       enterInEmployee(e9);
       enterInEmployee(e10);
       
       System.out.print(e1.toString());
       System.out.print(e2.toString());
       System.out.print(e3.toString());
       System.out.print(e4.toString());
       System.out.print(e5.toString());
       System.out.print(e6.toString());
       System.out.print(e7.toString());
       System.out.print(e8.toString());
       System.out.print(e9.toString());
       System.out.print(e10.toString());       
       
       
    }
    
    public static void enterInEmployee(Employee x){
        
       System.out.print("Please enter your ID: ");
       x.setidnumber(s.nextInt());
       
       System.out.print("Please enter your Name: ");
       x.setname(s.next());
       
       System.out.print("Please enter your age: ");
       x.setage(s.nextInt());
       
       System.out.print("Please enter your gender: ");
       x.setgender(s.next());
       
       System.out.print("Please enter your salary: ");
       x.setsalary(s.nextDouble());
       
       System.out.print("Please enter your job title: ");
       x.setjobTitle(s.next());
    }
    
}
