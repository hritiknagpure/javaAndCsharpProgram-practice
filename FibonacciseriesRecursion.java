public class Main {
    static int a = 0, b = 1, c;
    public static void printFib(int count) {
        if (count > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
            printFib(count - 1);
        }
    }
    public static void main(String[] args) {
        int count = 10;
        System.out.print(a + " " + b);
        printFib(count - 2); //because two number already printed
    }
}
