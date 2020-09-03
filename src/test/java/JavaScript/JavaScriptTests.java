package JavaScript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();

    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScrollPage().scrollToParagraph(5);
    }
}
