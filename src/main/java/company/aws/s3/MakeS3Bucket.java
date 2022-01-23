package company.aws.s3;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import software.amazon.awssdk.services.s3.S3Client;


public class MakeS3Bucket {

    private String bucketName = "ymzkjpx-test-buket" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMddHHmm"));

    private static S3Client s3Client;
    public void create() {
        System.out.println(bucketName);
        MyS3Client myS3Client = new MyS3Client();
        System.out.println(myS3Client);
        CreateBucket.createBucket(myS3Client.s3Client(), bucketName, myS3Client.region());
    }
}
