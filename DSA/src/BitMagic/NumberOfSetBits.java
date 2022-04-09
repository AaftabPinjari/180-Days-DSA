package BitMagic;
import java.util.*;

public class NumberOfSetBits {
	
	//find largest power of 2 before given number n
	 public static int powerOf2InRange(int n){
         int x =0;
         while((1 << x) <= n){
             x++;
         }
         // x is greater than the number so we need x - 1
         return x-1;
}
	 public static int countSetBits(int n){
     if(n==0) return 0;
     int x  = powerOf2InRange(n);
     // number of setBits before 2^x = (2^(x-1))*x
     int bitTilll2x = ((1<< (x-1)))*x;
     // number of most significant bit ...leftest bit  = n- (2^x) + 1
     int msbFrom2xton = n-(1<<x)+1;
     // rest of setBits by recursive call countSetBits(n-(2^x))
     int rest = n  - (1 << x);
     int ans = bitTilll2x + msbFrom2xton + countSetBits(rest);
     return ans;
}
	public static int lengthyCountSetBits(int n) {
		int count = 0;
		for(int i = 1; i <= n ; i++) {
			int x = i;
			while(x>0) {
				x = x & (x-1);
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num  = scn.nextInt();
		System.out.println(countSetBits(num));
		
	}

}
