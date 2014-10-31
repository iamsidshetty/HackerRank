import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 Manasa is out on a hike with friends. She finds a trail of stones with numbers on them. She starts following the trail and notices that two consecutive stones have a difference of either a or b. Legend has it that there is a treasure trove at the end of the trail and if Manasa can guess the value of the last stone, the treasure would be hers. Given that the number on the first stone was 0, find all the possible values for the number on the last stone.

 Note : The numbers on the stones are in increasing order

 Input Format
 The first line contains an integer T i.e. the number of Test cases. T testcases follow.
 Each testcase has 3 lines. The first line contains n ( the number of stones ) The second line contains a. 
 The third line contains b.

 Output Format:
 Space separated list of numbers which are the possible values of the last stone in increasing order.

 Constraints
 1 ≤ T ≤ 10
 1 ≤ n, a, b ≤ 10^3 
 */

public class LastStone {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		if (T < 1 || T > 10) {
			System.exit(0);
		}
		// ArrayList<String> finresults = new ArrayList<String>();
		StringBuilder[] finres = new StringBuilder[1000];
		for (int t = 0; t < T; t++) {
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			if (n < 1 || n > Math.pow(10, 3) || a < 1 || a > Math.pow(10, 3)
					|| b < 1 || b > Math.pow(10, 3)) {
				System.exit(0);
			}
			ArrayList<Integer> results = new ArrayList<Integer>();

			for (int i = 1; i < n - 1; i++) {
				int sum = (a * i) + (b * (n - 1 - i));
				results.add(sum);
			}
			results.add(a * (n - 1));
			results.add(b * (n - 1));
			
//			Collections.sort(noDupsRes);
			Set<Integer> noDupsRes = new TreeSet<Integer>(results);
//			Collections.sort(noDupsRes);
			
			StringBuilder res = new StringBuilder();
			for (int val : noDupsRes) {
				res.append(val + " ");
			}

			finres[t] = res;
		}
		for (StringBuilder res : finres) {
			if (res != null) {
				System.out.println(res);
			}
		}
	}

}
