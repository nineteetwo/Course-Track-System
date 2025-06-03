class StudentClass(var name: String, var level: courseLevel) {
    var Class: MutableList<Student> = mutableListOf();
    var classroomSize: Int = Class.size;
    fun addStudent(student: Student) {
        if (student.info.level == level) {
            Class.add(student);
            student.info.addToClass(this)
            classroomSize++
            println(student.info.name + " has been added to $name named class succesfully.")
        } else {
            println("Levels between class and ${student.info.name} are different");
        }
    }

    fun removeStudent(student: Student) {
        var oldClassSize = classroomSize;
        for (index in Class.indices) {
            if (Class[index] == student) {
                Class.removeAt(index);
                Class[index].info.removeFromClass()
                println("${student.info.name} has been removed from class named $name.")

            }
        }
        if (oldClassSize == classroomSize) {
            println("student named " + student.info.name + " could not found.");
        }

    }

    fun displayClassInfo() {
        println("Class info for class named: $name");
        println("Level: $level");
        for (student in Class) {
            student.printStudentInfo();
        }
        println("----------------------------")
    }

    fun checkClassLevel() {
        var oldClassSize = classroomSize;
        for (student in Class) {
            if (student.info.level != level) {
                removeStudent(student);
                println("${student.info.name} has been removed from classroom due to level insignificance");
                classroomSize--;
            }
        }
        if (oldClassSize == classroomSize) {
            println("everyone's level is the same with the class");
        }
    }


}