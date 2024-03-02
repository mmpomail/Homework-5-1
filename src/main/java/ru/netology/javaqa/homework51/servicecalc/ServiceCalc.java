package ru.netology.javaqa.homework51.servicecalc;

public class ServiceCalc {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        threshold = 0; // остаток на счёте

        for (int month = 0; month < 12; month++) {
            if (threshold >= 20_000) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                threshold = threshold - expenses - (expenses * 4); // трата средств во время отдыха
            } else {
                threshold = threshold + (income - expenses); // остаток счёта после рабочего месяца
            }
        }
        return count;
    }
}
