package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuckPool
{
    public void run()
    {
        ElectronicDuck electricDuck = new ElectronicDuck();
        quack(electricDuck);
        swim( electricDuck);
    }

    private void quack(ElectronicDuck... ducks)
    {
        for (ElectronicDuck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(ElectronicDuck... ducks)
    {
        for (ElectronicDuck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        ElectronicDuckPool pool = new ElectronicDuckPool();
        pool.run();
    }
}
