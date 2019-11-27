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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.vouch.sg/api/v1/merchants/bot/5c0899a0f82bb561b4eff079')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Andaz12/div_Get Started'), 'Get Started')

WebUI.click(findTestObject('Object Repository/Page_Andaz12/div_Get Started'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Andaz12/div_Im Momo your personal digital concierge_52d795'), 
    'I’m Momo, your personal digital concierge and I am here 24/7 to answer your questions. This is ONLY A DEMO - although the information is based off a real digital concierge that Vouch made for a hotel in Singapore')

WebUI.verifyElementInViewport(findTestObject('Object Repository/Page_Andaz12/div_Dining at Andaz                        _023e37'), 
    5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Andaz12/div_Reservations'))

WebUI.click(findTestObject('Object Repository/Page_Andaz12/div_Reservations'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Andaz12/div_Take a look and see what interests you'), 'Take a look and see what interests you!')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Andaz12/div_Booking issues'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Andaz12/div_Main Menu'))

WebUI.click(findTestObject('Object Repository/Page_Andaz12/div_Booking issues'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Andaz12/div_Experiencing issues while trying to boo_ff1770'), 
    'Experiencing issues while trying to book using our link? Contact us at +65408 0000 and we can help you out with the booking!')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Andaz12/div_Back'))

WebUI.click(findTestObject('Object Repository/Page_Andaz12/div_Back'))

WebUI.click(findTestObject('Object Repository/Page_Andaz12/div_Main Menu'))

WebUI.click(findTestObject('Object Repository/Page_Andaz12/div_Subscribe Newsletter'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Andaz12/div_Please provide us with your email'), 'Please provide us with your email.')

WebUI.closeBrowser()

