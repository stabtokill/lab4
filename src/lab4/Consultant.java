

package lab4;

/**
 *  Section 2
 * zimmer,last name, last name. 
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
}
