package exday4;

public class SampleEx401 {
    public static void main(String[] args) {
        
        CellPhone cp = new CellPhone("hoge@gmail.com", "090-0000-1111");
        cp.call("000-9999-8888");
        cp.sendMail("tomiyoshi@gmail.com");
        
        IPhone phone = (IPhone)cp;
        phone.call("000-3333-4444");
        IEmail mail = (IEmail)cp;
        mail.sendMail("masuda@gmail.com");
    }
}
