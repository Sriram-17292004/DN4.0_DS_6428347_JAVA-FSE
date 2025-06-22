public class EmployeeManager {
    private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee emp) {
        if (size < employees.length) {
            employees[size++] = emp;
            System.out.println("Employee added: " + emp);
        } else {
            System.out.println("Employee array is full!");
        }
    }

    public void searchEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == id) {
                System.out.println("Employee found: " + employees[i]);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void listEmployees() {
        if (size == 0) {
            System.out.println("No employees in the system.");
            return;
        }
        System.out.println("Employee List:");
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == id) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                System.out.println("Employee deleted with ID: " + id);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        Employee e1 = new Employee(101, "Alice", "Manager", 50000);
        Employee e2 = new Employee(102, "Bob", "Developer", 40000);
        Employee e3 = new Employee(103, "Charlie", "Designer", 35000);

        manager.addEmployee(e1);
        manager.addEmployee(e2);
        manager.addEmployee(e3);

        manager.listEmployees();

        manager.searchEmployee(102);

        manager.deleteEmployee(102);
        manager.listEmployees();
    }
}
