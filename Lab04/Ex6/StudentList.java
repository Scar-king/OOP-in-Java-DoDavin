package Lab04.Ex6;

public class StudentList {
    private class Element {
        String name;
        Element next;

        Element(String name) {
            this.name = name;
            this.next = null;
        }
    }

    private Element head = null;

    public void add(String name) {
        Element newElement = new Element(name);
        if (head == null) {
            head = newElement;
        } else {
            Element current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newElement;
        }
        System.out.println("Added: " + name);
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty. Cannot remove.");
            return;
        }

        if (head.next == null) {
            System.out.println("Removed: " + head.name);
            head = null;
            return;
        }

        Element previous = head;
        Element current = head.next;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        System.out.println("Removed: " + current.name);
        previous.next = null;
    }

    public void remove(int index) {
        if (head == null) {
            System.out.println("List is empty. Cannot remove at index " + index);
            return;
        }

        if (index == 0) {
            System.out.println("Removed at index 0: " + head.name);
            head = head.next;
            return;
        }

        Element previous = head;
        Element current = head.next;
        int i = 1;

        while (current != null && i < index) {
            previous = current;
            current = current.next;
            i++;
        }

        if (current == null) {
            System.out.println("Index " + index + " is out of range.");
        } else {
            System.out.println("Removed at index " + index + ": " + current.name);
            previous.next = current.next;
        }
    }

    public void clear() {
        head = null;
        System.out.println("All elements cleared.");
    }

    public void display() {
        if (head == null) {
            System.out.println("Array is empty");
            return;
        }

        Element current = head;
        System.out.println("Student List:");
        while (current != null) {
            System.out.println("- " + current.name);
            current = current.next;
        }
    }
}
