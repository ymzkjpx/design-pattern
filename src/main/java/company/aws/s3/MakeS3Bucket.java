package company.aws.s3;


import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;


public class MakeS3Bucket {

    private static S3Client s3Client;
    public void create() {
        String bucketName = "ymzkjpx-test-buket";
        System.out.println(bucketName);

        Region region = Region.AP_NORTHEAST_1;
        String accessKey = "xxx";
        String secret = "xxx";
        AwsCredentials credentials = AwsBasicCredentials.create(accessKey, secret);


        s3Client = S3Client.builder()
                .region(region)
                .credentialsProvider(StaticCredentialsProvider.create(credentials))
                .build();

        CreateBucket.createBucket(s3Client, bucketName, region);
    }
}
