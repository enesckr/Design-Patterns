public class FlashBackup implements IBackup{
    @Override
    public void save(String sourceDirPath, String destDirPAth) {
        System.out.println("Files are transferred from "+sourceDirPath+" to "+destDirPAth+" on flash disk.");
    }
}
