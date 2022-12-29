package view;

<<<<<<< HEAD
import Controller.StudentController;
import model.Student;

=======


import controller.StudentController;
import model.Student;



>>>>>>> 89056bda2dfdd0a860d0b51e785225fa9e50fef1
public class StudentView {
    public static void main(String[] args) {
        Student s1 = new Student(2, "Prasanna", 20, "Chitwan", 364548);
        StudentController sc = new StudentController();
        int insertedStudent = sc.insertStudent(s1);

<<<<<<< HEAD
        if (insertedStudent > 0) {
=======


       if (insertedStudent > 0) {
>>>>>>> 89056bda2dfdd0a860d0b51e785225fa9e50fef1
            System.out.println("Student inserted");
        } else {
            System.out.println("Failed to insert student");
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 89056bda2dfdd0a860d0b51e785225fa9e50fef1
