import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] s1 = s.split("-");
        System.out.println(s1[1] + "/" + s1[2] + "/" + s1[0]);
    }
}