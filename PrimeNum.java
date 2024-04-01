public class Main {
    public static void main(String[] args) {
        int num = 4;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.print("prime");
        } else {
            System.out.print("not a prime");
        }
    }
}
//____OUTPUT___
not a prime
