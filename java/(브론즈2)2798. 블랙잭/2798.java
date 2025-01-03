import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // 숫자 개수
		int m = s.nextInt(); // 맞춰야하는 수
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			int a = s.nextInt();
			arr[i] = a;
		}
		int max = 0;
		for (int i = 0; i < n-2; i++) {
			for (int j = i+1; j < n-1; j++) {
				for (int k = j+1; k < n; k++) {
					int maxA = arr[i] + arr[j] + arr[k];
					if (maxA > max && maxA <= m) max = maxA;
				}
			}
		}
		System.out.print(max);
	}
}