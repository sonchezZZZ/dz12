package first_task;

public class Employee implements Comparable<Employee> {
    public static int count;
    private int ID;
    private String name;
    private String surname;
    private double pay;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        ID = ++count;
    }

    public Employee(String name, String surname, double pay) {
        this(name, surname);
        this.pay = pay;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getPay() {
        return pay;
    }

    @Override
    public int compareTo(Employee person) {
        if (this.getID() > person.getID()) {
            return 1;
        } else if (this.getID() < person.getID()) {
            return -1;
        }
        return 0;
    }
}
