package first_task;

import java.util.Comparator;

public class EmployByPayComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getPay() > o2.getPay()) {
            return 1;
        } else if (o1.getPay() < o2.getPay()) {
            return -1;
        } else {
            return 0;
        }
    }
}
