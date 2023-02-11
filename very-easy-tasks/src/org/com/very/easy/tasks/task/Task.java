package org.com.very.easy.tasks.task;

//создадим абстрактный класс, который будет делать однообразную работу - печатать номер задания и описание сразу после
//его запуска. Для запуска также напишем метод
//https://metanit.com/java/tutorial/3.6.php подробнее про абстрактные классы

public abstract class Task {

    //создадим защищенные переменные, чтобы их нельзя было перенаследовать
    protected Integer number;
    protected String description;

    //геттеры и сеттеры для переменных, чтобы ими можно было пользоваться
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //метод печатающий номер задачи и ее описание
    public void run() {
        System.out.printf("Задача %d: %s%n", number, description);
    }
}
