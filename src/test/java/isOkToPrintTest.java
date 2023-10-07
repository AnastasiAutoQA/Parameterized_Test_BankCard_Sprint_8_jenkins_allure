import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class isOkToPrintTest {
    private String name;
    private boolean okToPrintResult;
    public isOkToPrintTest(int index, String name, boolean okToPrintResult){
        this.name = name;
        this.okToPrintResult = okToPrintResult;
    }

    @Parameterized.Parameters(name = "{0}]. Имя Фамилия {1}. Можно ли печатать на карте: {2}")
    public static Object[][] accountTestData(){
        return new Object[][]{
                {0, "Timoty Shalame", true},
                {1, "123Timoty sh", true},
                {2, "Tim 456sha", true},
                //{"Вася Иванов", true}, // кириллица
                {3, "Tim Sha lame", false},
                {4, "Ti Sha la 3m", false},
                {5, "TimotyShalame", false},
                {6, " TimotyShalame", false},
                {7, " Timoty Shalame", false},
                {8, "TimotyShalame ", false},
                {9, "Timoty Shalame ", false},
                {10, " Timoty Shalame ", false},
                {11, " TimotyShalame ", false},
                {12, "Timoty  Shalame", false},
                {13, "Ti", false}, // < 3 chars
                {14, "Timoty Shalamemememe", false} // > 19 chars
        };
    }
    @Test
    public void checkIfOkToPrint(){
        Account account = new Account(name);
        boolean isOKPrint = account.checkNameToEmboss();
        //assertFalse(String.valueOf(isOKPrint), okToPrintResult);
        assertEquals(okToPrintResult, isOKPrint);

    }
}
