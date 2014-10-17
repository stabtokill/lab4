

package lab4;

import java.util.Scanner;

/**
 *  section 2
 * Zimmer, Hoffman, last name
 */
public class Lab4 {

   public static Scanner s = new Scanner(System.in);
   private static boolean newEmployee = false;
   private static boolean newManager = false;
    
   public static void main(String[] args) 
    {
        System.out.println("how many employees will you be entering have?");
        int emp = s.nextInt();
        Employee e[] = new Employee[emp];
        
        System.out.println("how many managers will you be entering have?");
        int man = s.nextInt();
        Employee m[] = new Manager[man];
        
        System.out.println("how many managers will you be entering have?");
        int con = s.nextInt();
        Employee c[] = new Consultant[con];
        
        String temp;
        int i = 0;
       while (false == newEmployee)
       {
          System.out.println("Employee? Y/N");
           temp = s.next();
           if (temp.equals("Y"))
           {
           e[i] = new Employee();
           enterInEmployee(e[i]);
           i++;
           }
           else
             newEmployee = true;
       }
       
       while (false == newEmployee)
       {
          System.out.println("Employee? Y/N");
           temp = s.next();
           if (temp.equals("Y"))
           {
           e[i] = new Employee();
           enterInEmployee(e[i]);
           i++;
           newEmployee = false;
           }
           else
             newEmployee = true;
       }
       
       while (false == newEmployee)
       {
          System.out.println("Employee? Y/N");
           temp = s.next();
           if (temp.equals("Y"))
           {
           e[i] = new Employee();
           enterInEmployee(e[i]);
           i++;
           newEmployee = false;
           }
           else
             newEmployee = true;
       }
       
       
       System.out.print(e[0].toString());
       
      
       
    }
    
    public static void enterInEmployee(Employee x)
    {
        Scanner scan = new Scanner(System.in);
        Employee i = new Employee();
        
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
