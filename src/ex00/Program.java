
public class Program {
	public static void main(String[] args) {
		int num = 479598;
		int del = 100000;
		int sum = num / del;
		num = num % del;
		del /= 10;
		sum += num / del;
		num = num % del;
		del /= 10;
		sum += num / del;
		num = num % del;
		del /= 10;
		sum += num / del;
		num = num % del;
		del /= 10;
		sum += num / del + num % del;

		System.out.println(sum);
	}
}
