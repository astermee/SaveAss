package org.com.very.easy.tasks.task;

public class Task5 extends Task {

    public Task5() {
        setNumber(5);
        setDescription("Протабулируйте функцию sin(x) в заданных пределах и с заданным шагом.");
    }

    @Override
    public void run() {
        super.run();
        double x = 0;
        double xk = 3.0;
        double h = 0.5;
        //пишем цикл, в котором наша функция будет "шагать" на h шаг ща каждую итерацию
        while (x <= xk + h / 2) {
            //воспользуемся стандратной биб-кой Math для вычисления синуса https://metanit.com/java/tutorial/12.1.php
            double y = Math.sin(x);
            System.out.println("x = " + x + ", y = " + y);
            x += h;
        }
    }
}
