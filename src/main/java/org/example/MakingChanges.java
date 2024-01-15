package org.example;

public class MakingChanges {

    public static void changIdentities(Person p1, Person p2){

        String p1TempName= p1.getName();
        int p1TempAge = p1.getAge();
        p1.setName(p2.getName());
        p1.setAge(p2.getAge());

        p2.setAge(p1TempAge);
        p2.setName(p1TempName);


    }
}
