package org.example.Task3;

public class Task3{
    public static void main(String[] args) {
        Person p1 = new Person("James", 10);
        Person p2 = new Person("Brenda", 12);

        System.out.println("p1 Original identity was "+p1.getName()+" and they were "+ p1.getAge());
        System.out.println("p2 Original identity was "+p2.getName()+" and they were "+ p2.getAge());

        MakingChanges.changIdentities(p1,p2);

        System.out.println("p1  identity now is "+p1.getName()+" and they are "+ p1.getAge());
        System.out.println("p2 identity is "+p2.getName()+" and they are "+ p2.getAge());

    }

}
