public class Employee {
    private static int counter = 0;
    private Integer id;
    private String name;
    private String Surname;
    private String lastname;
    private int department;
    private int salary;

    public Employee(String name, String Surname, String lastname, int department, int salary) {
        this.name = name;
        this.Surname = Surname;
        this.lastname = lastname;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.Surname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary(){
        return this.salary;
    }
    public Integer getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee( " + "Id=" + id + ", Фамилия=" + Surname + ", Имя=" + name + ", Отчество=" + lastname + ", Отдел=" + department + ", Зарплата=" + salary + " )";
    }
}

