package  Lab04.Ex6;

public class Main {
    public static void main(String[] args) {
        StudentList list = new StudentList();

        System.out.println("==> Add");
        list.add("Makara");
        list.add("Kompheak");
        list.display();
        System.out.println("\n==> Remove at last");
        list.removeLast();
        list.add("Minea");
        list.add("Mehsa");
        list.display();
        System.out.println("\n==> Remove at larger index");
        list.remove(10);
        list.display();
        System.out.println("==> Clear all element");
        list.clear();
        list.display();
    }
}

