
//This is a subclass of StaffHire class which inherits the PartTimeStaffHireclass.
public class PartTimeStaffHire extends StaffHire{
    //Declaring an instance variables.
    private int Working_Hour;
    private int Wages_perhour;
    private String Staff_Name;
    private String Joining_Date;
    private String Qualification;
    private String Appointed_By;
    private String Shifts;
    private boolean Joined;
    private boolean Terminated;
// Making Constructor with parameters to assign value to the parameters.   
public PartTimeStaffHire (int Vacancy_no, String Designation, String Job_Type, int Working_Hour, int Wages_perhour, String Shifts){
      //Calling to the superclass constructor by using super keyword.
      super(Vacancy_no,Designation,Job_Type);
      this.Working_Hour=Working_Hour;
      this.Wages_perhour=Wages_perhour;
      this.Shifts=Shifts;
      this.Staff_Name="";
      this.Joining_Date="";
      this.Qualification="";
      this.Appointed_By="";
      this.Joined=false;
      this.Terminated=false;
}
// Values of the variables is returned suing the getter method. 
public int getWorking_Hour(){
    return Working_Hour;
} 

public int getWages_perhour(){
    return Wages_perhour;
}

public String getStaff_Name(){
    return Staff_Name;
}

public String getJoining_Date(){
    return Joining_Date;
}

public String getQualification(){
    return Qualification;
}

public String getAppointed_By(){
    return Appointed_By;
}

public String getShifts(){
    return Shifts;
}

public boolean getJoined(){
    return Joined;
}

public boolean getTerminated(){
    return Terminated;
}

// Updating values of the variables by checking the condition using the ssetter method.
public void setShifts(String Shifts){
      if(Joined){
        System.out.println(" The shift is already hired");
        }
       else{
        this.Shifts=Shifts;
        }
}

// This method displays the suitable messgae if the staff is already joined else it will assign values into the variables.
public void Hire_PartTimeStaff(String Staff_Name, String Joining_Date, String Qualification, String Appointed_By){
    if (Joined==true){
       System.out.println("The staff is already hired");
       System.out.println("The name of Staff is "+getStaff_Name());
       System.out.println("The joining date of "+getStaff_Name()+" is "+getJoining_Date()); 
    }
    else{
        this.Staff_Name=Staff_Name;
        this.Joining_Date=Joining_Date;
        this.Qualification=Qualification;
        this.Appointed_By=Appointed_By;
        this.Joined=true;
        this.Terminated=false;
    }
}  

// This method displays the suitable messgae if the staff is already terminated else it will assign values into the variables.  
public void terminate(){
      if (Terminated){
          System.out.println(getStaff_Name()+" is already terminated");
        }
      else{
          this.Staff_Name="";
          this.Joining_Date="";
          this.Qualification="";
          this.Appointed_By="";
          this.Joined=false;
          this.Terminated=true;
        }
}

//Display method displays all the details of the staff.  
public void Display(){
      // A superclass method callled iusing super keyword to print the details of the Display() method in StaffHire class.
      super.Display();
      if (Joined){
        System.out.println("The name of the staff is: "+ getStaff_Name());
        System.out.println("The wages per hour is: "+ getWages_perhour());
        System.out.println("The working hour of the "+ getStaff_Name()+" is: "+ Working_Hour);
        System.out.println(Staff_Name+" has joined on "+ getJoining_Date());
        System.out.println("The qualification of "+ getStaff_Name()+ " is: "+Qualification);
        System.out.println(Staff_Name+" is appointed by: "+ getAppointed_By());
        int income= Wages_perhour*Working_Hour;
        System.out.println("The income of the "+Staff_Name+" per day is: "+ income+"rs");
        }
}

}
