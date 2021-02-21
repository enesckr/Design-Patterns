public class Client {

    public static void main(String[] args){

        String sourcePath = "C:\\FolderToBackup";
        IBackup backup;

        backup = new DiskBackup();
        backup.save(sourcePath,"D:\\DestPath");

        backup = new FlashBackup();
        backup.save(sourcePath, "U:\\DestPath");

        backup= new AdapterRemote();
        backup.save(sourcePath, "www.test.com\\destPath");

    }

}










