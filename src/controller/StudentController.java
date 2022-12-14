package Controller;
import Database.DbConnection;
import Model.Student;

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

    public int updateStudent(Student student) {
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