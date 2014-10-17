package lab4;

import java.util.Scanner;

/**
 * section 2 
 * Zimmer, Hoffman, Silewski
 */
public class Lab4 {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        //making the right sized array for employee.
        System.out.println("how many employees will you be entering have?");
        int emp = s.nextInt();
        Employee e[] = new Employee[emp];
        //filling the array of employees.
        for(int i =0; i<emp; i++){
          e[i] = new Employee();
          enterInEmployee(e[i]);         
        }
        //making the right sized array for managers.
        System.out.println("how many Managers will you be entering have?");
        int manage = s.nextInt();
        Manager m[] = new Manager[manage];
       //filling the array of managers.
        for(int i =0; i<=manage; i++){
          e[i] = new Employee();
          enterInEmployee(m[i]);
          enterInManager(m[i]);
        }
        //making the right sized array for consultants.
        System.out.println("how many Consultants will you be entering have?");
        int consult = s.nextInt();
        Consultant c[] = new Consultant[consult];
       //filling the array of consulatants.
        for(int i =0; i<=consult; i++){
          c[i] = new Consultant();
          enterInEmployee(c[i]);
          enterInConsult(c[i]);
        }
    
       System.out.println( e[1].toString());
       System.out.println( e[2].toString());
       System.out.println( m[1].toString());
       System.out.println( m[2].toString());
       System.out.println( c[1].toString());
       System.out.println( c[2].toString());
    }
       //setting all the information for Employee and its extends
    public static void enterInEmployee(Employee x) {
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
        
        System.out.println("");
    }
    //setting manager infomation.
    public static void enterInManager(Manager x) {
        System.out.print("Please enter your manager ID: ");
        x.setmanagerId(s.nextInt());
        System.out.println("");
    }
    //setting consultant information.
    public static void enterInConsult(Consultant x) {
        System.out.print("Please enter Consultant id: ");
        x.setConsultantId(s.nextInt());

        System.out.print("Please enter statr date: ");
        x.setsartDate(s.next());

        System.out.print("Please enter end date: ");
        x.setendDate(s.next());
        System.out.println("");
    }
   
}
