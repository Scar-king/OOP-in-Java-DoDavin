package Lab01;

class PrintStar {
	void star() {
		int rows = 10;
		for (int i = rows; i >= 1; i--) {
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < (2 * i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class PrintRectangle {
	void rectangle() {
		System.out.println("***********");
		System.out.printf("* %9s\n", "*");
		System.out.printf("* %9s\n", "*");
		System.out.printf("* %9s\n", "*");
		System.out.printf("* %9s\n", "*");
		System.out.printf("* %9s\n", "*");
		System.out.printf("* %9s\n", "*");
		System.out.println("***********");
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

		System.out.printf("%10s\n\n", "A");
		printStar.star();
		System.out.println();
		System.out.printf("%7s\n\n", "B");
		printRectangle.rectangle();
		System.out.println();
		System.out.printf("%6s\n\n", "C");
		printMatrix.matrix();
	}
}
