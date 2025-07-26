public class StudentInfo {
    public static void main(String[] args) {

    Student student1 = new Student("Mohamed", 21, 3.5);
    Student student2 = new Student("Aya", 22, 3.7);

        student1.displayInfo();
        student2.displayInfo();

        student1.study();
        student2.study();
}
}