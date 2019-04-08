package ua.kpi.fift;

import ua.kpi.fift.view.View;

import java.io.IOException;

public class ApplicationRunner {

    public static void main(String[] args) throws IOException {
        View view = new View();
        view.start();
    }
}
