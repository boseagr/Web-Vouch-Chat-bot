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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://staging.vouch.sg/api/v1/merchants/bot/5c0899a0f82bb561b4eff079')

WebUI.click(findTestObject('Object Repository/Page_Andaz12/div_Get Started'))

WebUI.comment('Check if the chatbot respond after clicking "Get Started" button')

WebUI.comment('check if the 3 buttons (Promotion, Video Tour, Reservation) is clickable')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Andaz12/div_reservation'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Andaz12/div_Promotions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Andaz12/div_video tour'))

WebUI.click(findTestObject('Object Repository/Page_Andaz12/div_reservation'))

WebUI.comment('Check if the chatbot respond after clicking "Reservation" button')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Andaz12/div_Book Now'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Andaz12/div_Find out more_1'))

WebUI.click(findTestObject('Object Repository/Page_Andaz12/div_Find out more_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Andaz12/div_Book Now_1'))

WebUI.closeBrowser()

