import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		s.close();
		if(n1>0)
			System.out.println("positivo");
		else
			System.out.println("negativo");
	}
}