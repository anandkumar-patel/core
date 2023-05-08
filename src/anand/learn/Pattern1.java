package anand.learn;

public class Pattern1 {

	public static void main(String[] args) {
		patternOne(4,5);
		System.out.println("===============1==================");
		patternTwo(4,5);
		System.out.println("===============2==================");
		patternThree(5,5);
		System.out.println("===============3==================");
		patternFour(5,5);
		System.out.println("===============4==================");
		patternFive(5,5);

	}

	public static void patternOne(int height,int width) {	
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void patternTwo(int height,int width) {
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				if(i==0 || i==(height-1) || j==0 || j== (width-1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}	
			}
			System.out.println();
		}
	}
	
	
	public static void patternThree(int height,int width) {	
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				if(j<=i) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	public static void patternFour(int height,int width) {	
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				if(i<=j) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	public static void patternFive(int height,int width) {
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				if(width+i-j<=i) {
					System.out.print("* ");
				} else {
					System.out.println("  ");
				}
			}
			System.out.println();
		}
	}
}
