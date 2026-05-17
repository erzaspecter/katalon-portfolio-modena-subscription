import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling as FailureHandling  // ← TAMBAHKAN INI!

// 1. Buka browser
WebUI.openBrowser('https://www.modena.com/seamless-go-subscription/id_en')
WebUI.waitForPageLoad(30)

// 2. Ambil data dari Test Data
def products = findTestData('Data Files/ProductLists')

// 3. Looping untuk setiap produk
for (int i = 1; i <= products.getRowNumbers(); i++) {
    String productId = products.getValue('productId', i)
    
    WebUI.comment("Sedang memproses produk ke-" + i + ": " + productId)
    
    WebUI.click(findTestObject('TC-01 Add Product To Cart/Page_MODENA Subscription  MODENA/a_Our Products'))
    WebUI.click(findTestObject('TC-01 Add Product To Cart/Page_MODENA Subscription  MODENA/div_RO 5110 TEWH                           _54940f'))
    WebUI.click(findTestObject('TC-01 Add Product To Cart/Page_Water Purifier Reverse Osmosis Tabletop  MODENA/button_Add Subscription'))
    
    // SEMENTARA: skip verify dulu karena object belum ada
    WebUI.comment("Cart count seharusnya sekarang: " + i)
    
    WebUI.delay(2)
}

WebUI.closeBrowser()