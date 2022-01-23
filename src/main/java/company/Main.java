package company;

import company.aws.s3.usecase.S3BucketMakeRemove;
import company.interfaces.Context;

public class Main {

    public static void main(String[] args) {
        Context context = new S3BucketMakeRemove();
        context.go();
    }
}
