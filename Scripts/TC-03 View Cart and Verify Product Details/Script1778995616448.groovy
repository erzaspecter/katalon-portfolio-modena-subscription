import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import keywords.CartKeywords

WebUI.openBrowser(baseUrl)
WebUI.waitForPageLoad(30)

// Panggil keyword reusable
CartKeywords.addProductAndGoToCart(productName)
CartKeywords.verifyCartUrl()
CartKeywords.verifyProductInCart(productName)

WebUI.comment('TC-03 berhasil: Product ditemukan di halaman cart')
WebUI.closeBrowser()