import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
			double n = s.nextDouble() / s.nextDouble();
			System.out.printf("%.2f",n);
			System.out.println();
			s.close();
	}
}