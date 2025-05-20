package Practice;

class MotoBike {
    private int wheelNum = 2;
    void wheel(){
        System.out.println("There are " + wheelNum + " wheels.");
    }
}

class TukTuk extends MotoBike {
    private int wheelNum = 3;
    public void myWheel(){
        System.out.println("There are " + wheelNum + " wheels.");
    }
    public void parentWheel(){
        super.wheel();
    }
}

public class Demo {
    public static void main(String[] args) {
        TukTuk tt = new TukTuk();

        tt.myWheel();
        tt.parentWheel();
    }
}
