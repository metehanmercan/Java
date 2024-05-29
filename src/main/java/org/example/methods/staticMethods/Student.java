package org.example.methods.staticMethods;

public class Student {
    private int id;
    private String name;

    private static String lastName;

    public static void write(){
        System.out.println("Soy isim : " +lastName);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        Student.lastName = lastName;
    }
}
