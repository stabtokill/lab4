
package lab4;

/**
 *  Section 2
 * @Zimmer, Hoffman, last name. 
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
    
    private void setproj_idNumber(int pid){
        proj_idNumber = pid;
    }
    
    private void setproj_name(String pn){
        proj_name = pn;
    }
    
    private void setproj_manager(int pm){
        proj_manager = pm;
    }
    
    public void setproj_startDate(String psd){
        proj_startDate = psd;
    }
    
    public void setproj_endDate(String ped){
        proj_endDate = ped;
    }
        /* 
            set functions recieve vairables and set them equal to a new variable 
            names. from there they are stored in those new variables.
        */
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
    
 /*
    the get functions take the new variables and send them off to other 
    classes when they are called.
 */
    
    
    
}
