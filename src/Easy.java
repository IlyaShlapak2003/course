import java.util.Arrays;

public class Easy {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee per1 = new Employee("Адриан", "Михайлов", "Алексеевич", 1, 13498);
        Employee per2 = new Employee("Александр", "Горбачёв", "Ярославович", 2, 25647);
        Employee per3 = new Employee("Роман", "Колесников", "Даниилович", 3, 124537);
        Employee per4 = new Employee("Лазарь", "Миронов", "Миронов", 4, 57361);
        Employee per5 = new Employee("Вальтер", "Ефимов", "Богданович", 5, 37844);
        Employee per6 = new Employee("Аза", "Воробьёва", "Лукьевна", 1, 14752);
        Employee per7 = new Employee("Юлия", "Мишина", "Протасьевна", 2, 23895);
        Employee per8 = new Employee("Кара", "Баранова", "Созоновна", 3, 115567);
        Employee per9 = new Employee("Ева", "Якушева", "Матвеевна", 4, 55647);
        Employee per10 = new Employee("Эрида", "Воронова", "Геласьевна", 5, 32692);
        employees[0] = per1;
        employees[1] = per2;
        employees[2] = per3;
        employees[3] = per4;
        employees[4] = per5;
        employees[5] = per6;
        employees[6] = per7;
        employees[7] = per8;
        employees[8] = per9;
        employees[9] = per10;
        Employee[] emp = Arrays.copyOf(employees, 11);
        Arrays.stream(emp).forEach(System.out::println);
        System.out.println(emp.length);
    }

    public static void printPerson() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findPersonWithMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary()<minSalary) {
                minSalary= employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findPersonWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static int averageSalary() {
        int count=0;
        int sum=0;
        for(Employee employee:employees){
            if (employee!=null){
                count++;
                sum+=employee.getSalary();
            }
        }
        return sum/count;
    }

    public static void printPersons() {
        for (Employee employee : employees)
            System.out.print((employee.getSurname()) + " " + employee.getName() + " " + employee.getLastname());
    }
}
