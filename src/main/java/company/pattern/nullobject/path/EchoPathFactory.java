package company.pattern.nullobject.path;

import java.util.Objects;

public class EchoPathFactory {
    public static String create(String path) {
        if (Objects.nonNull(path)) {
            EchoPath echoPath = new ExistPath(path);
            return echoPath.echo();
        }
        EchoPath nonExistEchoPath = new NonExistPath();
        return nonExistEchoPath.echo();
    }
}
