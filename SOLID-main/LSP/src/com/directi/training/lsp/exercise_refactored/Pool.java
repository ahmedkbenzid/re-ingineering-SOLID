package com.directi.training.lsp.exercise_refactored;

public class Pool {
	public void run() {
        Quackable donaldDuck = new Duck();
        Quackable electricDuck = new ElectronicDuck();

        Swimmable donaldSwim = (Swimmable) donaldDuck;
        Swimmable electricSwim = (Swimmable) electricDuck;

        quack(donaldDuck, electricDuck);
        swim(donaldSwim, electricSwim);
    }

    private void quack(Quackable... ducks) {
        for (Quackable duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Swimmable... ducks) {
        for (Swimmable duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }

}
