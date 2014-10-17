

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
   private static boolean newConsultant = false;
    
   public static void main(String[] args) 
    {
        System.out.println("how many employees will you be entering have?");
        int emp = s.nextInt();
        Employee e[] = new Employee[emp];
        
        String temp;
        int i = 1;
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
       
       Manager man1 = new Manager();
       enterInEmployee(man1);
       enterInManager(man1);
    }  
    public static void enterInEmployee(Employee x)
    {   
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
    public static void enterInManager(Manager x)
    {      
        
        Employee man1 = new Manager();
        System.out.print("Please enter your manager ID: ");
        x.setmanagerId(s.nextInt());
    }
    public static void enterInConsult(Consultant x)
    {
        System.out.print("Please enter Consultant id: ");
        x.setConsultantId(s.nextInt()); 
        
        System.out.print("Please enter statr date: ");
        x.setsartDate(s.next());
        
        System.out.print("Please enter end date: ");
        x.setendDate(s.next());
    }
    
}
