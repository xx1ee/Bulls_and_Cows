import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = "";
        for (char s1 : s.toCharArray())
        {
            a = a + s1 + s1;
        }
        System.out.println(a);
    }
}