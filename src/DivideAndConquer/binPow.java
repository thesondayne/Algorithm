package DivideAndConquer;

public class binPow {
    public static int binPow(int a, int b){
        int mod = (int)Math.pow(10,9)+7;
        if(b==0) return 1;
        if(b%2==0) return (binPow(a,b/2) % mod * binPow(a,b/2) % mod)%mod;
        else return ((binPow(a,b/2) % mod * binPow(a,b/2) % mod) *a%mod)%mod;
    }
    public static void main(String[] args) {
        System.out.println(binPow(9,9));
    }
}
