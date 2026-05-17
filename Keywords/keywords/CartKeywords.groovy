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
	
	
	
	/**
	 * Open browser and navigate to subscription page
	 */
	static void openSubscriptionPage() {
		WebUI.openBrowser('https://www.modena.com/seamless-go-subscription/id_en')
		WebUI.waitForPageLoad(30)
	}
	
	/**
	 * Click Our Products link
	 */
	static void clickOurProducts() {
		WebUI.click(findTestObject('TC-01 Add Product To Cart/Page_MODENA Subscription  MODENA/a_Our Products'))
	}
	
	/**
	 * Select product by ID
	 * @param productId product ID to click (e.g., 'RO 5110 TEWH')
	 */
	static void selectProduct(String productId) {
		WebUI.click(findTestObject('TC-01 Add Product To Cart/Page_MODENA Subscription  MODENA/div_RO 5110 TEWH                           _54940f'))
	}
	
	/**
	 * Select subscription duration
	 * @param years duration in years (2, 3, 5, 6, or 7)
	 */
	static void selectDuration(int years) {
		WebUI.click(findTestObject('TC-01 Add Product To Cart/Page_Water Purifier Reverse Osmosis Tabletop  MODENA/div_3                                                        year'))
	}
	
	/**
	 * Click Add Subscription button
	 */
	static void clickAddSubscription() {
		WebUI.click(findTestObject('TC-01 Add Product To Cart/Page_Water Purifier Reverse Osmosis Tabletop  MODENA/button_Add Subscription'))
	}
	
	/**
	 * Complete add product flow
	 * @param productId product to add
	 * @param duration duration in years
	 */
	static void addProduct(String productId, int duration) {
		clickOurProducts()
		selectProduct(productId)
		selectDuration(duration)
		clickAddSubscription()
	}
}
