
package lab4;

/**
 *
 * @author 
 */
public class Project {
    private int proj_idNumber; 
    private String proj_name;
    private int proj_manager;
    private String proj_startDate;
    private String proj_endDate;
    // variables
    int[] proj_assignments = new int[10];
    // our array for our assisgnments
    
    private int getproj_idNumber(){
        return proj_idNumber;
    }
    private String getproj_name(){
        return proj_name;
    }
    private int getproj_manager(){
        return proj_manager;
    }
    public String getproj_startDate(){
        return proj_startDate;
    }
    public String getproj_endDate(){
        return proj_endDate;
    }
    
    
    
    
    
}