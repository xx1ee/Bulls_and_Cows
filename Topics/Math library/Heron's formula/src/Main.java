import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        double p = (a + b + c) / 2.0;
        double s = Math.sqrt(p*(p - a)*(p - b)*(p - c));

        System.out.println(s);
    }
}