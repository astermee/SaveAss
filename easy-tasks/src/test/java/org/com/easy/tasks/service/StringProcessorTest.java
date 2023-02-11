package org.com.easy.tasks.service;

import org.com.easy.tasks.exception.IncorrectInputException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    private StringProcessor stringProcessor;

    @BeforeEach
    void setUp() {
        stringProcessor = new StringProcessor();
    }

    @Test
    //repeat метод тест с норм. значением повторов
    void repeat() {
        String inputString = "Test";
        int inputInt = 3;
        String expected = "TestTestTest";
        String actual = stringProcessor.repeat(inputString, inputInt);
        assertEquals(expected, actual);
    }
    //repeat метод тест с 0 значение повторов
    @Test
    void repeatEmptyIntStroke() {
        String inputString = "Test";
        int inputInt = 0;
        String expected = "";
        String actual = stringProcessor.repeat(inputString, inputInt);
        assertEquals(expected, actual);
    }

    //проверка числа повторов метода count
    @Test
    void count() throws IncorrectInputException {
        String inputString = "Автоматизированный авторобот";
        String inputSubstring = "ро";
        int expected = 2;
        int actual = stringProcessor.count(inputString, inputSubstring);
        assertEquals(expected, actual);
    }

    //проверка замены числовых значений словами
    @Test
    void replaceByNumber() {
        String inputString = "Я хочу 1 рожок мороженого, 2 беляша и 3 кулебяки";
        String expected = "Я хочу один рожок мороженого, два беляша и три кулебяки";
        String actual = stringProcessor.replaceByNumber(inputString);
        assertEquals(expected, actual);
    }

    //удалить каждый второй символ
    @Test
    void deleteEachSecond() {
        StringBuilder sb = new StringBuilder("Компьютер шумит");
        String expected = "Кмьтршмт";
        String actual = stringProcessor.deleteEachSecond(sb).toString();
        assertEquals(expected, actual);
    }
}