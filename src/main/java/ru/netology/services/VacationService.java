package ru.netology.services;

public class VacationService {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int money = 0;
        int vacationMonths = 0;

        for (int i = 1; i <= 12; i++) {
            if (money >= threshold) {
                vacationMonths++;
                money -= expenses;
                money /= 3;
                vacationMonths += 1;
            } else {
                money += income;
                money -= expenses;
            }
        }

        return vacationMonths;
    }
}
