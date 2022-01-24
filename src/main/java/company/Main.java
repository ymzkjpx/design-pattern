package company;

import company.aws.s3.usecase.ShowBucketsList;
import company.interfaces.Context;

public class Main {

    public static void main(String[] args) {
        Context context = new ShowBucketsList();
        context.go();
    }
}
