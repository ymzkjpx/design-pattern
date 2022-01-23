package company.aws.s3.bucket.create;

import software.amazon.awssdk.core.waiters.WaiterResponse;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.CreateBucketConfiguration;
import software.amazon.awssdk.services.s3.model.CreateBucketRequest;
import software.amazon.awssdk.services.s3.model.HeadBucketRequest;
import software.amazon.awssdk.services.s3.model.HeadBucketResponse;
import software.amazon.awssdk.services.s3.model.S3Exception;
import software.amazon.awssdk.services.s3.waiters.S3Waiter;

public class CreateBucket {

    static void createBucket(S3Client s3Client, String buketName, Region region) {
        S3Waiter s3Waiter = s3Client.waiter();

        try {
            CreateBucketRequest bucketRequest = CreateBucketRequest.builder()
                    .bucket(buketName)
                    .createBucketConfiguration(
                            CreateBucketConfiguration.builder()
                                    .locationConstraint(region.id())
                                    .build()
                    ).build();
            s3Client.createBucket(bucketRequest);
            HeadBucketRequest headBucketRequestWait = HeadBucketRequest.builder()
                    .bucket(buketName)
                    .build();

            WaiterResponse<HeadBucketResponse> waiterResponse = s3Waiter.waitUntilBucketExists(headBucketRequestWait);
            waiterResponse.matched().response().ifPresent(System.out::println);
            System.out.println(buketName + " is ready");
        } catch (S3Exception e) {
            System.err.println(e.awsErrorDetails());
            System.exit(1);
        }
    }
}
