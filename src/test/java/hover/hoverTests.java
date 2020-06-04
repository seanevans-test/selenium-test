package hover;

import base.BaseTests;
import org.testng.annotations.Test;

public class hoverTests extends BaseTests {

    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
    }
}
