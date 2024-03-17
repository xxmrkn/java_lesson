package exday1;

public class SampleClassEx101 {
    private int value = 0;
    private static int num = 0;
    
   // コンストラクタのオーバーロード 2つのコンストラクタ
    public SampleClassEx101(int value){
        this.value = value;
        num++;
    }
    public SampleClassEx101(){
        this(100); // 対応する引数つきコンストラクタを呼び出す
    }
    public static int getNumberOfInstance(){
        return num;
    }
    public int getValue(){
        return this.value;
    }
}
