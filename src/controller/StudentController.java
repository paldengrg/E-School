<<<<<<< HEAD
package Controller;
import Database.DbConnection;
import model.Student;

=======
package controller;
import database.DbConnection;
import model.Student;



>>>>>>> 89056bda2dfdd0a860d0b51e785225fa9e50fef1
public class StudentController {
    DbConnection dbConnection;
    public int insertStudent(Student student) {
        int id=student.getStudentId();
        String name=student.getStudentname();
        String address=student.getStudentaddress();
        int age=student.getStudentage();
        int contact=student.getStudentcontact();
        String insertQuery=String.format("insert into tbl_student(std_id,std_name,std_address,std_age,std_contact) values(%d, '%s','%s',%d,%d)", id,name,address,age,contact);
        dbConnection=new DbConnection();
        int result=dbConnection.manipulate(insertQuery);
        return result;
    }

<<<<<<< HEAD
    public int updateStudent(Student student) {
=======


   public int updateStudent(Student student) {
>>>>>>> 89056bda2dfdd0a860d0b51e785225fa9e50fef1
        int id=student.getStudentId();
        String name=student.getStudentname();
        String address=student.getStudentaddress();
        int age=student.getStudentage();
        int contact=student.getStudentcontact();
        String updateQuery=String.format("UPDATE tbl_students SET std_name='%s', std_age=%d where setstdudentId=%d",name,age,id);
        dbConnection=new DbConnection();
        int result=dbConnection.manipulate(updateQuery);
        return result;
    }
    public int Updatepass(String email,String Pass){
        String updateQuery=String.format("UPDATE tbl_students SET userpassword='%s' where email='%s'",Pass,email);
        dbConnection=new DbConnection();
        int result=dbConnection.manipulate(updateQuery);
        return result;
    }
}