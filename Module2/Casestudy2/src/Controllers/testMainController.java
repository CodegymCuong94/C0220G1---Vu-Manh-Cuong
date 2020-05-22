package Controllers;

import java.io.FileNotFoundException;
import java.io.IOException;

public class testMainController {
    public static void main(String[] args) {
        try {
            MainController t2 = new MainController();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
