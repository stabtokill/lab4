

package lab4;

/**
 *  Section 2
 * @Zimmer,last name, last name.
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
    public void setprojectId(int pId)
    {
        if(projectId == 0)
        projectId = pId;
        
        else 
            
    }
    public int getprojectId()
    {
        return projectId;
    }
}
