import org.junit.Assert;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;


public class TestAddition {
    FindAdditin fn = new FindAdditin();


    @Test
    public void addition_Of_single_char_Of_fabbanacci_series() {
        assertThat(fn.getAdditionCount("f")).isEqualTo(5);
    }

    @Test
    public void addition_Of_multiple_char_Of_fabbanacci_series() {
        assertThat(fn.getAdditionCount("f")).isEqualTo(5);
    }


}
//Command N
//Alt + Enter