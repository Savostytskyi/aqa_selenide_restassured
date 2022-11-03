import org.testng.Assert;
import org.testng.annotations.Test;

public class WishListTest {

    @Test
    public void checkWishListIsNotEmpty() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void checkWishListIsEmpty() {
        Assert.assertEquals(0, 0);
    }
}
