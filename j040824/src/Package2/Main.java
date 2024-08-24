package Package2;

public class Main {
    static int mod = 1000000007;

    public static void main(String[] args) {
        long sum = power(2023, 2023);
        long p1 = ((sum % mod) * power(  7,  mod - 2)) % mod;
        long p2 = ((sum % mod) * power( 17,  mod - 2)) % mod;
        long p3 = ((sum % mod) * power(7*17, mod - 2)) % mod;

        long ans = (sum - p1 - p2 + p3 + mod + mod) % mod;
        System.out.println(ans);
    }

    static long power(long a, long p) { // 乘法快速幂
        long ans = 1;
        a %= mod;

        while (p != 0) {
            if ((p & 1) == 1) {
                ans = (ans * a) % mod;
            }
            a = (a * a) % mod;
            p >>= 1;
        }

        return ans;
    }
}