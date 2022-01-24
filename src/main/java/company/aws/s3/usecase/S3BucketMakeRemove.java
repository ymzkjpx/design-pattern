package company.aws.s3.usecase;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import company.aws.s3.bucket.BucketName;
import company.aws.s3.bucket.BucketNameEnum;
import company.aws.s3.bucket.create.MakeS3Bucket;
import company.aws.s3.bucket.delete.RemoveBucket;
import company.interfaces.Context;

public class S3BucketMakeRemove implements Context {
    @Override
    public void go() {
        BucketName bucketName = BucketName.from(BucketNameEnum.DEFAULT_BUCKET_NAME.value() + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMddHHmm")));
        createNewBucket(bucketName);
        deleteEmptyBucket(bucketName);
    }

    private void createNewBucket(BucketName bucketName) {
        MakeS3Bucket makeS3Bucket = new MakeS3Bucket(bucketName);
        makeS3Bucket.create();
    }

    private void deleteEmptyBucket(BucketName bucketName) {
        RemoveBucket removeBucket = new RemoveBucket(bucketName);
        removeBucket.remove();
    }
}
