import java.util.Scanner;

class Course(var name: String) {
    var allStudents: MutableList<Student> = mutableListOf();
    var studentCount: Int = allStudents.size;
    var classCount: Int = 0;
    var savedCount: Int = studentCount;
    var checkNull: Boolean = false;
    fun addStudent(student: Student) {
        allStudents.add(student);
    }

    fun addClassroom(classroom: StudentClass) {
        for (student in classroom.Class) {
            allStudents.add(student);
            studentCount++;
        }
        if (savedCount != studentCount) {
            savedCount = studentCount;
            classCount++;
            println("Classroom named ${classroom.name} added successfully.");
        }

    }

    fun removeStudent(student: Student) {
        for (student_ in allStudents) {
            if (student == student_) {
                allStudents.remove(student);
                studentCount--
            }
        }
        if (savedCount == studentCount) {
            println("${student.info.name} couldn't be found.");
        } else {
            println("${student.info.name} has been removed from class")
        }
        savedCount = studentCount;
    }

    fun removeClassroomStudents(classroom: StudentClass) {
        for (student in classroom.Class) {
            allStudents.remove(student);
            studentCount--;
        }
        if (savedCount != studentCount) {
            savedCount = studentCount;
            println("Classroom named ${classroom.name} has been removed successfully.");
        }

    }

    fun removeClass(classroom: StudentClass) {
        var count: Int = classroom.Class.size
        var countSaved: Int = count;
        for (student in classroom.Class) {
            for (student_ in allStudents) {
                if (student == student_) {
                    student.info.removeFromClass();
                    count--;
                }
            }

        }
        if (count != countSaved) {
            println("Classroom named${classroom.name} has been removed from the Course named $name successfully");
        } else {
            println("Classroom named${classroom.name} could not be found in the course named $name")
        }
    }

    fun printCourseInfo() {
        println("Course Name: $name \n Number of students: ${allStudents.size}");
        println("Number of Classes: $classCount");
        println("Do you want to see all classes and students? \n (1) Yes | (2)No");
        val input = Scanner(System.`in`);
        var choice: Int = input.nextInt();
        while (choice != 1 && choice != 2) {
            println("Only these options are usable.");
            choice = input.nextInt();
        }
        when (choice) {
            1 -> {
                for (student in allStudents) {
                    if (student.info.Class == null) {
                        checkNull = true;
                    }
                    student.printStudentInfo()
                }
                if (checkNull) {
                    println("there're some students that aren't alligned to any class. \n Do you want to see who are they?");
                    println("(1) Yes | (2) No");
                    var userChoice: Int = input.nextInt();
                    while (choice != 1 && choice != 2) {
                        println("Only these options are usable.");
                        choice = input.nextInt();
                    }
                    for (students in allStudents) {
                        if (students.info.Class == null) {
                            students.printStudentInfo();
                        }
                    }

                }
                println("Thank you for using this program.");
            }

            else -> println("Thank you for using this program.");


        }
    }


}
