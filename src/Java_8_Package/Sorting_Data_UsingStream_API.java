package Java_8_Package;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting_Data_UsingStream_API {


    public static void main(String[] args) {


        System.out.println("This is using Lamda Expression");
        System.out.println("Sorting data in Ascending order based on Employee ID");
        getEmployeeDetails().stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getEmp_ID() - o2.getEmp_ID());
            }
        }).forEach(System.out::println);
        System.out.println("Sorting data in Descending order based on Employee ID");

        getEmployeeDetails().stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getEmp_ID() - o1.getEmp_ID());
            }
        }).forEach(System.out::println);

        System.out.println("This is using Comparators");
        System.out.println("Sorting data in Descending order based on Employee ID");
        getEmployeeDetails().stream().sorted(Comparator.comparingInt(Employee::getEmp_ID).reversed()).forEach(System.out::println);


        System.out.println("Sorting Data Using Name in Ascending Order");
        getEmployeeDetails().stream().sorted(Comparator.comparing(Employee :: getEmp_name)).forEach(System.out::println);

        System.out.println("Sorting Data Using Name in Descending Order");
    getEmployeeDetails().stream().sorted(Comparator.comparing(Employee ::getEmp_name).reversed()).forEach(System.out::println);
    }


    private static List<Employee> getEmployeeDetails() {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(105, "Ronald", 25000));
        employeeList.add(new Employee(102, "Fredrick", 30000));
        employeeList.add(new Employee(107, "Swathi", 10000));
        employeeList.add(new Employee(1007, "Arun", 100000));
        return employeeList;
    }


}


