package Lab04.Ex8;

class BasicMath {
    double addition(double a, double b){
        return a + b;
    }

    double subtract(double a, double b){
        return a - b;
    }
}

class AdvanceMath extends BasicMath {
    double multiply(double a, double b){
        return a * b;
    }

    double divide(double a, double b){
        if (b == 0) {
            System.out.println("Error: Infinity!");
            return 0; 
        }
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        BasicMath bm = new BasicMath();
        System.out.println(bm.addition(6, 9));
        System.out.println(bm.subtract(50000, 36750));

        AdvanceMath am = new AdvanceMath();
        System.out.println(am.addition(6, 9));
        System.out.println(am.subtract(6, 9));
        System.out.println(am.multiply(6, 9));
        System.out.println(am.divide(6, 0));
    }
}
