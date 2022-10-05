public class Midl {
    private static final Employee[] employees = new Employee[10];

    public static void increaseSalary(int percent) {
        for (Employee employee : employees) {
            int currentSalary = employee.getSalary();
            employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
        }
    }

    public static Employee findMinSalaryPersonOfTeam(int teamNumber, int percent) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != teamNumber)
                continue;
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findMaxSalaryPersonOfTeam(int teamNumber) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != teamNumber)
                continue;
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static int sumTotalSalaryOfTeam(int teamNumber) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == teamNumber)
                sum += employee.getSalary();
        }
        return sum;
    }

    public static float sumAverageSalaryOfTeam(int teamNumber) {
        int numberCount = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == teamNumber) {
                sum += employee.getSalary();
                numberCount++;
            }
        }
        return sum / (float) numberCount;
    }

    public static void increaseSalaryOfTeam(int teamNumber, int percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == teamNumber) {
                int currentSalary = employee.getSalary();
                employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
            }
        }
    }

    public static void printTeam(int teamNumber) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == teamNumber) {
                System.out.println(employee);
            }
        }
    }

    public static void printEmployeesWithLessSalaryThen(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary){
                System.out.println(employee);
            }
        }
    }

    public static void printEmployeesWithMoreSalaryThen(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println(employee);
            }
        }
    }
}
