import java.nio.file.Path;

public class Pwd {
    public static void pwd(Path path) {
        System.out.println(path.getParent().toString() + path.getFileName().toString());
    }
}
