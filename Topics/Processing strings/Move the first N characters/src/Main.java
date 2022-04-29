import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        if (n <= s.length()) {
            s = s + s.substring(0, n);
            s = s.substring(n, s.length());
            System.out.println(s);
        } else {System.out.println(s);}
    }
}
