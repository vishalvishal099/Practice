import org.junit.Assert;
import org.junit.Test;

public class TestAddition {
    FindAdditin fn = new FindAdditin();


    @Test
    public void addition_Of_single_char_Of_fabbanacci_series() {
        Assert.assertEquals(fn.getAdditionCount("f"), 5);
    }

    @Test
    public void addition_Of_multiple_char_Of_fabbanacci_series() {
        Assert.assertEquals(fn.getAdditionCount("fgh"), 26);
    }


}
//Command N
//Alt + Enter