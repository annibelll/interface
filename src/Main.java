public class Main {
    public static void main(String[] args) {
        // Создаём объект класса Student
        Person student = new Student("Anna", "Bieliaieva", 19, 12345);
        student.getInfo();

        // Создаём объект класса Employee
        Person employee = new Employee("Kate", "Bla", 25);
        employee.getInfo();
    }
}
