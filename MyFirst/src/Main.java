public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!\n");
        for(char i = 0x0900; i<=0x0960; i++){
            System.out.printf(i + " ");
        }
        MyFirst.MyFirstMethod();
    }
}