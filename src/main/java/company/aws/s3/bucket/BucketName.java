package company.aws.s3.bucket;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BucketName {
    private final String bucketName;

    private BucketName(String value) {
        this.bucketName = value;
    }

    public static BucketName defaultBucket() {
        return new BucketName("ymzkjpx-test-buket" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMddHHmm")));
    }

    public String value() {
        return bucketName;
    }

    @Override
    public String toString() {
        return "BucketName{" +
                "bucketName='" + bucketName + '\'' +
                '}';
    }
}
