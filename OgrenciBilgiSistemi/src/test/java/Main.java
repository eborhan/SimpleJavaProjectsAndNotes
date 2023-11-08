public class Main {
    public static void main(String[] args) {

        Course math = new Course("Math", "MTH101", "MTH");
        Course physics = new Course("Physics", "PHY101", "PHY");
        Course chemistry = new Course("Chemistry", "CHM101", "CHM");

        Teacher t1 = new Teacher("Carl Friedrich Gauss", "000", "MTH");
        Teacher t2 = new Teacher("Albert Einstein", "111", "PHY");
        Teacher t3 = new Teacher("Marie Curie", "222", "CHM");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Inek Saban", 4, "1111", math, physics, chemistry);
        s1.addBulkExamGrade(20, 20, 20);
        s1.addBulkQuizNote(45, 62, 71);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi", 4, "2222", math, physics, chemistry);
        s2.addBulkExamGrade(69, 81, 31);
        s2.addBulkQuizNote(65, 85, 85);
        s2.isPass();

        Student s3 = new Student("Ferit", 4, "3333", math, physics, chemistry);
        s3.addBulkExamGrade(25, 65, 50);
        s3.addBulkQuizNote(60, 50, 70);
        s3.isPass();
    }
}
