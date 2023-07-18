import java.util.Scanner;

public class Power_Modules {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();;
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println((int) (power_find(a,b))%c);
    }

    static int power_find(int a, int b) {
        for(int i=0;i<b;i++){
            a*=a;
        }
        return a;
    }


}
