

package lab4;

/**
 *  Section 2
 *  Zimmer,last name, last name.
 */
public class Manager extends Employee
{
    private int projectId;  //what project is this manager working on
    private int managerId;
    
    public void setmanagerId(int mId)
    {
        managerId = mId;
    }
    public int getmanagerId()
    {
        return managerId;
    }
    //check if the manager has a project.
    public void setprojectId(int pId)
    {
         projectId = pId;        //needs additional code for the check
    }
    public int getprojectId()
    {
        return projectId;
    }
    public String toString(){
        String g;
        g = "ID Number: " + getidnumber();
        g+= "\nName: " + getname();
        g+= "\nAge: " + getage();
        g+= "\nGender: " + getgender();
        g+= "\nSalary: $" + getsalary();
        g+= "\nJob Title: " + getjobTitle(); 
        g+= "\nmangaaer id "+ managerId;        
        g+= "\nprogect id "+ projectId         + "\n";
        return g;
    }
}
