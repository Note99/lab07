public class Main {
    public static void main(String[] args) {
        Student student = new Student("Computer Science");
        System.out.println("Course: " + student.getCourse());
        student.setCourse("Mathematics");
        System.out.println("Updated Course: " + student.getCourse());
        student.live();
    }
}
