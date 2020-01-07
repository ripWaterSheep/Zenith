package Testers;

import Game.Settings.Settings;

import java.io.IOException;
import java.util.Arrays;

public class SettingsTester {
    public static void main(String[] args) throws IOException {
        Settings.generateSettings(1,2,3,4,5,6);
        System.out.println(Arrays.toString(Settings.readSettings()));
        Settings.applyDefaultSettings();
        System.out.println(Arrays.toString(Settings.readSettings()));
    }
}
