import java.util.Scanner;

//change to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt(), a = fs.nextInt(), b = fs.nextInt();
			int x = n / 2;
			int y = x;
			if (n % 2 == 1) {
				y++;
			}
			System.out.println(x * a + y * b);
		}
		fs.close();
	}
}
