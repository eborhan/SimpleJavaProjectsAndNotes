public class Student {
    String name, stuNo;
    int yearOfStudy;
    Course math, physics, chemistry;
    double average;
    boolean isPass;

    Student(String name, int yearOfStudy, String stuNo, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.yearOfStudy = yearOfStudy;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.isPass = false;
    }

    public void addBulkExamGrade(int math, int physics, int chemistry) {
        if (math >= 0 && math <= 100) {
            this.math.grade = math;
        }
        if (physics >= 0 && physics <= 100) {
            this.physics.grade = physics;
        }
        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.grade = chemistry;
        }
    }

    public void addBulkQuizNote(int math, int physics, int chemistry) {
        if (math >= 0 && math <= 100) {
            this.math.quiz = math;
        }
        if (physics >= 0 && physics <= 100) {
            this.physics.quiz = physics;
        }
        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.quiz = chemistry;
        }
    }

    public void isPass() {
        if (this.math.grade == 0 || this.physics.grade == 0 || this.chemistry.grade == 0) {
            System.out.println("Grades are missing!");
        } else {
            this.isPass = isCheckPass();
            printGrade();
            System.out.println("Average: " + this.average);
            if (this.isPass) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed!");
            }
        }
    }

    public void calcAverage() {
        this.average = ((this.physics.grade * 0.8 + this.physics.quiz * 0.2) +
                (this.chemistry.grade * 0.8 + this.chemistry.quiz * 0.2) +
                (this.math.grade * 0.8 + this.chemistry.quiz * 0.2)) / (3);
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printGrade() {
        System.out.println("=========================");
        System.out.println("Student: " + this.name);
        System.out.println("Math grade : " + (this.math.grade * 0.8 + this.math.quiz * 0.2));
        System.out.println("Physics grade : " + (this.physics.grade * 0.8 + this.physics.quiz * 0.2));
        System.out.println("Chemistry grade : " + (this.chemistry.grade * 0.8 + this.physics.quiz * 0.2));
    }
}
