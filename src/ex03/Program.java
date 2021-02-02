
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		String week;
		int week_num = 0;
		long memory = 0;

		int count = 1;

		Scanner scanner = new Scanner(System.in);
		week = scanner.next();

		while (!week.equals("42")){
			week_num = scanner.nextInt();
			if (week_num != count++){
				System.out.println("IllegalArgument");
				System.exit(-1);
			}
			memory = memory_num(minNum(scanner), memory);
			week = scanner.next();
		}
		printMemory(week_num, memory);
	}

	private static void printMemory(int week_num, long memory) {
		int i = 1;
		long num;
		long del = 1;
		while (i++ < week_num)
			del *= 10;
		i = 1;
		while (memory != 0){
			num = memory / del;
			System.out.print("Week ");
			System.out.print(i);
			System.out.print(" ");
			while (num-- > 0)
				System.out.print("=");
			System.out.println(">");
			memory = memory % del;
			del /= 10;
			i++;
		}
	}

	private static long memory_num(int num, long memory) {

		memory =  memory * 10 + (long)num;
		return (memory);
	}

	private static int minNum(Scanner scanner) {

		int ev1 = scanner.nextInt();
		int ev2 = scanner.nextInt();
		int ev3 = scanner.nextInt();
		int ev4 = scanner.nextInt();
		int ev5 = scanner.nextInt();

		int min = ev1;

		if (ev2 < min)
			min = ev2;
		if (ev3 < min)
			min = ev3;
		if (ev4 < min)
			min = ev4;
		if (ev5 < min)
			min = ev5;

		return (min);
	}
}
