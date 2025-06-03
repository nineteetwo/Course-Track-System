class Student(val info: studentInfo) {
    fun printStudentInfo() {
        println("Student name: ${info.name}, Student id: $info.id, age: ${info.age}");
    }

    fun updateLevel() {
        info.updateLevel();
        println("${info.name}'s new level is ${info.level}");
    }


}