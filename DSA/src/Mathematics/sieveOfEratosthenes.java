package Mathematics;
import java.util.*;

public class sieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ans = sieve(100);
		System.out.println(ans);

	}
	static ArrayList<Integer> sieve(int n) {
		ArrayList<Integer> solution = new ArrayList<>();
		boolean isPrime[] = new boolean[n+1];
		Arrays.fill(isPrime,true);
		isPrime[0]=false;
		isPrime[1]=false;
		//  from 2 index to index upto root of n
		for(int i =2;i*i<=n;i++) {
			for(int j=2*i;j<=n;j+=i) {
				isPrime[j]=false;
			}
		}
		for(int i =2;i<=n;i++) {
			if(isPrime[i]==true) {
				solution.add(i);
			}
		}
		return solution;
		
	}

}
