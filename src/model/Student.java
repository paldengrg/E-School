package model;

<<<<<<< HEAD
=======


>>>>>>> 89056bda2dfdd0a860d0b51e785225fa9e50fef1
public class Student {
    //creation of instance variable
    private int std_id;
    private String std_name;
    private int std_age;
    private String std_address;
    private int std_contact;

<<<<<<< HEAD
    //Creation of public constructior
=======


   //Creation of public constructior
>>>>>>> 89056bda2dfdd0a860d0b51e785225fa9e50fef1
    public Student(int std_id, String std_name, int std_age, String std_address, int std_contact){
        this.std_id=std_id;
        this.std_name=std_name;
        this.std_age=std_age;
        this.std_address=std_address;
        this.std_contact=std_contact;
<<<<<<< HEAD
    } 

    //creation of public getter and setter --> for student ID
=======
    }



   //creation of public getter and setter --> for student ID
>>>>>>> 89056bda2dfdd0a860d0b51e785225fa9e50fef1
    public void setStudentId(int newStudentId) {
        this.std_id=newStudentId;
    }

<<<<<<< HEAD
    public int getStudentId() {
=======


   public int getStudentId() {
>>>>>>> 89056bda2dfdd0a860d0b51e785225fa9e50fef1
        return this.std_id;
    }
    
    public void setStudentname(String newStudentname) {
        this.std_name=newStudentname;
    }

<<<<<<< HEAD
    public String getStudentname() {
        return this.std_name;
    }

    public void setStudentage(int newStudentage) {
        this.std_age=newStudentage;
    }

    public int getStudentage() {
        return this.std_age;
    }

    public void setStudentaddress(String newStudentaddress) {
        this.std_address=newStudentaddress;
    }

    public String getStudentaddress() {
        return this.std_address;
    }

    public void setStudentcontact(int newStudentcontact) {
        this.std_contact=newStudentcontact;
    }

    public int getStudentcontact() {
=======


   public String getStudentname() {
        return this.std_name;
    }



   public void setStudentage(int newStudentage) {
        this.std_age=newStudentage;
    }



   public int getStudentage() {
        return this.std_age;
    }



   public void setStudentaddress(String newStudentaddress) {
        this.std_address=newStudentaddress;
    }



   public String getStudentaddress() {
        return this.std_address;
    }



   public void setStudentcontact(int newStudentcontact) {
        this.std_contact=newStudentcontact;
    }



   public int getStudentcontact() {
>>>>>>> 89056bda2dfdd0a860d0b51e785225fa9e50fef1
        return this.std_contact;
    }
}