
public class Student implements Person {
    private String name;
    private String surname;
    private int age;
    private int student_ID;

    public Student(String name, String surname, int age, int student_ID) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.student_ID = student_ID;
    }

    @Override
    public void getInfo() {
        System.out.println("Name: " + name + " Surname: " + surname + " Age: " + age + " Student ID: " + student_ID);
    }
}
