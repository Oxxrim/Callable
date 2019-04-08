package ua.kpi.fift.service.sercieImpl;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import ua.kpi.fift.service.FileService;
import ua.kpi.fift.view.View;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileServiceImpl implements FileService {

    private Logger log = Logger.getLogger(FileServiceImpl.class.getName());

    public void readFromFolder(String path, String finalPath) throws IOException {
        log.log(Level.INFO,"Start reading from folder");
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        if (!folder.exists()){
            log.log(Level.WARNING,"Please input correct path");
            View view = new View();
            view.start();
        } else {
            for (int i = 0; i < listOfFiles.length; i++){
                if (listOfFiles[i].toString().contains(".txt")){
                    readFromFile(listOfFiles[i], finalPath);
                }
            }
        }
    }

    public void readFromFile(File file, String finalPath) throws IOException {
        log.log(Level.INFO,"Start reading from file");
        String text = FileUtils.readFileToString(file);
        String[] words = text.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++){
            if (StringUtils.isNumeric(words[i])){
                int number = Integer.parseInt(words[i]);
                if (number > 100 && number < 99999){
                    count++;
                }
            }
        }
        if (count != 0) {
            saveToFile(file, finalPath, count);
        }
    }

    public void saveToFile(File file, String finalPath, int count) throws IOException {
        File finalFile = new File(finalPath);
        if (!finalFile.exists()){
            finalFile.getParentFile().mkdirs();
            finalFile.createNewFile();
        }

        FileUtils.writeStringToFile(finalFile, "\n" + file.toString() + "  count of numbers > 100 and < 99999 " + count, true);
        System.out.println(FileUtils.readFileToString(finalFile));
    }
}
