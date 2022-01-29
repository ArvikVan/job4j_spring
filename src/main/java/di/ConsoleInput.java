package di;

import org.springframework.stereotype.Component;

import java.util.Scanner;

/**
 * @author ArvikV
 * @version 1.1
 * @since 28.01.2022
 * помечаем для регистрации в контексте
 */
@Component
public class ConsoleInput {
    private Scanner scanner = new Scanner(System.in);

    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}
