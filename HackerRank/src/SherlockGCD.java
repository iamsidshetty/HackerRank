
public class SherlockGCD {
	public static int GCD(int a, int b) {
		   if (b==0) return a;
		   return GCD(b,a%b);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int g = GCD(1,2);
		System.out.println(g);
	}

}
