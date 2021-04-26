import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vasya Pravnik");
        student.setRate(170);
        student.setId(6);
        StudentDb studentDb = new StudentDb();
        //studentDb.addStudent(student);
        //studentDb.deleteStudent(student);
        //Student student1 = studentDb.findStudent(5);
        //System.out.println(student1.getId());
        //System.out.println(student1.getName());
        //System.out.println(student1.getRate());
        List<Student> students = studentDb.showAllStudents();
        for(Student s : students){
            System.out.println(s.getId() + " " + s.getName() + " " + s.getRate());
        }

        System.out.println("Operation complete");
    }
}
