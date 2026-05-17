import keywords.CartKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import groovy.json.JsonSlurper

// 1. UI - Add product
CartKeywords.openSubscriptionPage()
CartKeywords.addProduct('RO 5110 TEWH', 7)
WebUI.comment("✅ UI: Product added to cart")

// 2. API - Get cart
def response = WS.sendRequest(findTestObject('API/GetCart'))

// 3. Basic verification
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'message', 'Carts retrieved successfully.')

// 4. Parse JSON untuk verifikasi detail
def json = new JsonSlurper().parseText(response.getResponseText())

// Verify data tidak kosong
assert json.data.size() > 0 : "Cart should not be empty"

// Cara yang benar untuk mengakses data pertama
def cartEntry = json.data.entrySet().iterator().next()
def cartId = cartEntry.key
def cartData = cartEntry.value

def firstItem = cartData.items[0]

assert firstItem.code == 'RO 5110 TEWH'
assert firstItem.name == 'Water Purifier Reverse Osmosis Tabletop'
assert firstItem.duration == 7
assert firstItem.quantity == 1

WebUI.comment("✅ API: Cart verification passed")
WebUI.comment("   - Cart ID: ${cartId}")
WebUI.comment("   - Title: ${cartData.title}")
WebUI.comment("   - Product: ${firstItem.name}")
WebUI.comment("   - Code: ${firstItem.code}")
WebUI.comment("   - Duration: ${firstItem.duration} years")
WebUI.comment("   - Quantity: ${firstItem.quantity}")

WebUI.closeBrowser()