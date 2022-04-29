import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = new StringBuilder(s).reverse().toString();
        if (s.equals(s1))
        {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}