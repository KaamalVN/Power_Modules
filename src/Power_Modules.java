import java.util.Scanner;

public class Power_Modules {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();;
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println((int) (Math.pow(a,b))%c);
    }
}
