public class Main {
    public static void main(String[] args) {

        Person student = new Student("Anna", "Bieliaieva", 19, 12345);
        student.getInfo();


        Person employee = new Employee("Kate", "Bla", 25);
        employee.getInfo();
    }
}
