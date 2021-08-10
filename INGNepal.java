
/**
 * Write a description of class Assignment here.
 *
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.util.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class INGNepal implements ActionListener{
    //These are the instnace variables
    String year, month, day;
    private boolean error;
    private boolean duplicated;
    JFrame frame;
    JPanel panel;
    JTextField full_vacancyNo;
    JTextField full_Designation;
    JComboBox cb;
    JTextField full_Salary;
    JTextField full_workingHour;
    JButton button;
    JTextField full_appointVacancy;
    JTextField full_staffName;
    JTextField full_Qualification;
    JComboBox Fcb;
    JComboBox cb1;
    JComboBox cb2;
    JTextField full_appointedBy;
    JButton appointfullbutton;
    JTextField part_vacancyNo;
    JTextField part_Designation;
    JComboBox pcb;
    JComboBox scb;
    JTextField partWorkingHour;
    JTextField part_Wages;
    JButton addpartbutton;
    JTextField part_appointVacancy;
    JTextField part_StaffName;
    JTextField part_Qualification;
    JComboBox pcb0;
    JComboBox pcb1;
    JComboBox pcb2;
    JTextField part_appointedBy;
    JButton appointpartbutton;
    JTextField vacancy_Terminate;
    JButton terminatebutton;
    JButton clearButton;
    JButton displaybutton;
    
    //Arraylist to store the value 
    ArrayList<StaffHire> list = new ArrayList<StaffHire>();
    
    public void report(){
        frame = new JFrame("Staff Registration Form");//
        frame.setVisible(true); //It makes all the tab visible       
        frame.setResizable(false);//Frame cannaot be resize
        frame.setBounds(50,20,830,780);//It helps to make size and location
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Exits all the background running process
        
        panel = new JPanel();
        panel.setLayout(null);//This will not contain any layout
        frame.add(panel);//Adding panel to the frame
        
        //MAking the Gui by adding Textfield, label and combobox
        JLabel title3 = new JLabel();
        title3.setText("For Full-Time Staff");
        title3.setBounds(285, 10, 400, 40);
        Font f1 = new Font("Arial", Font.PLAIN, 26);
        title3.setFont(f1);
        panel.add(title3);

        JLabel vacancyNo = new JLabel("VacancyNo:");
        vacancyNo.setBounds(45, 50, 180, 40);
        full_vacancyNo = new JTextField();
        full_vacancyNo.setBounds(140, 60, 100, 20);
        panel.add(vacancyNo);
        panel.add(full_vacancyNo);
        
        JLabel designation = new JLabel("Designation:");
        designation.setBounds(45, 75, 180, 40);
        full_Designation = new JTextField();
        full_Designation.setBounds(140, 85, 200, 20);
        panel.add(designation);
        panel.add(full_Designation);
        
        JLabel jobType = new JLabel("Job Type:");
        jobType.setBounds(45,100,180,40);
        String type[] = {"Full-Time","Part-Time",};
        cb = new JComboBox(type);
        cb.setBounds(140,110,100,20);
        panel.add(jobType);
        panel.add(cb);
        
        JLabel salary = new JLabel("Salary:");
        salary.setBounds(450, 75, 180, 40);
        full_Salary = new JTextField();
        full_Salary.setBounds(570, 85, 110, 20);
        panel.add(salary);
        panel.add(full_Salary);
        
        JLabel workingHour = new JLabel("WorkingHour:");
        workingHour.setBounds(450, 100, 180, 40);
        full_workingHour = new JTextField();
        full_workingHour.setBounds(570, 110, 110, 20);
        panel.add(workingHour);
        panel.add(full_workingHour);
        
        button = new JButton("Add Vacancy For Full Time Staff");
        button.setEnabled(true);
        button.addActionListener(this);
        button.setBounds(265, 150, 300, 25);
        panel.add(button);
        
        JLabel fvacancyNo = new JLabel("VacancyNo:");
        fvacancyNo.setBounds(45, 190, 180, 40);
        full_appointVacancy = new JTextField();
        full_appointVacancy.setBounds(140, 200, 100, 20);
        panel.add(fvacancyNo);
        panel.add(full_appointVacancy);
        
        JLabel staffName = new JLabel("StaffName:");
        staffName.setBounds(45, 215, 180, 40);
        full_staffName = new JTextField();
        full_staffName.setBounds(140, 225, 200, 20);
        panel.add(staffName);
        panel.add(full_staffName);
        
        JLabel qualification = new JLabel("Qualification:");
        qualification.setBounds(45, 240, 180, 40);
        full_Qualification = new JTextField();
        full_Qualification.setBounds(140, 250, 200, 20);
        panel.add(qualification);
        panel.add(full_Qualification);
        
        JLabel joiningDate = new JLabel("JoiningDate:");
        joiningDate.setBounds(450,215,180,40);
        String year[] = {"Year","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
        String month[] = {"Month","jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String day[] = {"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        Fcb = new JComboBox(year);
        cb1 = new JComboBox(month);
        cb2 = new JComboBox(day);
        Fcb.setBounds(570,225,75,20);
        cb1.setBounds(640,225,65,20);
        cb2.setBounds(705,225,63,20);
        panel.add(joiningDate);
        panel.add(Fcb);
        panel.add(cb1);
        panel.add(cb2);
        
        JLabel appointedBy = new JLabel("AppointedBy:");
        appointedBy.setBounds(450, 240, 180, 40);
        full_appointedBy = new JTextField();
        full_appointedBy.setBounds(570, 250, 200, 20);
        panel.add(appointedBy);
        panel.add(full_appointedBy);
        
        appointfullbutton = new JButton("Appoint FullTime Staff");
        appointfullbutton.setEnabled(true);
        appointfullbutton.setBounds(265, 290, 300, 25);
        appointfullbutton.addActionListener(this);
        panel.add(appointfullbutton);
        
        
        JLabel title4 = new JLabel();
        title4.setText("For Part-Time Staff");
        title4.setBounds(285, 330, 400, 40);
        Font f2 = new Font("Arial", Font.PLAIN, 29);
        title4.setFont(f2);
        panel.add(title4);        

        JLabel pvacancyNo = new JLabel("VacancyNo:");
        pvacancyNo.setBounds(45, 370, 180, 40);
        part_vacancyNo = new JTextField();
        part_vacancyNo.setBounds(140, 380, 100, 20);
        panel.add(pvacancyNo);
        panel.add(part_vacancyNo);
        
        JLabel pdesignation = new JLabel("Designation:");
        pdesignation.setBounds(45, 395, 180, 40);
        part_Designation = new JTextField();
        part_Designation.setBounds(140, 405, 200, 20);
        panel.add(pdesignation);
        panel.add(part_Designation);
        
        JLabel pjobType = new JLabel("Job Type:");
        pjobType.setBounds(45,420,180,40);
        String ptype[] = {"Full-Time","Part-Time",};
        pcb = new JComboBox(ptype);
        pcb.setBounds(140,430,100,20);
        panel.add(pjobType);
        panel.add(pcb);
        
                
        JLabel pshift = new JLabel ("Shift:");
        pshift.setBounds(450,370,180,40);
        String shift[] = {"Morning","Day","Night"};
        scb = new JComboBox(shift);
        scb.setBounds(570,380,100,20);
        panel.add(pshift);
        panel.add(scb);

        
        
        JLabel pworkingHour = new JLabel("WorkingHour:");
        pworkingHour.setBounds(450, 395, 180, 40);
        partWorkingHour = new JTextField();
        partWorkingHour.setBounds(570, 405, 110, 20);
        panel.add(pworkingHour);
        panel.add(partWorkingHour);
        
                
        JLabel pwages = new JLabel("WagesPerHour:");
        pwages.setBounds(450, 420, 180, 40);
        part_Wages = new JTextField();
        part_Wages.setBounds(570, 430, 110, 20);
        panel.add(pwages);
        panel.add(part_Wages);
        
        addpartbutton = new JButton("Add Vacancy For Part Time Staff");
        addpartbutton.setEnabled(true);
        addpartbutton.addActionListener(this);
        addpartbutton.setBounds(265, 470, 300, 25);
        panel.add(addpartbutton);
        
        JLabel ppvacancyNo = new JLabel("VacancyNo:");
        ppvacancyNo.setBounds(45, 510, 180, 40);
        part_appointVacancy = new JTextField();
        part_appointVacancy.setBounds(140, 520, 100, 20);
        panel.add(ppvacancyNo);
        panel.add(part_appointVacancy);
        
        JLabel pstaffName = new JLabel("StaffName:");
        pstaffName.setBounds(45, 535, 180, 40);
        part_StaffName = new JTextField();
        part_StaffName.setBounds(140, 545, 200, 20);
        panel.add(pstaffName);
        panel.add(part_StaffName);
        
        JLabel pqualification = new JLabel("Qualification:");
        pqualification.setBounds(45, 560, 180, 40);
        part_Qualification = new JTextField();
        part_Qualification.setBounds(140, 570, 200, 20);
        panel.add(pqualification);
        panel.add(part_Qualification);

        JLabel pjoiningDate = new JLabel("JoiningDate:");
        pjoiningDate.setBounds(460,535,180,40);
        pcb0 = new JComboBox(year);
        pcb1 = new JComboBox(month);
        pcb2 = new JComboBox(day);
        pcb0.setBounds(570,545,75,20);
        pcb1.setBounds(640,545,65,20);
        pcb2.setBounds(705,545,63,20);
        panel.add(pjoiningDate);
        panel.add(pcb0);
        panel.add(pcb1);
        panel.add(pcb2);
        
        JLabel pappointedBy = new JLabel("AppointedBy:");
        pappointedBy.setBounds(460, 560, 180, 40);
        part_appointedBy = new JTextField();
        part_appointedBy.setBounds(570, 570, 200, 20);
        panel.add(pappointedBy);
        panel.add(part_appointedBy); 
        
        appointpartbutton = new JButton("Appoint partTime Staff");
        appointpartbutton.setEnabled(true);
        appointpartbutton.addActionListener(this);
        appointpartbutton.setBounds(265, 610, 300, 25);
        panel.add(appointpartbutton);
        
        JLabel tvacancyNo = new JLabel("VacancyNo:");
        tvacancyNo.setBounds(45, 630, 180, 40);
        vacancy_Terminate = new JTextField();
        vacancy_Terminate.setBounds(140, 640, 100, 20);
        panel.add(tvacancyNo);
        panel.add(vacancy_Terminate);
        
        terminatebutton = new JButton("Terminate");
        terminatebutton.setEnabled(true);
        terminatebutton.setBounds(600, 640, 130, 25);
        terminatebutton.addActionListener(this);
        panel.add(terminatebutton);
        
        clearButton = new JButton("Clear");
        clearButton.setEnabled(true);
        clearButton.setBounds(45, 680, 100, 45);
        clearButton.addActionListener(this);
        panel.add(clearButton);          
        
        displaybutton = new JButton("Display");
        displaybutton.setEnabled(true);
        displaybutton.setBounds(670, 680, 100, 45);
        displaybutton.addActionListener(this);
        panel.add(displaybutton);  
        
        

        //for button font
        Font fbtn = new Font("Arial",Font.PLAIN, 15);
        //adding font to the respective buttons
        button.setFont(fbtn);
        appointfullbutton.setFont(fbtn);
        addpartbutton.setFont(fbtn);
        clearButton.setFont(fbtn);
        displaybutton.setFont(fbtn);
        appointpartbutton.setFont(fbtn);
        terminatebutton.setFont(fbtn);
        
        //for textfont
        Font tbtn = new Font("Arial",Font.BOLD, 12);
        //adding font for the labels
        vacancyNo.setFont(tbtn);
        jobType.setFont(tbtn);
        designation.setFont(tbtn);
        salary.setFont(tbtn);
        workingHour.setFont(tbtn);
        fvacancyNo.setFont(tbtn);
        qualification.setFont(tbtn);
        joiningDate.setFont(tbtn);
        staffName.setFont(tbtn);
        appointedBy.setFont(tbtn);
        pvacancyNo.setFont(tbtn);
        pjobType.setFont(tbtn);
        pdesignation.setFont(tbtn);
        pshift.setFont(tbtn);
        pwages.setFont(tbtn);
        pworkingHour.setFont(tbtn);
        ppvacancyNo.setFont(tbtn);
        pstaffName.setFont(tbtn);
        pqualification.setFont(tbtn);
        pjoiningDate.setFont(tbtn);
        pappointedBy.setFont(tbtn);
        tvacancyNo.setFont(tbtn);
        
        //This is a background colour property
        Color color = new Color(240, 240, 240);
        panel.setBackground(color);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            try{
                error = false;
                duplicated = false;
                int vacancyNo = Integer.parseInt(full_vacancyNo.getText());
                String designation = full_Designation.getText();
                String jobType = cb.getSelectedItem().toString();
                int salary = Integer.parseInt(full_Salary.getText());
                int workingHour = Integer.parseInt(full_workingHour.getText());
                if( full_Designation.getText().isEmpty() || cb.getSelectedItem().toString().isEmpty()){
                    error = true;
                    JOptionPane.showMessageDialog(frame, "Empty field found"); 
                }
                else if (full_vacancyNo.getText().isEmpty() ||full_Salary.getText().isEmpty() || full_workingHour.getText().isEmpty()){
                    error = true;
                    JOptionPane.showMessageDialog(frame, "Empty field found");
                }
                else if (cb.getSelectedItem().toString()== "Part-Time"){
                    error = true;
                    JOptionPane.showMessageDialog(frame,"Job-Type invalid");
                }
                for(StaffHire var:list) {
                    if(var.getVacancy_no()==vacancyNo){
                        duplicated=true;
                        break;
                    }
                }
                if(error == false && duplicated == false){
                FullTimeStaffHire ftsh = new FullTimeStaffHire (vacancyNo, designation, jobType, salary, workingHour);
                list.add(ftsh);
                JOptionPane.showMessageDialog(frame,"Full Time staff added!");
                }
                else{
                    JOptionPane.showMessageDialog(frame, "Full-Time staff is already hired");
                }
            }
            catch(Exception ex){
            JOptionPane.showMessageDialog(frame, "Invalid Input");
            }
        }   
        if(e.getSource()==addpartbutton){
            try{
                error = false;
                duplicated = false;
                int vacancy_no = Integer.parseInt(part_vacancyNo.getText());
                String designation = part_Designation.getText();
                String jobType = pcb.getSelectedItem().toString(); 
                int wagesPerHour = Integer.parseInt(part_Wages.getText());
                int workingHour = Integer.parseInt(partWorkingHour.getText());
                String shifts = scb.getSelectedItem().toString();
                if( part_Designation.getText().isEmpty() || pcb.getSelectedItem().toString().isEmpty() || scb.getSelectedItem().toString().isEmpty()){
                    error = true;
                    JOptionPane.showMessageDialog(frame, "Empty field found"); 
                }
                else if (part_vacancyNo.getText().isEmpty() ||part_Wages.getText().isEmpty() || partWorkingHour.getText().isEmpty()){
                    error = true;
                    JOptionPane.showMessageDialog(frame, "Empty field found");
                }
                else if (scb.getSelectedItem().toString()== "Full-Time"){
                    error = true;
                    JOptionPane.showMessageDialog(frame,"Job-Type invalid");
                }
                for(StaffHire var:list) {
                    if(var.getVacancy_no()==vacancy_no){
                        duplicated=true;
                        break;
                    }
                }                
                if(error == false && duplicated==false){
                    PartTimeStaffHire ptsh = new PartTimeStaffHire (vacancy_no, designation, jobType, workingHour,wagesPerHour,shifts);
                    list.add(ptsh);
                    JOptionPane.showMessageDialog(frame,"Part Time staff added!");
                }
                else{
                    JOptionPane.showMessageDialog(frame, "Part-Time staff is already hired");
                }
            }
            catch(Exception ex){
            JOptionPane.showMessageDialog(frame, "Invalid Input");
            }
        } 
        if(e.getSource()==appointfullbutton){
            int cut = 0;
            try{
                error = false;
                int vacancyNo = Integer.parseInt(full_appointVacancy.getText());
                String staffName = full_staffName.getText();
                String qualification = full_Qualification.getText();
                year = Fcb.getSelectedItem().toString();
                month = cb1.getSelectedItem().toString();
                day = cb2.getSelectedItem().toString();
                String joiningDate = (year+month+day).toString();
                String appointedBy = full_appointedBy.getText();
                
                if (full_appointVacancy.getText().isEmpty()){
                    error = true;
                    JOptionPane.showMessageDialog(frame,"Empty field found!");
                }
                else if (full_staffName.getText().isEmpty() || full_Qualification.getText().isEmpty()||Fcb.getSelectedItem().toString().isEmpty()||
                cb1.getSelectedItem().toString().isEmpty()||cb2.getSelectedItem().toString().isEmpty()||full_appointedBy.getText().isEmpty()){
                    error = true;
                    JOptionPane.showMessageDialog(frame,"Empty field found!");
                }
                if(vacancyNo!=0){
                    for (int i =0; i<list.size(); i++){
                        if(list.get(i) instanceof FullTimeStaffHire){
                            FullTimeStaffHire fulltime = (FullTimeStaffHire) list.get(i);
                            int vcnNum = fulltime.getVacancy_no();
                            boolean isjoined = fulltime.getJoined();
                            if(vcnNum == vacancyNo){
                                if(!isjoined){
                                    fulltime.FullTimeStaff_Hire(staffName, joiningDate,  qualification, appointedBy);
                                    JOptionPane.showMessageDialog(frame, "Full-Time staff Appointed");
                                    cut +=1;
                                    break;
                                }
                                else{
                                    JOptionPane.showMessageDialog(frame, "The staff is already appointed.");
                                    break;
                                }
                            }
                        }
                        if(cut==0){
                            JOptionPane.showMessageDialog(frame, "Vacancy Number not valid!");
                        }
                    } 
                }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(frame, "Invalid Input");
            }
        }
        if(e.getSource()==appointpartbutton){
            int cut = 0;
            try{
                error = false;
                int vacancyNo = Integer.parseInt(part_appointVacancy.getText());
                String staffName = part_StaffName.getText();
                String qualification = part_Qualification.getText();
                year = pcb0.getSelectedItem().toString();
                month = pcb1.getSelectedItem().toString();
                day = pcb2.getSelectedItem().toString();
                String joiningDate = (year+month+day).toString();
                String appointedBy = part_appointedBy.getText();
                
                if (part_appointVacancy.getText().isEmpty()){
                    error = true;
                    JOptionPane.showMessageDialog(frame,"Empty field found!");
                }
                else if (part_StaffName.getText().isEmpty() || part_Qualification.getText().isEmpty()||pcb0.getSelectedItem().toString().isEmpty()||
                pcb1.getSelectedItem().toString().isEmpty()||pcb2.getSelectedItem().toString().isEmpty()||part_appointedBy.getText().isEmpty()){
                    error = true;
                    JOptionPane.showMessageDialog(frame,"Empty field found!");
                }
                if(vacancyNo!=0){
                    for (int i =0; i<list.size(); i++){
                        if(list.get(i) instanceof PartTimeStaffHire){
                            PartTimeStaffHire parttime = (PartTimeStaffHire) list.get(i);
                            int vcnNum = parttime.getVacancy_no();
                            boolean Joined = parttime.getJoined(); 
                            if(vcnNum == vacancyNo){
                                if(!Joined){
                                    parttime.Hire_PartTimeStaff(staffName, joiningDate, qualification, appointedBy);
                                    JOptionPane.showMessageDialog(frame, "Part-Time staff Appointed");
                                    cut +=1;
                                    break;
                                }
                                else{
                                    JOptionPane.showMessageDialog(frame, "The staff is already appointed");
                                    break;
                                }
                            }
                        }
                        if(cut==0){
                            JOptionPane.showMessageDialog(frame, "Vacancy Number not valid");
                        }
                    } 
                }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(frame, "Invalid Input");
            }
        }
        if(e.getSource()==terminatebutton){
            int cut = 0;
            int Vacancy = 0;
            try{
                Vacancy = Integer.parseInt(vacancy_Terminate.getText());
                if(Vacancy!=0){
                    for (int i =0; i<list.size(); i++){
                        if(list.get(i) instanceof PartTimeStaffHire){
                            PartTimeStaffHire parttimes = (PartTimeStaffHire) list.get(i);
                            boolean terminate = parttimes.getTerminated();
                            int vacncy = parttimes.getVacancy_no();
                            if(vacncy == Vacancy){
                                if(!terminate){
                                    parttimes.terminate();
                                    JOptionPane.showMessageDialog(frame,"Staff is terminated.");
                                    cut = cut+1;
                                }
                                else{
                                    JOptionPane.showMessageDialog(frame,"Staff is already terminated.");
                                }
                            }
                            break;
                        }  
                        if(cut==0){
                            JOptionPane.showMessageDialog(frame,"Invalid vacancy number");
                        }
                    }
                }
            }     
            catch(Exception ex){
                JOptionPane.showMessageDialog(frame,"Invalid vacancy number.");
            }  
        }
        if(e.getSource()==displaybutton){
            for (int i =0; i<list.size(); i++){
                if(list.get(i) instanceof FullTimeStaffHire){
                    FullTimeStaffHire f = (FullTimeStaffHire) list.get(i);
                    System.out.println("-------- Details of Full-TIme Staff --------");
                    f.Display();
                    System.out.println("");
                }
                else if(list.get(i) instanceof PartTimeStaffHire){
                    PartTimeStaffHire parttime = (PartTimeStaffHire) list.get(i);
                    System.out.println("-------- Details of Part-Time Staff --------");
                    parttime.Display();
                    System.out.println("");
                }
            }
        }
        if(e.getSource()==clearButton){
            full_vacancyNo.setText("");
            full_Designation.setText("");
            cb.setSelectedIndex(0);
            full_Salary.setText("");
            full_workingHour.setText("");
            full_appointVacancy.setText("");
            full_staffName.setText("");
            full_Qualification.setText("");
            Fcb.setSelectedIndex(0);
            cb1.setSelectedIndex(0);
            cb2.setSelectedIndex(0);
            full_appointedBy.setText("");
            part_vacancyNo.setText("");
            part_Designation.setText("");
            pcb.setSelectedIndex(0);
            scb.setSelectedIndex(0);
            partWorkingHour.setText("");
            part_Wages.setText("");  
            part_appointVacancy.setText("");
            part_StaffName.setText("");
            pcb0.setSelectedIndex(0);
            pcb1.setSelectedIndex(0);
            pcb2.setSelectedIndex(0);
            part_appointedBy.setText("");
            vacancy_Terminate.setText(""); 
            JOptionPane.showMessageDialog(frame, "Cleared");       
        }
    }
    public static void main(String[] args){
        INGNepal obj = new INGNepal();
        obj.report();
    }
}