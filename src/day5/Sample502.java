package day5;

public class Sample502 {
    public static void main(String[] args) {
        int n[] = {5,4,3,2,1};
        String s[] = {"ABC", "DEF", "GHI"};

        int i;
        // for (i=0; i<n.length; i++){
        //     System.out.print(n[i]+" ");
        // }
        // System.out.println();
        // for (i=0; i<s.length; i++){
        //     System.out.print(s[i]+" ");
        // }
        // System.out.println();
        for (i=n.length-1; i>=0; i--){
            System.out.print(n[i]+" ");
        }
        System.out.println();
        for (i=s.length-1; i>=0; i--){
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
}
