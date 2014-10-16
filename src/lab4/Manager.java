

package lab4;

/**
 *  Section 2
 * @Zimmer,last name, last name.
 */
public class Manager extends employee
{
    private int projectId = 0;        //what project is this manager working on
    
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
