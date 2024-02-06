public class Person1 { //this is the parent class

    String name;
    int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("venkat", 25, 234, 26000);
        System.out.println("Name : " + employee1.name);
        System.out.println("age : " + employee1.age);
        System.out.println("employeeID : " + employee1.employeeID);
        System.out.println("salary : " + employee1.salary);

    }
}

class Employee extends Person1{ //This is the child class and it extends from parent class (Person)

    int employeeID;
    double salary;

    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);// Using super keyword to initialize person attributes
        this.employeeID = employeeID;
        this.salary = salary;
    }
}

