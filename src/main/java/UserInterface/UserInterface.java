package UserInterface;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class UserInterface implements View {

    private Scanner scanner;

    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    @Override
    public String scan() {
        System.out.println("Введите имя");
        return scanner.nextLine();
    }

    @Override
    public void print(String text) {
        System.out.println(text);

    }
}
