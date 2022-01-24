package company.aws.s3.usecase;

import company.aws.s3.bucket.BucketName;
import company.aws.s3.bucket.BucketNameEnum;
import company.interfaces.Context;

public class MakeS3Bucket implements Context {
    @Override
    public void go() {
        BucketName bucketName = BucketName.from(BucketNameEnum.WORKING_BUCKET_NAME.value());
        createNewBucket(bucketName);
    }

    private void createNewBucket(BucketName bucketName) {
        company.aws.s3.bucket.create.MakeS3Bucket makeS3Bucket = new company.aws.s3.bucket.create.MakeS3Bucket(bucketName);
        makeS3Bucket.create();
    }
}
