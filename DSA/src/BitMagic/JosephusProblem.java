package BitMagic;

public class JosephusProblem {
	public static int countSetBits(int n){
	    
        // Your code here
        if(n==1) return 1;
        int total = 0;
        int count = 0;
for ( int i=1;i<=n;i++){
            while(i>0){
                 i = i & i-1;
                 count++;
            }
            total += count;
            count=0;
        }
        return total;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		int ans = countSetBits(n);
		System.out.println(ans);
	}

}
