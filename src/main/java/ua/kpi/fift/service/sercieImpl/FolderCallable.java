package ua.kpi.fift.service.sercieImpl;

import java.util.concurrent.Callable;

public class FolderCallable implements Callable {

    private String folder;
    private String finalPath;

    public String call() throws Exception {
        FileServiceImpl service = new FileServiceImpl();
        service.readFromFolder(folder, finalPath);

        return Thread.currentThread().getName();
    }

    public FolderCallable(String folder, String finalPath) {
        this.folder = folder;
        this.finalPath = finalPath;
    }
}
