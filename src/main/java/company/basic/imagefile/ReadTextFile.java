package company.basic.imagefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadTextFile {
    public void open() {
        try {
            Path filePath = Paths.get("src/main/resources/texts/デカルト選書.txt");
            String text = Files.readString(filePath);
            System.out.println(text);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
