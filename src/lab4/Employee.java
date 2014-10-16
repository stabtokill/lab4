

package lab4;

/**
 * section 2
 * @Zimmer,last name, last name 
 */
public class Employee 
{
 private int idnumber;
 private String name;
 private String gender;
 private int age;
 private int salary;
 private String jobTitle;
// variables that store our data
 
 public void setidnumber(int id)
 {
     idnumber = id;
 }
 public void setname(String n)
 {
     name = n;
 }
 public void setgender(String g)
 {
     gender = g;
 }
 public void setage(int a)
 {
     age = a;
 }
 public void setsalary(int s)
 {
     salary = s;
 }
 public void setjobTitle(String jt)
 {
     jobTitle = jt; 
 }
 
    // set functions recieve vairables and set them equal to a new variable 
    // names. from there they are stored in those new variables.
 public int getidnumber()
 {
     return idnumber;
 }
 public String getname()
 {
     return name;
 }
 public String getgender()
 {
     return gender;
 }
 public int getage()
 {
     return age;
 }
 public int getsalary()
 {
     return salary;
 }
 public String getjobTitle()
 {
     return jobTitle;
 }
 
    // the get functions take the new variables and send them off to other 
    // classes when they are called.
 
 //promotes employees to managers.
 private void promote()
 {   
         jobTitle = "manager";
         
         //set the newly apointed manager onto a project.
         
 }
 //increase the employee salary by twenty prcent.
 private void increment()
 {
     salary = (int) (salary + salary* 0.2);
 }

 
}
