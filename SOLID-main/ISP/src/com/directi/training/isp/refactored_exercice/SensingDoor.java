package com.directi.training.isp.refactored_exercice;

import com.directi.training.isp.refactored_exercice.Sensor;

public class SensingDoor implements PDoor{
    private boolean _locked;
    private boolean _opened;

    public SensingDoor(Sensor sensor)
    {
        sensor.register(this);
    }

    @Override
    public void lock()
    {
        _locked = true;
    }

    @Override
    public void unlock()
    {
        _locked = false;
    }

    @Override
    public void open()
    {
        if (!_locked) {
            _opened = true;
        }
    }

    @Override
    public void close()
    {
        _opened = false;
    }

    @Override
    public void proximityCallback()
    {
        _opened = true;
    }
}
