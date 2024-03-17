package day4;

public class Sample406 {
    public static void main(String[] args) {
        boolean flag = false;
        System.out.println("6が出たら終了");
        while(flag==false){
            int dice = (int)(Math.random()*6)+1;
            System.out.println(dice);
            if (dice==6){
                flag = true;
                break;
            }
        }
        System.out.println("終了");
    }
}
