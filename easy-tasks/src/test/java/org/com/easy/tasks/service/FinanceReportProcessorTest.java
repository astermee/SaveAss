package org.com.easy.tasks.service;

import org.com.easy.tasks.entity.Date;
import org.com.easy.tasks.entity.FinanceReport;
import org.com.easy.tasks.entity.Payment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FinanceReportProcessorTest {

    private FinanceReport financeReport;

    @BeforeEach
    void setUp() {
        financeReport = new FinanceReport();
    }

    //Возникают ошибки при передаче даты хз

    @Test
    void getAllPaymentByFirstCharInName() {
        FinanceReport actual = FinanceReportProcessor.getAllPaymentByFirstCharInName(financeReport, 'a');
    }

    @Test
    void getAllByValue() {
        Payment payment1 = new Payment();
        payment1.setFullName("Aleksei");
        payment1.setDate(new Date(1,2,2022));
        payment1.setValue(900);
        Payment payment2 = new Payment();
        payment2.setFullName("Marina");
        payment2.setDate(new Date(2,1,2021));
        payment2.setValue(1100);
        List payment = new ArrayList();
        payment.add(payment1);
        payment.add(payment2);
        FinanceReport actual = new FinanceReport();
        actual.setPaymentList(payment);
        actual = FinanceReportProcessor.getAllByValue(financeReport, 1000);
        String expected = "900, 500";
        Assertions.assertEquals(expected, actual);
    }
}