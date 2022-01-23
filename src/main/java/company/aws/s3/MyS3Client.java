package company.aws.s3;

import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

public class MyS3Client {
    private final S3Client s3Client;
    private final Region region = Region.AP_NORTHEAST_1;

    public MyS3Client() {
        this.s3Client = concreate();
    }

    private S3Client concreate() {
        S3Client s3Client = S3Client.builder()
                .region(region)
                .credentialsProvider(ProfileCredentialsProvider.create("design-pattern"))
                .build();
        return s3Client;
    }

    public S3Client s3Client() {
        return s3Client;
    }

    public Region region() {
        return region;
    }

    public void close() {
        s3Client.close();
    }
}