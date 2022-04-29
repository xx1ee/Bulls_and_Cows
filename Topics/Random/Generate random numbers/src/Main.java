import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        Random random = new Random(a + b);
        //sum+=random.nextInt((b - a + 1) + a);
        for (int j = 0 ; j < n ; j++)
        {
            sum+=random.nextInt(b - a + 1) + a;
        }
        System.out.println(sum);
    }
}