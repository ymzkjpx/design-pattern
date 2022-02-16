package company;

import company.basic.imagefile.ImageFileContext;
import company.interfaces.Context;

public class Main {

    public static void main(String[] args) {
        Context context = new ImageFileContext();
        context.go();
    }
}
