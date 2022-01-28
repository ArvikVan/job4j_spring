package di;

import java.util.Scanner;

/**
 * @author ArvikV
 * @version 1.0
 * @since 28.01.2022
 */
public class ConsoleInput {
    private Scanner scanner = new Scanner(System.in);

    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}
