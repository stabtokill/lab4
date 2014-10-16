
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
    
    public void setproj_idNumber(int pid){
        proj_idNumber = pid;
    }
     public void setproj_name(int pn){
        proj_idNumber = pn;
    }
      public void setproj_manager(int pm){
        proj_idNumber = pm;
    }
       public void setproj_startDate(int psd){
        proj_idNumber = psd;
    }
        public void setproj_endDate(int ped){
        proj_idNumber = ped;
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