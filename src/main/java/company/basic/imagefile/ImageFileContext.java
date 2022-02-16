package company.basic.imagefile;

import company.interfaces.Context;

public class ImageFileContext implements Context {
    @Override
    public void go() {
        readTextFile();
    }

    void readTextFile(){
        ReadTextFile readTextFile = new ReadTextFile();
        readTextFile.open();
    }
}
