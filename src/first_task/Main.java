package first_task;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        first task
        Employee emp1 = new Employee("Ваня", "Бурлака", 2500);
        Employee emp2 = new Employee("Андрей", "Водянов", 5000);
        Employee emp3 = new Employee("Вася", "Гайдабура", 4000);
        Employee emp4 = new Employee("Антон", "Минчук", 4000);

        List<Employee> employs = new ArrayList<>();

        employs.add(emp2);
        employs.add(emp3);
        employs.add(emp1);
        employs.add(emp4);
        System.out.println("List Before sort by ID: ");
        for (int i = 0; i < employs.size(); i++) {
            System.out.println(employs.get(i).getName() + " " + employs.get(i).getID());
        }
        Collections.sort(employs);

        System.out.println("\nList after sort by ID: ");
        for (int i = 0; i < employs.size(); i++) {
            System.out.println(employs.get(i).getName() + " " + employs.get(i).getID());
        }

//        second task
        System.out.println("\nList before sort by Pay: ");
        for (int i = 0; i < employs.size(); i++) {
            System.out.println(employs.get(i).getName() + " " + employs.get(i).getPay());
        }
        Collections.sort(employs, new EmployByPayComparator());
        System.out.println("\nList after sort by Pay: ");
        for (int i = 0; i < employs.size(); i++) {
            System.out.println(employs.get(i).getName() + " " + employs.get(i).getPay());
        }

//       third task
        System.out.println("\nList before sort by Pay given the name: ");
        for (int i = 0; i < employs.size(); i++) {
            System.out.println(employs.get(i).getName() + " " + employs.get(i).getPay());
        }
        Collections.sort(employs, new EmployeeBePayAndNameComparator());
        System.out.println("\nList after sort by Pay given the name: ");
        for (int i = 0; i < employs.size(); i++) {
            System.out.println(employs.get(i).getName() + " " + employs.get(i).getPay());
        }


    }


}
