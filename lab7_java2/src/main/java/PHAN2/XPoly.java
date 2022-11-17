
package PHAN2;


public class XPoly {
    @Deprecated
    public static boolean isCardNumber(String number){
        String s = number;
        int n = Integer.parseInt(s);
        int tong = 0;
        while(n > 0){
            int a = n % 10;
            n = n/10;
            tong += a;
        }
        return tong % 2 == 0;
    }
}
