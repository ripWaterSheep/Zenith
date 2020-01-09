package Testers;

import Util.Clock;

public class ClockTester {
    public static void main(String[] args) {
        Clock clock = new Clock(500);
        Clock printChecker = new Clock(250);
        while (true) {
            Clock.runInstances();
            if (printChecker.isLapDone()) {
                System.out.println(clock.getAmtLapsDone());
            }
        }
    }
}
