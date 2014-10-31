import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class cut_the_sticks {

	public static void main(String[] args) {
		String[] ls;
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		if (N < 1 || N > 1000){
			System.exit(0);
		}
		in.nextLine();
		ls = in.nextLine().split(" ");
		
		int[] len = new int[ls.length];
		int min_value = 1001;
		
		for (int i = 0; i < ls.length; i++) {
			len[i] = Integer.parseInt(ls[i]);
			if (len[i] < 1 || len[i] > 1000){
				System.exit(0);
			}
			if (len[i] < min_value) {
				min_value = len[i];
			}
		}
		while(N != 0){
			System.out.println(N);
			int cut = 0;
			int min = 1001;
			for (int i = 0; i< len.length; i++){
				len[i] -= min_value;
				if (len[i] > 0){
					cut +=1;
					if (len[i] < min){
						min = len[i];
					}
				}
			}
			N = cut;
			min_value = min;
			
		}
	}
}
