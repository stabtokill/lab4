

package lab4;

/**
 *  Section 2
 * Zimmer, Hoffman, Silewski. 
 */
public class Consultant extends Employee
{
    private String startDate;
    private String endDate;
    private int conId;
    
    
    public void setConsultantId(int id)
    {
        conId = id;
    }
    public int getConsultantId()
    {
        return conId;
    }
    public void setsartDate(String s)
    {
        startDate = s;
    }
    public void setendDate(String e)
    {
        endDate = e;
    }
    public String getStartDate()
    {
        return startDate;
    }
    public String retEndDate()
    {
        return endDate;
    }
     public String toString(){
        String g;
        g = "ID Number: " + getidnumber();
        g+= "\nName: " + getname();
        g+= "\nAge: " + getage();
        g+= "\nGender: " + getgender();
        g+= "\nSalary: $" + getsalary();
        g+= "\nJob Title: " + getjobTitle();
        g+= "\nConsultant id " + conId;
        g+= "\nState date " + startDate;
        g+= "\nEnd Date " + endDate  + "\n";
        return g;
     }
        
}
