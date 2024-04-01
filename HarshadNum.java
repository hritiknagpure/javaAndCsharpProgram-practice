public class Main {
    public static void main(String[] args) {
        int num = 18;
        int temp = num;
        int rem, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        if (temp % sum == 0) {
            System.out.print("Harshad number");
        } else {
            System.out.print("Not a harshad number");
        }
    }
}
