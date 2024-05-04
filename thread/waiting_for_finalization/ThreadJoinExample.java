package thread.waiting_for_finalization;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ThreadJoinExample {
    public static void main(String[] args) throws InterruptedException{
        FileDownloader fileDownloader1 = new FileDownloader("https://cdn.pixabay.com",
                "photo/2018/06/17/20/35/chain-3481377_1280.jpg");
        FileDownloader fileDownloader2 = new FileDownloader("https://cdn.pixabay.com",
                "photo/2019/04/04/15/17/smartphone-4103051_1280.jpg");

        DownloadingHeartBeat  downloadingHeartBeat = new DownloadingHeartBeat();


        fileDownloader1.start();
        fileDownloader2.start();
        downloadingHeartBeat.start();

        try {
            fileDownloader1.join();
            fileDownloader2.join();

            downloadingHeartBeat.shutDown();

            downloadingHeartBeat.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The  download is complete");

    }
}
 class DownloadingHeartBeat extends Thread{

    private volatile boolean beating = true;

    @Override
    public void run() {
        super.run();
        String[] dots={
          ".",
          "..",
          "...",
          "...."
        };

        while (beating){
            for(String dot:dots){
                System.out.println(dot);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void shutDown(){
        this.beating= false;
    }
}

class FileDownloader extends Thread{
    private String url ;
    private String fileName;


    public FileDownloader(String url,String fileName){
        this.url =url;
        this.fileName= fileName;
    }

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("Started Download");

            URL resourceToDownload = new URL(url);
            URLConnection connection = resourceToDownload.openConnection();
            InputStream inputStream = connection.getInputStream();
            File fileToSave = new File(fileName);
            Files.copy(inputStream,fileToSave.toPath(),
                    StandardCopyOption.REPLACE_EXISTING
                    );
            inputStream.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}