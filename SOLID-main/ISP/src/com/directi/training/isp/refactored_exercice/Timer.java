package com.directi.training.isp.refactored_exercice;

import java.util.TimerTask;

public class Timer {
    public void register(long timeOut, final TDoor tDoor)
    {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                tDoor.timeOutCallback();
            }
        }, timeOut);
    }
}
