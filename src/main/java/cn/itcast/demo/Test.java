package cn.itcast.demo;

import org.csource.fastdfs.*;

public class Test {
    public static void main(String[] args) throws Exception {
        ClientGlobal.init("/Users/jueyings/www/pinyougou-parent/fastDFSdemo/src/main/resources/fdfs_client.conf");
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = trackerClient.getConnection();
        StorageServer storageServer = null;
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);

        String[] strings = storageClient.upload_file("/Users/jueyings/Documents/error0.jpg", "jpg", null);


        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println("执行成功");

    }
}
