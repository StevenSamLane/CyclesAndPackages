package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {
    @Test
    void calculateVacationMonths() {
        VacationService vacationService = new VacationService();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int result = vacationService.calculateVacationMonths(income, expenses, threshold);

        Assertions.assertEquals(6, result);
    }
}
