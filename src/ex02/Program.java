
import java.util.Scanner;

public class Program {

	public static int sumOfNumbers(int num){
		int del = 1000000000;
		int sum = 0;
		while (num != 0){
			sum += num / del;
			num = num % del;
			del /= 10;
		}
		return (sum);
	}

	public static int isNumSimple(int num){
		int i = 2;
		while (i * i <= num && num % i > 0)
			i++;
		if (num % i == 0)
				return(-1);
		else
			return(0);
	}

	public static void main(String[] args) {
		int num;
		int sum;
		int count = 0;

		Scanner scanner = new Scanner(System.in);
		while (( num = scanner.nextInt()) != 42){
			sum = sumOfNumbers(num);
			if (isNumSimple(sum) == 0)
				count++;
		}
		System.out.println("Count of coffee-request – " + count);
	}
}

