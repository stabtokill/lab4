

package lab4;

import java.util.Scanner;

/**
 *  section 2
 * Zimmer, Hoffman, last name
 */
public class Lab4 {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String[] employee1;
       employee1 = new String[5];
       System.out.print("Please enter your ID");
       String s = input.nextLine();
       employee1[0] = s;
       System.out.print("Please enter your Name");
       String n = input.nextLine();
       employee1[1] = n;
       System.out.print("Please enter your age");
       String a = input.nextLine();
       employee1[2] = a;
       System.out.print("Please enter your gender");
       String g = input.nextLine();
       employee1[3] = g;
       System.out.print("Please enter your salary");
       String m = input.nextLine();
       employee1[4] = m;
       System.out.print("Please enter your job title");
       String jt = input.nextLine();
       employee1[5] = jt;
       System.out.print(employee1[]);
       
       
       
    }
    
}
