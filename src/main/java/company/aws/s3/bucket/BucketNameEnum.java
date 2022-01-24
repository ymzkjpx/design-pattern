package company.aws.s3.bucket;

public enum BucketNameEnum {
    WORKING_BUCKET_NAME("ymzkjpx-design-pattern"), DEFAULT_BUCKET_NAME("ymzkjpx-test-buket");

    String bucketName;

    BucketNameEnum(String bucketName) {
        this.bucketName = bucketName;
    }

    public String value() {
        return bucketName.toString();
    }
}
