package company.aws.s3.bucket.buckets;

import company.aws.s3.agent.MyS3Client;
import software.amazon.awssdk.services.s3.S3Client;

public class BucketsList {
    S3Client s3Client;

    public BucketsList(){
        this.s3Client = new MyS3Client().s3Client();
    }

    public void showList(){
        System.out.println("S3 Buckets List.");
        s3Client.listBuckets().buckets().stream().forEach(bucket -> System.out.println("・" + bucket.name()));
    }
}
