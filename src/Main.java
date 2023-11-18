import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        Solution solution = new Solution();

        System.out.println(solution.romanToInt(s));
    }
}