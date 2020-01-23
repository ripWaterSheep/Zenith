package game.settings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Settings {

    private static int forward;
    private static int backwards;
    private static int left;
    private static int right;
    private static int mouseTurn;
    private static int mouseShoot;

    private static int[] allSettings = {
            forward,
            backwards,
            left,
            right,
            mouseTurn,
            mouseShoot
    };


    private static String settingsPath = ".\\src\\game\\settings\\game.settings.txt";
    private static String defaultSettingsPath = ".\\src\\game\\settings\\defaultSettings.txt";

    public static void generateSettings(double forward, double left, double backwards, double right, double mouseTurn, double mouseShoot) throws IOException {
        String str = forward + "\n"
                + left + "\n"
                + backwards + "\n"
                + right + "\n"
                + mouseTurn + "\n"
                + mouseShoot + "\n";

        // attach a file to FileWriter
        File file = new File(settingsPath);
        FileWriter fw = new FileWriter(file);

        // read character wise from string and write
        // into FileWriter
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));

        System.out.println("Writing successful");
        //close the file
        fw.close();

        applySettings();
    }


    public static void applyDefaultSettings() throws FileNotFoundException {
        File file =
                new File(defaultSettingsPath);
        Scanner sc = new Scanner(file);

        for (int i = 0; i < allSettings.length; i++) {
            allSettings[i] = (int) sc.nextDouble();
        }
    }


    public static int[] readSettings() {
        return allSettings;
    }


    private static void applySettings() throws IOException {
        File file =
                new File(settingsPath);
        Scanner sc = new Scanner(file);

        for (int i = 0; i < allSettings.length; i++) {
            allSettings[i] = (int) sc.nextDouble();
        }
    }
}
