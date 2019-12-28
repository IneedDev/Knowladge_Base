import main.java.com.tests.Testing;

import lombok.Data;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Data
class TestingTest {

    Testing testing = new Testing();
    int x = 1;
    int y = 2;
    int number;
    int RangeMin = 3;
    int RangeMax = 7;

    public int getX() {
        return x;
    }

    public void setNumber(int number) {
        this.number = testing.feedCheckRangeTestMethod();
    }

    public int getY() {
        return y;
    }

    public int getNumber() {
        return number;
    }

    public int getRangeMin() {
        return RangeMin;
    }

    public int getRangeMax() {
        return RangeMax;
    }


    //test of non static method
    // we define setup method and startup data which should be the same for all testing methods and testing lifecycle
//    @Before
//    public int setup(){
//        Testing testing = new Testing();
//        int x = 1;
//        int y = 2;
//        int RangeMin = 3;
//        int RangeMax = 7;
//        return testing.addInteger(x,y);
//    }


    @Test
    void addInteger() {
        //initVariables();
        assertEquals(3,testing.addInteger(getX(),getY()));
    }

    @Test
    @Disabled
    void checkRangeTrue() {
        System.out.println("number is: " + number);
        assertTrue(testing.checkRange(getRangeMin(),getRangeMax(),getNumber()));
    }

    @Test
    @Disabled
    void checkRangeFalse() {
        System.out.println("number is: " + number);
        assertFalse(testing.checkRange(getRangeMin(),getRangeMax(),getNumber()));
    }
}