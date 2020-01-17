package testers;

import util.Clock;

public class ClockTester {
    public static void main(String[] args) {
        Clock clock = new Clock(500);
        while(true) {
            Clock.runInstances();
            System.out.println(clock.isLapDone());
        }
    }
}
