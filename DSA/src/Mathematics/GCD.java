package Mathematics;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = gcd(24,60);
		System.out.println(ans);

	}
	static int gcd(int a, int b) {
		if (b == 0) return a;
		//using GCD(a,b) = GCD(b,a%b)
		return gcd(b,a%b);
	}

}
