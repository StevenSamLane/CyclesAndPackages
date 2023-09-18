package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {
    @Test
    void calculateVacationMonths() {
        VacationService vacationService = new VacationService();

        int income = 110000;
        int expenses = 30000;
        int threshold = 100000;

        int result = vacationService.calculateVacationMonths(income, expenses, threshold);

        Assertions.assertEquals(4, result);
    }
}