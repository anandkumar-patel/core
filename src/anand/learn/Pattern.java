package anand.learn;

public class Pattern {

	public static void main(String[] args) {
		System.out.println("===============1==================");
		patternOne(4, 5);
		System.out.println("===============2==================");
		patternTwo(4, 5);
		System.out.println("===============3==================");
		patternThree(5, 5);
		System.out.println("===============4==================");
		patternFour(5, 5);
		System.out.println("===============5==================");
		patternFive(5, 5);

	}

	public static void patternOne(int height, int width) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void patternTwo(int height, int width) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (i == 0 || i == (height - 1) || j == 0 || j == (width - 1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void patternThree(int height, int width) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (j <= i) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	public static void patternFour(int height, int width) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (i <= j) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	public static void patternFive(int height, int width) {
		for (int i = 0; i < height; i++) {
			int ch = 65;
			for (int j = 0; j < width; j++) {
				if(i+j<4) {
					System.out.print(" "+ (char)ch);
					ch++;
				} else {
					System.out.print(" "+ (char)ch);
				}
			}
			System.out.println();
		}
	}
}
