package util;

import java.util.ArrayList;

import static java.lang.System.currentTimeMillis;

public class Clock {
    public static ArrayList<Clock> instances = new ArrayList<>();

    private long startTime = currentTimeMillis();
    private long currTime = startTime;
    private long lapPeriod;
    private long lapStart;

    private int amtLapsDone;

    private boolean lapDone;
    private boolean paused = false;

    public Clock(long lapPeriod) {
        instances.add(this);

        this.lapPeriod = lapPeriod;
    }


    public boolean isLapDone() {
        return lapDone;
    }

    public long getCurrTime() {
        return currTime;
    }

    public long getLapStart() {
        return lapStart;
    }

    public int getAmtLapsDone() {
        return amtLapsDone;
    }

    public boolean oneLapDone() { return getAmtLapsDone() > 0; }

    public void startClock() {
        paused = false;
    }

    public void pauseClock() {
        paused = true;
    }


    private void run() {
        if (paused) {
            return;
        }
        lapDone = false;

        currTime = currentTimeMillis() - startTime;

        if (currTime - lapStart >= lapPeriod) {
            lapStart = currTime;
            amtLapsDone++;
            lapDone = true;
        }

    }


    public static void runInstances() {
        for (Clock c : instances)
            c.run();
    }
}
