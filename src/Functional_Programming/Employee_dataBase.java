package Functional_Programming;

import java.util.*;
import java.util.stream.Collectors;

public class Employee_dataBase extends Employee {

    public static List<Employee> employeeList = new ArrayList<Employee>();

    public Employee_dataBase(int id, String name, int age, String gender, String department, int yoj, long salary) {
        super(id, name, age, gender, department, yoj, salary);
    }

    public static void main(String[] args) {


        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 157000));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700));
        // System.out.println(employeeList);

        //  Get_GenderWise_Data("Male");

        //  get_Department();

        find_Avg_Age("Male");
        // fetch_Highest_paid();

        // fetch_Emp_joined(2015);
        count_emp_EachDep();
    }


    public static void Get_GenderWise_Data(String gender) {
        Map<Boolean, List<Employee>> list = employeeList.stream().collect(Collectors.partitioningBy(i -> i.getEmp_GENDER().equals(gender)));
        // System.out.println(list);
        System.out.println("Femaile Employees count " + list.get(true).size() + "\n" +
                "Male Employees count " + list.get(false).size());
    }

    public static void get_Department() {
        //Object dep = employeeList.stream().filter(i -> i.getEmp_DEPARTMENT()).collect(Collectors.toList());
        List<String> dep = employeeList.stream().map(Employee::getEmp_DEPARTMENT).filter(Objects::nonNull).distinct().collect(Collectors.toList());
        System.out.println(dep);

    }

    public static void find_Avg_Age(String gender) {
        Map<Boolean, List<Employee>> emplist = employeeList.stream().collect(Collectors.partitioningBy(i -> i.getEmp_GENDER().equals(gender)));
        System.out.println(emplist);
        List<Employee> maleList = emplist.get(true);
        List<Employee> femaleList = emplist.get(false);
        //fetching Avg from maleList
        Double male_Avg_Age = maleList.stream().collect(Collectors.averagingInt(Employee::getEmp_AGE));
        Double female_Avg_Age = femaleList.stream().collect(Collectors.averagingInt(Employee::getEmp_AGE));
        System.out.println("Male Avg Age is " + male_Avg_Age);
        System.out.println("Female Avg Age is " + female_Avg_Age);


    }

    public static void fetch_Highest_paid() {
        Employee minSalary = employeeList.stream().min(Comparator.comparing(Employee::getEmp_SALARY)).get();
        System.out.println("Max Paid Employee " + minSalary);
        Employee maxSalary = employeeList.stream().max(Comparator.comparing(Employee::getEmp_SALARY)).get();
        System.out.println("Min Paid Employee " + maxSalary);
    }

    public static void fetch_Emp_joined(int doj) {
        List<Employee> empData = employeeList.stream().filter(employee -> employee.getEmp_YOJ() > doj).collect(Collectors.toList());
        System.out.println("Below are the Details of Employees joined After " + doj);
        empData.forEach(System.out::println);
    }

    public static void count_emp_EachDep() {
        Map<String, Long> empData = employeeList.stream().collect(Collectors.groupingBy(Employee::getEmp_DEPARTMENT, Collectors.counting()));
        System.out.println(empData);
    }

    public static void Avg_Salary_Of_EachDemp()
    {
        Map<String, Double> avgSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getEmp_DEPARTMENT, Collectors.averagingLong(Employee::getEmp_SALARY)));
        System.out.println("The Average Salary is below");
        System.out.println(avgSalary);
    }
}

