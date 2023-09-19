package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {
    @Test
    void calculateVacationMonths() {
        VacationService vacationService = new VacationService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int result = vacationService.calculateVacationMonths(income, expenses, threshold);

        Assertions.assertEquals(4, result);
    }
}
