package com.directi.training.isp.refactored_exercice;

import java.util.Random;

public class Sensor {
    public void register(PDoor pDoor)
    {
        while (true) {
            if (isPersonClose()) {
                pDoor.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
