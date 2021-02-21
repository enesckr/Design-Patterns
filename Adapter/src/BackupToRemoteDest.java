public class BackupToRemoteDest {
    public void saveToRemote(String sourcePath, String destPath){
        establishConnection(destPath);
        sendFiles(sourcePath);
        terminateConnection();
    }
    private void establishConnection(String destination){
        System.out.println("Connection established with "+ destination);
    }
    private void sendFiles(String source){
        System.out.println("Files in "+source+" sending to destination ...");
    }
    private void terminateConnection(){
        System.out.println("Connection terminated.");
    }

}
