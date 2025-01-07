import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int a = s.nextInt();
			arr[i] = a;
		}
		int min = 0;
		for (int i = 1; true; i++) {
			int num = 0;
			if (i % arr[0] == 0) num++;
			if (i % arr[1] == 0) num++;
			if (i % arr[2] == 0) num++;
			if (i % arr[3] == 0) num++;
			if (i % arr[4] == 0) num++;
			if (num >= 3) {
				min = i;
				break;
			}
		}
		System.out.print(min);
	}
}