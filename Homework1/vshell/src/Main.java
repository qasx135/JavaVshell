import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Path testFilePath = Paths.get("A:\\JavaInstitute\\KonfigUprav\\Homework1\\vshell\\src\\test.zip");
        Scanner in = new Scanner(System.in);
        String command = "";
        while(!command.equals("exit")) {
            System.out.print("root> ");
            command = in.nextLine();
            if (command.equals("pwd")) {
                Pwd.pwd(testFilePath);
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}