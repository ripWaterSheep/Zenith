package testers;

import settings.Settings;

import java.io.IOException;
import java.util.Arrays;

public class SettingsTester {
    public static void main(String[] args) throws IOException {
        Settings.generateSettings(0, 0, 0, 0, 0, 0);
        Settings.applyDefaultSettings();
        System.out.println(Arrays.toString(Settings.readSettings()));
    }
}
