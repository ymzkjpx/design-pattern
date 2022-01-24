package company.aws.s3.bucket;

import java.util.Objects;

public class BucketName {
    private final String bucketName;

    private BucketName(String value) {
        this.bucketName = value;
    }

    public static BucketName from(String value){
        if (Objects.isNull(value) || "".equals(value)) throw new IllegalArgumentException("バケット名が空です");
        return new BucketName(value);
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
