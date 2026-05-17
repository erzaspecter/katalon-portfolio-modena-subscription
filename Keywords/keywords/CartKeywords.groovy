package keywords

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class CartKeywords {
    
    /**
     * Verify product exists in cart page
     * @param productId product ID to verify (e.g., 'RO 5110 TEWH')
     * @return true if product found
     */
    static boolean verifyProductInCart(String productId) {
        return WebUI.verifyTextPresent(productId, false)
    }
    
    /**
     * Verify cart URL is correct
     */
    static void verifyCartUrl() {
        WebUI.verifyMatch(WebUI.getUrl(), '.*/cart.*', true)
    }
    
    /**
     * Add product and go to cart in one flow
     * @param productId product to add
     */
    static void addProductAndGoToCart(String productId) {
        WebUI.click(findTestObject('TC-01 Add Product To Cart/Page_MODENA Subscription  MODENA/a_Our Products'))
        WebUI.click(findTestObject('TC-01 Add Product To Cart/Page_MODENA Subscription  MODENA/div_RO 5110 TEWH                           _54940f'))
        WebUI.click(findTestObject('TC-01 Add Product To Cart/Page_Water Purifier Reverse Osmosis Tabletop  MODENA/button_Add Subscription'))
        WebUI.click(findTestObject('TC-03 View Cart and Verify Product/a_Cart_Icon'))
    }
}