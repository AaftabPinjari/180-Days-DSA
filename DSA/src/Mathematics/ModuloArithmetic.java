package Mathematics;

public class ModuloArithmetic {
	static long fastPower(long a, long b , int n) {
		long res = 1;
		while(b>0) {
			if((b&1) !=0) {
				//using property (a*b)%n = (a%n * b%n)%n
				res = (res * a%n)%n;
			}
			a=(a%n * a%n)%n;
			b = b >> 1;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long ans = fastPower(3978432,5,1000000007);
		System.out.println(ans);
	}

}
