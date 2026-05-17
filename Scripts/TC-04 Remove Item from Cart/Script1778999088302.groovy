import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import keywords.CartKeywords

WebUI.openBrowser('https://www.modena.com/seamless-go-subscription/id_en')
WebUI.waitForPageLoad(30)

// Panggil keyword reusable
CartKeywords.addProductAndGoToCart('RO 5110 TEWH')
CartKeywords.verifyCartUrl()
CartKeywords.verifyProductInCart('RO 5110 TEWH')

WebUI.comment('TC-03 berhasil: Product ditemukan di halaman cart')
WebUI.closeBrowser()