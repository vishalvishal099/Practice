import org.junit.Assert;
import org.junit.Test;

public class TestAddition {
    FindAdditin fn = new FindAdditin();
    String s = "f";

    @Test
    public void addition_Of_Char_Of_Fabbanacci_Series() {
        Assert.assertEquals(fn.getAdditionCount(s), 5);
    }
}
//Command N
//Alt + Enter