package company.aws.s3.bucket.delete;

import company.aws.s3.MyS3Client;
import company.aws.s3.bucket.BucketName;

public class RemoveBucket {
    BucketName bucketName;

    public RemoveBucket(BucketName bucketName) {
        this.bucketName = bucketName;
    }

    public void remove() {
        System.out.println("Delete empty bucket : " + bucketName.toString());
        MyS3Client myS3Client = new MyS3Client();
        DeleteBucket.deleteBucket(myS3Client.s3Client(), bucketName.value());
        myS3Client.close();
    }
}
