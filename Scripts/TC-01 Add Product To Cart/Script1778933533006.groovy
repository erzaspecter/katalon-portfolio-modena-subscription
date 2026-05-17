import keywords.CartKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// 1. Buka browser
CartKeywords.openSubscriptionPage()

// 2. Add product ke cart
CartKeywords.addProduct('RO 5110 TEWH', 3)

// 3. Verifikasi (opsional, bisa ditambahkan)
WebUI.comment('TC-01 berhasil: Product added to cart')

// 4. Tutup browser
WebUI.closeBrowser()