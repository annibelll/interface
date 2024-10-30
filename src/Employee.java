public class Employee implements Person {
    private String name;
    private String surname;
    private int age;
    private int retirement_age;

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.retirement_age = 62 - age;
    }

    @Override
    public void getInfo() {
        System.out.println("Name: " + name + " Surname: " + surname + " Age: " + age + " Years until retirement: " + retirement_age);
    }
}

