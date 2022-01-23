package company.aws.s3;

import company.interfaces.Context;

public class S3ActionContext implements Context {
    @Override
    public void go() {
        MakeS3Bucket makeS3Bucket = new MakeS3Bucket();
        makeS3Bucket.create();
    }
}
