package first_task;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList subordinates = new ArrayList();

    public Manager(String name, String surname) {
        super(name, surname);
    }

    public void addSubord(Employee person){
        subordinates.add(person.getID());
    }

    public ArrayList getSubordinates(){

        return subordinates;
    }
}
