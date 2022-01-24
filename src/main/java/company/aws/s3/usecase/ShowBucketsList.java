package company.aws.s3.usecase;

import company.aws.s3.bucket.buckets.BucketsList;
import company.interfaces.Context;

public class ShowBucketsList implements Context {

    @Override
    public void go() {
        BucketsList bucketsList = new BucketsList();
        bucketsList.showList();
    }
}
