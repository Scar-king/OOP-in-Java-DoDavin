package Lab01;

class PrintStar {
	void star() {
		int rows = 10;

        for (int i = rows; i >= 1; i--) {
       
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
         
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
            }
        }
	}

class PrintRectangle {
	void rectangle() {
		int height = 15;
        int width = 13;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height || j == 1 || j == width) {
                	System.out.print("*");
                	} else {
                	System.out.print(" ");
	                }
	            }
	            System.out.println();
	            }
	        }
	}

class PrintMatrix {
	void matrix() {
		
		int rows = 5;
        int cols = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < i + cols; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
	}
}

public class Ex3 {
	public static void main(String[] args) {
		
		PrintStar printStar = new PrintStar();
		PrintRectangle printRectangle = new PrintRectangle();
		PrintMatrix printMatrix = new PrintMatrix();
		
		System.out.printf("%10s\n\n","A");
		printStar.star();
		System.out.println();
		System.out.printf("%7s\n\n","B");
		printRectangle.rectangle();
		System.out.println();
		System.out.printf("%6s\n\n","C");
		printMatrix.matrix();
	
	}
}
