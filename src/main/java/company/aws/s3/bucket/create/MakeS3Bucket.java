package company.aws.s3.bucket.create;


import company.aws.s3.MyS3Client;
import company.aws.s3.bucket.BucketName;


public class MakeS3Bucket {
    BucketName bucketName;

    public MakeS3Bucket(BucketName bucketName) {
        this.bucketName = bucketName;
    }

    public void create() {
        System.out.println("Create new bucket : " + bucketName.toString());
        MyS3Client myS3Client = new MyS3Client();
        CreateBucket.createBucket(myS3Client.s3Client(), bucketName.value(), myS3Client.region());
        myS3Client.close();
    }
}
