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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseURL)

WebUI.setText(findTestObject('Login/field_Username'), GlobalVariable.userName)

WebUI.setText(findTestObject('Login/field_Password'), 'hehe')

WebUI.click(findTestObject('Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Login/error_Message'), 0)

WebUI.verifyElementText(findTestObject('Login/error_Message'), GlobalVariable.noRecords)

WebUI.setText(findTestObject('Login/field_Username'), 'hehe')

WebUI.setText(findTestObject('Login/field_Password'), GlobalVariable.userPass)

WebUI.click(findTestObject('Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Login/error_Message'), 0)

WebUI.verifyElementText(findTestObject('Login/error_Message'), GlobalVariable.noRecords)

WebUI.refresh()

WebUI.setText(findTestObject('Login/field_Password'), GlobalVariable.userPass)

WebUI.click(findTestObject('Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Login/error_Message'), 0)

WebUI.verifyElementText(findTestObject('Login/error_Message'), GlobalVariable.noUsername)

WebUI.refresh()

WebUI.setText(findTestObject('Login/field_Username'), GlobalVariable.userName)

WebUI.click(findTestObject('Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Login/error_Message'), 0)

WebUI.verifyElementText(findTestObject('Login/error_Message'), GlobalVariable.noPassword)

WebUI.closeBrowser()
