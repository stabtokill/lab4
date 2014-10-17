package lab4;

/**
 * Section 2
 * Zimmer,last name, last name.
 */
public class Assignment {
    
    private int idNumber;
    private String startDate;
    private String endDate;
    private String[] employee = new String[5];//TODO change this
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
    
    public String getEmployee(int x){
        //x++;
        return employee[x];
    }
    
    public void getConsultant(){ //TODO fix this
    
    }
    
    public int getSalary(){
        return salary;
    }
    
    public void setidNumber(int x){
        idNumber = x;
    }
    
    public void setStartDate(String x){
        startDate = x;
    }
    
    public void setEndDate(String x){
        endDate = x;
    }
    
    public void setEmployee(int a, String x){
        employee[a] = x;
    }
    
    public void setConsultant(){//TODO
        
    }
    
    public void setSalary(int x){
        salary = x;
    }
    
    
    
}
