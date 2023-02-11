package org.com.very.easy.tasks.task;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 extends Task {

    public Task9() {
        setNumber(9);
        setDescription("Ввод элементов массива с клавиатуры.");
    }

    @Override
    public void run() {
        super.run();
        //создаём массив с заданным числом входных элементов arrSize.
        int arrSize = 3;
        //новый массив чисел. Без заданных заранее элементов
        int[] arr = new int[arrSize];
        //утилита сканнер нужна, чтобы прочитать ввод с клав-ы. https://javarush.com/groups/posts/klass-scanner
        Scanner scanner = new Scanner(System.in);
        //снова цикл, только теперь будем читать вход чисел в массив, где максимум = arrSize
        System.out.println("Введите три целых числа через пробел или с новой строки");
        for (int i = 0; i < arrSize; i++) {
            //воспользуемся одним из методов класса сканнер, чтобы он следил за тремя следующими целыми числами на ввод.
            //можешь побаловаться подставить что-то другое, посмотреть, что получится, если оставить просто next().
            //но рекомендую на будущее ознакомиться сразу
            //с BufferedReader&Writer https://metanit.com/java/tutorial/6.9.php
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
