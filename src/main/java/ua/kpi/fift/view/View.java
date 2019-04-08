package ua.kpi.fift.view;

import ua.kpi.fift.controller.Controller;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class View {
    private Controller controller = new Controller();

    private Logger log = Logger.getLogger(View.class.getName());

    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        log.log(Level.INFO,"Application start");
        System.out.println("Lab 1 Variant 13\nOkhrumenko Dmytro IS-61");

        System.out.print("Please input path to folder: ");
        String path = scanner.nextLine();

        System.out.print("Please input path to final file: ");
        String finalPath = scanner.nextLine();

        controller.serviceController(path, finalPath);
    }
}
