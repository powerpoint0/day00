import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		if (num <= 1) {
			System.err.println("IllegalArgument");
			System.exit(-1);
		}
		int i = 2;
		int iter = 1;
		while (i * i <= num && num % i > 0){
			i++;
			iter++;
		}
		if (num % i == 0)
			System.out.println("false " + iter);
		else
			System.out.println("true " + iter);
	}
}
