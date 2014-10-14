

package lab4;

/**
 *
 * @author 
 */
public class Assignment {
    
    private int idNumber;
    private String startDate;
    private String endDate;
    private int[] employeeSize = new int[5];//TODO change this
    private int salary;
    
    
    
    
    public int getidNumber(){
        return idNumber;
    }
    
    public String getStartDate(){
        return startDate;
    }
    
    public String getEndDate(){
        return endDate;
    }
    
    public int getEmployee(int x){
        x++;
        return employeeSize[x];
    }
    
    public void getConsultant(){ //TODO fix this
    
    }
   
    
    public int getSalary(){
        return salary;
    }
    
    
    
    
    
}
