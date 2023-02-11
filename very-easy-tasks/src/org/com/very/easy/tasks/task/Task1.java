package org.com.very.easy.tasks.task;

//наследуемся от абстрактноого класса Task, чтобы пользоваться его содержимым
public class Task1 extends Task {
    //метод таск1, который пользуется сеттерами номера и описания в классе Task.
    public Task1() {
        setNumber(1);
        setDescription("Напишите программу, которая выводит на консоль строку 'Hello, World!'.");
    }
    //аннотация с указанием того, что последующее после него перенаследовано,в нашем случае из класса Task
    @Override
    public void run() {
        //срабатывает метод run из Task https://www.examclouds.com/ru/java/java-core-russian/keyword-super
        super.run();
        System.out.println("Hello, World!");
    }
}
