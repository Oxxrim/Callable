package ua.kpi.fift.service.sercieImpl;

import ua.kpi.fift.service.FileService;

import java.io.File;
import java.util.concurrent.Callable;

public class MyCallable implements Callable {

    private File file;

    private String finalPath;

    public String call() throws Exception {
        FileServiceImpl service = new FileServiceImpl();

        service.readFromFile(file, finalPath);

        return Thread.currentThread().getName();
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFinalPath() {
        return finalPath;
    }

    public void setFinalPath(String finalPath) {
        this.finalPath = finalPath;
    }
}
