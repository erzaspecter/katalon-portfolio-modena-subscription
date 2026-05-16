import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//1. Buka browser
WebUI.openBrowser('https://www.modena.com/seamless-go-subscription/id_en')

//WebUI.maximizeWindow()
WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('TC-01 Add Product To Cart/Page_MODENA Subscription  MODENA/a_Our Products'))

WebUI.click(findTestObject('TC-01 Add Product To Cart/Page_MODENA Subscription  MODENA/div_RO 5110 TEWH                           _54940f'))

WebUI.click(findTestObject('TC-01 Add Product To Cart/Page_Water Purifier Reverse Osmosis Tabletop  MODENA/div_3                                                        year'))

WebUI.click(findTestObject('TC-01 Add Product To Cart/Page_Water Purifier Reverse Osmosis Tabletop  MODENA/button_Add Subscription'))

