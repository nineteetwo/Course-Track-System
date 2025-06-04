data class studentInfo(
    val name: String, var age: Int, var level: courseLevel, val id: Int, var Class: StudentClass?
) {
    fun updateLevel() {
        level = level.nextLevel();
    }

    fun removeFromClass() {
        Class = null;
    }

    fun addToClass(Class_: StudentClass) {
        Class = Class_;
    }


}

