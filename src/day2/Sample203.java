package day2;

public class Sample203 {
    public static void main(String[] args) {
        int a1=2, b1=2, c1=2, d1=2;
        int a2=2, b2=2, c2=2, d2=2;
    
        a1 = a1 + 1;
        b1 = b1 - 1;
        c1 = c1 * 2;
        d1 = d1 / 2;
        
        a2 += 1;
        b2 -= 1;
        c2 *= 2;
        d2 /= 2;

        System.out.printf("%s %s %s %s%n", a1, b1, c1, d1);
        System.out.printf("%s %s %s %s%n", a2, b2, c2, d2);
    }
}
