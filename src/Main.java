public class Main {
    public static void main(String[] args) {
        // Создаём объект класса Student
        Person student = new Student("Anna", "Bieliaieva", 19, 12345);
        student.getInfo(); // Вызываем метод getInfo() для объекта student

        // Создаём объект класса Employee
        Person employee = new Employee("Kate", "Bla", 25);
        employee.getInfo(); // Вызываем метод getInfo() для объекта employee
    }
}
