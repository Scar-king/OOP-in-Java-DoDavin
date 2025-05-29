package Lab05.Ex2;

public class Student {
    int id;
    String name;
    int age;
    Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format("%-8d | %-20s | %-5d |", id, name, age);
    }
}