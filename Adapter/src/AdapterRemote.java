public class AdapterRemote implements IBackup{

    BackupToRemoteDest remote;

    @Override
    public void save(String sourceDirPath, String destDirPAth) {
        remote = new BackupToRemoteDest();
        remote.saveToRemote(sourceDirPath, destDirPAth);
    }
}
