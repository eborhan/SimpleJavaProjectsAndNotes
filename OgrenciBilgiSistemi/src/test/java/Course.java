public class Course {
    Teacher courseTeacher;
    String name, code, prefix;
    int grade;
    double quiz;


    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.grade = 0;
        this.quiz = 0;
    }

    public void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.courseTeacher = teacher;
            System.out.println("Transaction successful!");
        } else {
            System.out.println(teacher.name + " cannot teach this course!");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " is taught by " + courseTeacher.name);
        } else {
            System.out.println(this.name + " is taught by no teacher!");
        }
    }
}
