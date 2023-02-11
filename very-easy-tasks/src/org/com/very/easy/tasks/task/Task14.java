package org.com.very.easy.tasks.task;

import java.util.Arrays;

public class Task14 extends Task {

    public Task14() {
        setNumber(14);
        setDescription("Переставьте в массиве элементы в обратном порядке.");
    }

    @Override
    public void run() {
        super.run();
        int[] arr = {1, 2, 3, 4, 5};
        //для этого создадим еще один массив в который будем переворачивать первый массив, его макс. количество элем-ов
        //будет равен длине массива первого
        int[] resultArr = new int[arr.length];
        //проходимся по первому массиву
        for (int i = 0; i < arr.length; i++) {
            //в 0 индекс второго массива вписываем значение последнего элемента и последующих первого массива
            resultArr[i] = arr[arr.length - 1 - i];
        }
        System.out.println("Перевернутый массив: " + Arrays.toString(resultArr));
    }
}
