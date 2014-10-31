import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram_Palindrome {

	public static void main(String[] args) {
		Map<Character, Integer> ch = new HashMap<Character, Integer>();

		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		for (int i = 0; i < str.length(); i++) {
			if (ch.get(str.charAt(i)) == null) {
				ch.put(str.charAt(i), 1);
			} else {
				ch.put(str.charAt(i), ch.get(str.charAt(i)) + 1);
			}
		}
		int odd = 0;
		for (Map.Entry<Character, Integer> al : ch.entrySet()) {
			if (al.getValue() % 2 != 0) {
				odd += 1;
			}
		}
		if (odd > 1) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
