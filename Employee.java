public class Employee {
    String name;
    int age;
    double salary;
    int yearsOfExp;
    String dept;
    int rating;
    static int leave;
    public Employee(String name, int age, double salary, int yearsOfExp, String dept, int rating)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.yearsOfExp=yearsOfExp;
        this.dept=dept;
        this.rating=rating;
        leave=10;
    }
}
