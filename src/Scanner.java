import java.util.*;

public class Scanner {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        System.out.println(input);
        System.out.println(num);




    }
}
