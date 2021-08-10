
// This is a parent class
class StaffHire{
    //Declaring an instance variable
    private int Vacancy_no;
    private String Designation;
    private String Job_Type;
// Making a StaffHire Constructor having an parameter and assiging value of the parameters.
public StaffHire(int Vacancy_no, String Designation, String Job_Type){
    this.Vacancy_no=Vacancy_no;
    this.Designation=Designation;
    this.Job_Type=Job_Type;
}

//Usig setter method to set the Vcancy_no, Designation and Job_Type
public void setVacancy_no(int Vacancy_no){
    this.Vacancy_no=Vacancy_no;
}

public void setDesignation(String Designation){
    this.Designation=Designation;
}

public void setJob_Type(String Job_Type){
    this.Job_Type=Job_Type;
}

//Using getter method to return tha value of Vacancy_no, Designation and Job_Type
public int getVacancy_no(){
    return Vacancy_no;
}

public String getDesignation(){
    return Designation;
}

public String getJob_Type(){
    return Job_Type;
}

//A method Diplay() is used to display the vacancy_no, Designation and Job_type.
public void Display(){
    System.out.println("The vacancy number is: "+ getVacancy_no());
    System.out.println("The Designation is: "+ getDesignation());
    System.out.println("The type of job is: "+ getJob_Type());
}

}