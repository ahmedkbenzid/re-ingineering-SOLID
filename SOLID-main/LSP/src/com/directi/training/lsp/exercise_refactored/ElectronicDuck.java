package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck implements Quackable, Swimmable {
    private boolean _on = false;

    @Override
    public void quack() {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            System.out.println("Electronic duck is off, silent quack");
        }
    }

    @Override
    public void swim() {
        if (_on) {
            System.out.println("Electronic duck swims...");
        } else {
            System.out.println("Electronic duck is off, floating silently");
        }
    }

    public void turnOn() {
        _on = true;
    }

    public void turnOff() {
        _on = false;
    }
}
