import java.util.Scanner;

/*
 Watson gives two integers A & B to Sherlock and asks if he can count the number of square integers between A and B (both inclusive).

 A square integer is an integer which is the square of any integer. For example, 1, 4, 9, 16 are some of the square integers as they are squares of 1, 2, 3, 4 respectively.

 Input Format
 First line contains T, the number of testcases. T test cases follow, each in a newline.
 Each testcase contains two space separated integers denoting A and B.

 Output Format
 For each testcase, print the required answer in a new line.

 Constraints
 1 ≤ T ≤ 100
 1 ≤ A ≤ B ≤ 109 
 */

public class SherlockSquares {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		if (T < 1 || T > 100) {
			System.exit(0);
		}
		in.nextLine();
		int[] res = new int[T];
		for (int t = 0; t < T; t++) {
			String[] ls = in.nextLine().split(" ");

			int a = Integer.parseInt(ls[0]);
			int b = Integer.parseInt(ls[1]);
			if (a < 1 || b < 1 || b < a || a > Math.pow(10, 9)
					|| b > Math.pow(10, 9)) {
				System.exit(0);
			}

			/*
			 * O(1): a = ceil(sqrt(a)) b = floor(sqrt(b)) print (b-a) + 1
			 */
			a = (int) Math.ceil(Math.sqrt(a));
			b = (int) Math.floor(Math.sqrt(b));
			res[t] = (b - a + 1);
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}
