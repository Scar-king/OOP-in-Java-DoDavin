package Lab04.Ex7;

class ITStudent {
    String name;
    int id;

    ITStudent(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showInfo() {
        System.out.println("IT Student Name: " + name + ", ID: " + id);
    }
}

class ProgrammingStudent extends ITStudent {
    String language;

    ProgrammingStudent(String name, int id, String language) {
        super(name, id);
        this.language = language;
    }

    void displayProgramming() {
        showInfo();
        System.out.println("Specialization: Programming in " + language);
    }
}

class TelecomStudent extends ITStudent {
    String networkFocus;

    TelecomStudent(String name, int id, String networkFocus) {
        super(name, id);
        this.networkFocus = networkFocus;
    }

    void displayTelecom() {
        showInfo();
        System.out.println("Specialization: Telecom - " + networkFocus);
    }
}

public class Department {
        public static void main(String[] args) {
        ProgrammingStudent ps = new ProgrammingStudent("Davin", 101, "Java");
        TelecomStudent ts = new TelecomStudent("Thyda", 102, "5G Networks");

        ps.displayProgramming();
        System.out.println();
        ts.displayTelecom();
    }
}

