import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long i = scanner.nextInt();
        StringBuilder output = new StringBuilder();
        output.append(i);

        while (i > 1) {
            if (i % 2 == 0) {
                i /= 2;
            } else {
                i = i * 3 + 1;
            }
            output.append(" ").append(i);
        }
        System.out.println(output.toString());
        scanner.close();
    }
}
