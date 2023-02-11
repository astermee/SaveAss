package org.com.easy.tasks.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinanceReport {
    private String fullName;
    private Date date;

    private List<Payment> paymentList;

    public FinanceReport() {}

    //сеттер
    public FinanceReport(String fullName, Date date, List<Payment> paymentList) {
        this.fullName = fullName;
        this.date = date;
        this.paymentList = paymentList;
    }

    //конструктор
    public FinanceReport(FinanceReport financeReport) {
        this.fullName = financeReport.fullName;
        this.date = new Date(financeReport.getDate());
        this.paymentList = new ArrayList<>();
        for (Payment payment : financeReport.getPaymentList()) {
            this.paymentList.add(new Payment(payment));
        }
    }

    //геттеры
    public int getPaymentNumber() {
        return paymentList.size();
    }

    public Payment getPayment(int index) {
        return paymentList.get(index);
    }

    public Date getDate() {
        return date;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }
    //сеттер
    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    //в строку
    @Override
    public String toString() {
        return String.format("[Автор: %s, Дата: %s, Платежи: %s]",
                fullName, date.toString(), Arrays.toString(paymentList.toArray()));
    }
}
