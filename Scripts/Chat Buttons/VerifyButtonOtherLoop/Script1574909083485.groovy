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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('https://staging.vouch.sg/api/v1/merchants/bot/5c0899a0f82bb561b4eff079')

WebDriver driver = DriverFactory.getWebDriver()

WebUI.waitForJQueryLoad(5)

WebUI.click(findTestObject('Object Repository/Page_Andaz12/div_Get Started'))

WebUI.comment('Check if the chatbot respond after clicking "Get Started" button')

WebUI.comment('check if the 3 buttons (Promotion, Video Tour, Reservation) is clickable')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Andaz12/div_reservation'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Andaz12/div_Promotions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Andaz12/div_video tour'))

wedding = 'Object Repository/Page_Andaz12/div_Weddings'

room = 'Object Repository/Page_Andaz12/div_Room Types'

meetings = 'Object Repository/Page_Andaz12/div_Meetings  Events'

special_event = 'Object Repository/Page_Andaz12/div_Special Events'

contact = 'Object Repository/Page_Andaz12/div_Contact'

trivia = 'Object Repository/Page_Andaz12/div_Trivia'

subscribe = 'Object Repository/Page_Andaz12/div_Subscribe'

pool = 'Object Repository/Page_Andaz12/div_Swimming Pool'

gym = 'Object Repository/Page_Andaz12/div_Gym'

more = 'Object Repository/Page_Andaz12/div_See More'

for (def index : [wedding, room, meetings, special_event, contact, trivia, subscribe, pool, gym, more]) {
    WebUI.click(findTestObject(index))

    usrRespond = WebUI.getText(findTestObject(index))

    //WebUI.scrollToElement(findTestObject('Page_Andaz12/div_user Respond'), 5)
    List elements = driver.findElements(By.xpath('//*[@style = \'background-color: rgb(19, 30, 46); color: rgb(255, 255, 255);\']'))

    if (elements.size() > 0) {
        println(elements[(elements.size() - 1)].getText())

        WebUI.verifyEqual(elements[(elements.size() - 1)].getText(), usrRespond) //WebUI.verifyElementText(elements[(elements.size() - 1)].getText(), usrRespond)
    } else {
        WebUI.verifyElementText(findTestObject('Object Repository/Page_Andaz12/div_user Respond'), usrRespond)
    }
}

WebUI.closeBrowser()

