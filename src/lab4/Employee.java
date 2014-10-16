

package lab4;

/**
 *
 * @author 
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
 /*
    set functions recieve vairables and set them equal to a new variable 
    names. from there they are stored in those new variables.
 */
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
 /*
    the get functions take the new variables and send them off to other 
    classes when they are called.
 */
 private void promote(String jobtitle)
 {
     
 }
 private void increment(int salary)
 {
     
 }
         
 
}
