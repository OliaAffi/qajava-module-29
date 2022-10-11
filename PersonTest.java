import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import static org.testng.Assert.assertEquals;

public class PersonTest {
    public static boolean isTeenager2(int age2) {
        boolean expected;
        if (age2 < 13) {
            expected = false;
        } else if (age2 >= 13 & age2 <= 19) {
            expected = true;
        } else if (age2 > 19) {
            expected = false;
        } else if (age2 == 0) {
            expected = false;
        } else {
            expected = false;
        }
        return expected;
    }

    @DataProvider(name = "Person")
    Object[][] dataProvider() {
        return new Object[][]{
                {0, 0},
                {1, 1},
                {7, 7},
                {12, 12},
                {13, 13},
                {14, 14},
                {16, 16},
                {18, 18},
                {19, 19},
                {20, 20},
                {55, 55},
                {100, 100},
                {-1 , -1}
        };
    }

    @Test(dataProvider = "Person")
    public void test(int age, int age2) {
        boolean result = Person.isTeenager(age);
        boolean expected = PersonTest.isTeenager2(age2);
        System.out.println("AgeTest " + age2);
        System.out.println("Result " + expected);
        System.out.println("Age " + age);
        System.out.println("Actual result " + result);
        assertEquals(expected, result);
    }
}




