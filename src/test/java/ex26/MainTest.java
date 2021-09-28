package ex26;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    //test cases that calculate how many months it takes to pay off a credit card
    public void calculateMonthsUntilPaidOff() {

        debtCalc test = new debtCalc();
        assertEquals(3,test.calculateMonthsUntilPaidOff(99999,15,50925));
        assertEquals(107,test.calculateMonthsUntilPaidOff(450,4,5));
        assertEquals(16,test.calculateMonthsUntilPaidOff(78851,14,5500));

    }

    @Test
    //test cases that include cents
    public void calcMonthsWCents()
    {
        debtCalc test = new debtCalc();
        assertEquals(91,test.calculateMonthsUntilPaidOff(7575.75,5,100.75));
        assertEquals(144,test.calculateMonthsUntilPaidOff(5466.89,20,100));
        assertEquals(31,test.calculateMonthsUntilPaidOff(99885.69,35,5000.43));
    }
}