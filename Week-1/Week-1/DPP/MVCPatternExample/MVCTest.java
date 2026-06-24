package DPP.MVCPatternExample;

public class MVCTest {


    public static void main(String[] args) {


        Student student =
                new Student(
                    "John",
                    101,
                    "A"
                );



        StudentView view =
                new StudentView();



        StudentController controller =
                new StudentController(
                    student,
                    view
                );



        // Display initial details

        controller.updateView();



        System.out.println("----------------");



        // Update student details

        controller.setStudentName("David");

        controller.setStudentGrade("A+");



        // Display updated details

        controller.updateView();
    }
}
