import java.util.Scanner;


fun main() {
    println("Enter the name of the course:");
    val input = Scanner(System.`in`)
    val courseName = input.nextLine()
    val japaneseCourse = Course(courseName);
    println("What do you want to do with course $courseName");
    println("(1) Add class \n(2) Remove Class \n(3) Add Student\n(4) Remove Student \n(5) Print Course information \n(6) Quit");
    var choice: Int = input.nextInt();
    while (choice < 1 && choice > 6) {
        println("Please choose between 1 and 6");
        choice = input.nextInt()
    }
    /// when(choice){
    //1 -> japaneseCourse.addClassroom()
    //2 -> japaneseCourse.removeClass()
    // 3 -> japaneseCourse.addStudent() YOU SHOULD ADD YOUR OWN VARIABLES IN HERE TO USE THESE FUNCTIONS
    //   4 -> japaneseCourse.removeStudent()
    //     5 -> japaneseCourse.printCourseInfo()
    //       else -> println("Thanks for using this system");
//}

}
