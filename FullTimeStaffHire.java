
//This is a subclass of StaffHire class which inherits the FullTimeStaffHireclass.
public class FullTimeStaffHire extends StaffHire{
    //Declaring an instance variables.
    private int Salary;
    private int Working_Hour;
    private String Staff_Name;
    private String Joining_Date;
    private String Qualification;
    private String Appointed_By;
    private boolean Joined;

// Making Constructor with parameters to assign value to the parameters.
public FullTimeStaffHire(int Vacancy_no, String Designation, String Job_Type, int Salary, int Working_Hour){
        //A superclasss Constructor is called with the paramaters VAcancy_no, Designation and Job_type
        super(Vacancy_no,Designation,Job_Type);
        this.Salary=Salary;
        this.Working_Hour=Working_Hour;
        this.Staff_Name="";
        this.Joining_Date="";
        this.Qualification="";
        this.Appointed_By="";
        this.Joined=false;
}

//Using getter method to return the value of the variables.  
public int getSalary(){
    return Salary;
}

public int getWorking_Hour(){
    return Working_Hour;
}

public String getStaff_Name(){
    return Staff_Name;
}

public String getJoining_Date
(){
    return Joining_Date;
}

public String getQualification(){
    return Qualification;
}

public String getAppointed_By(){
    return Appointed_By;
}

public boolean getJoined(){
    return Joined;
}

//Using setter method to update the value of the varibles  by checking the condition
public void setSalary(int Salary){
    if (Joined){
        System.out.println("Salary is not changeable"); 
    }
    else{
        this.Salary=Salary;
    }
}

public void setWorkingHour(int Working_Hour){
    this.Working_Hour=Working_Hour;
}

/* This method check if the staff is already joined or not.
 * If the staff has joinde iw will display the suitable message and is the staff hasnot joined the new value is assigned to the variables.
 */
public void FullTimeStaff_Hire(String Staff_Name, String Joining_Date, String Qualification, String Appointed_By){
    if (Joined){
                System.out.println(getStaff_Name()+" has already joined the organization on "+ getJoining_Date());
    }
    else{
        this.Staff_Name=Staff_Name;
        this.Joining_Date=Joining_Date;
        this.Qualification=Qualification;
        this.Appointed_By=Appointed_By;
        this.Joined=true;
    }
}

//This method display the details of the staff by checking the condition.
public void Display(){
        //The method of superclass is called by using super keywor to display Vacancy_no, Designation and Job_Type.
        super.Display();
        if(Joined==true){
            System.out.println("The staff name is: "+ getStaff_Name());
            System.out.println("The salary of the "+ Staff_Name + " is: "+ getSalary());
            System.out.println("The working hour of "+ Staff_Name+ " is: "+ getWorking_Hour());
            System.out.println(Staff_Name+" has joined on: "+ getJoining_Date());
            System.out.println("The qualification of "+Staff_Name+" is: "+ getQualification());
            System.out.println(Staff_Name+" is appointed by: "+ getAppointed_By());
        }
}
    
}