package ru.netology.service;


import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @org.junit.Test

    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test

    public void testRemainWithCashBack() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);

    }

    @org.junit.Test

    public void testRemain1WithCashBack() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);

    }

    @org.junit.Test

    public void testRemain999WithCashBack() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(expected, actual);

    }

}