import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import keywords.CartKeywords

WebUI.openBrowser(baseUrl)
WebUI.waitForPageLoad(timeout)

// Panggil keyword reusable
CartKeywords.addProductAndGoToCart(productName)
CartKeywords.verifyCartUrl()
CartKeywords.verifyProductInCart(productName)

WebUI.comment(successMessage)
// Menggunakan variable shouldCloseBrowser
if (shouldCloseBrowser) {
    WebUI.closeBrowser()
}