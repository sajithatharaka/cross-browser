package utils;

import java.io.File;
import java.nio.file.Paths;

public class TestData {
    public static boolean isFileDownloaded(String fileName,int iterations){
        boolean flag=false;
        File dir=new File(Paths.get("").toAbsolutePath().toString());
        for(int waitForDownload=0;waitForDownload<iterations;waitForDownload++){
            File[] dir_contents=dir.listFiles();
            for (int i=0;i<dir_contents.length;i++){
                if(dir_contents[i].getName().equals(fileName)){
                    System.out.println("File "+fileName+" has downloaded");
                    return flag=true;
                }
            }
            try {
                Thread.sleep(5000);//giving time for the file to download
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return flag;
    }
}
