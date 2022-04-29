import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        String max = "";
        for (String slovo : list)
        {
            if (slovo.length() > max.length())
            {
                max = slovo;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i, max);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}