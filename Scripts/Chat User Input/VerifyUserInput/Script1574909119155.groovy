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

WebUI.waitForJQueryLoad(5)

WebDriver driver = DriverFactory.getWebDriver()

WebUI.click(findTestObject('Object Repository/Page_Andaz12/div_Get Started'))

WebUI.comment('Check if the chatbot respond after clicking "Get Started" button')

WebUI.comment('check if the 3 buttons (Promotion, Video Tour, Reservation) is clickable')

for (def index : ['room choice', 'trouble with booking', 'book for room']) {
    WebUI.setText(findTestObject('Object Repository/Page_Andaz12/input_This is an alert_vc-input'), index)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Andaz12/input_This is an alert_vc-input'), Keys.chord(Keys.ENTER))

    //WebUI.scrollToElement(findTestObject('Page_Andaz12/div_user Respond'), 5)
    List elements = driver.findElements(By.xpath('//*[@style = \'background-color: rgb(19, 30, 46); color: rgb(255, 255, 255);\']'))

    WebUI.verifyEqual(elements[(elements.size() - 1)].getText(), index //WebUI.verifyElementText(elements[(elements.size() - 1)].getText(), usrRespond)
        //WebUI.verifyElementText(elements[(elements.size() - 1)].getText(), usrRespond)
        )
}

WebUI.closeBrowser()

