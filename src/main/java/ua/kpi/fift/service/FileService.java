package ua.kpi.fift.service;

import java.io.IOException;

public interface FileService {
    void readFolders(String path, String finalPath) throws IOException;
}
