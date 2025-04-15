package Java_8_Package;

public class Employee {

    private int emp_ID;
    private String emp_name;
    private long emp_Salary;

    //constructor

    public Employee(int id, String name, long salary) {
        emp_ID = id;
        emp_name = name;
        emp_Salary = salary;
    }

    public int getEmp_ID() {
        return emp_ID;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public long getEmp_Salary() {
        return emp_Salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_ID=" + emp_ID +
                ", emp_name='" + emp_name + '\'' +
                ", emp_Salary=" + emp_Salary +
                '}';
    }
}
