package Functional_Programming;

public class Employee {


    private int emp_ID;
    private String emp_NAME;
    private int emp_AGE;
    private String emp_GENDER;
    private String emp_DEPARTMENT;
    private int emp_YOJ;
    private Long emp_SALARY;

    @Override
    public String toString() {
        return "Employee{" +
                "emp_ID=" + emp_ID +
                ", emp_NAME='" + emp_NAME + '\'' +
                ", emp_AGE=" + emp_AGE +
                ", emp_GENDER='" + emp_GENDER + '\'' +
                ", emp_DEPARTMENT='" + emp_DEPARTMENT + '\'' +
                ", emp_YOJ='" + emp_YOJ + '\'' +
                ", emp_SALARY=" + emp_SALARY +
                '}';
    }

    public Employee(int id, String name, int age, String gender, String department, int yoj, long salary) {
        emp_ID = id;
        emp_NAME = name;
        emp_AGE = age;
        emp_GENDER = gender;
        emp_DEPARTMENT = department;
        emp_YOJ = yoj;
        emp_SALARY = salary;
    }

    public int getEmp_ID() {
        return emp_ID;
    }

    public String getEmp_NAME() {
        return emp_NAME;
    }

    public int getEmp_AGE() {
        return emp_AGE;
    }

    public String getEmp_GENDER() {
        return emp_GENDER;
    }

    public String getEmp_DEPARTMENT() {
        return emp_DEPARTMENT;
    }

    public int getEmp_YOJ() {
        return emp_YOJ;
    }

    public Long getEmp_SALARY() {
        return emp_SALARY;
    }
}
