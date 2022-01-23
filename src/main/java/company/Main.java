package company;

import company.aws.s3.S3ActionContext;
import company.interfaces.Context;

public class Main {

    public static void main(String[] args) {
        Context context = new S3ActionContext();
        context.go();
    }
}
