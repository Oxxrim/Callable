package ua.kpi.fift.controller;

import ua.kpi.fift.service.FileService;
import ua.kpi.fift.service.sercieImpl.FileServiceImpl;

import java.io.IOException;

public class Controller {

    private FileService service = new FileServiceImpl();

    public void serviceController(String path, String finalPath) throws IOException {
        service.readFromFolder(path, finalPath);
    }
}
