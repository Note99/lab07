package human;

interface Alive {
    void live();
}

class Student implements Alive {
    private String course;

    public Student(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void live() {
        System.out.println("Student is living.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Computer Science");
        System.out.println("Course: " + student.getCourse());
        student.setCourse("Mathematics");
        System.out.println("Updated Course: " + student.getCourse());
        student.live();
    }
}
