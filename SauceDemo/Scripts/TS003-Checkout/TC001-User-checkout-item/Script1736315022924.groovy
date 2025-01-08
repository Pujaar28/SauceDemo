import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL as GLOBAL
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

WebUI.setText(findTestObject('Page_Login/field_Username'), GlobalVariable.userName)

WebUI.setText(findTestObject('Page_Login/field_Password'), GlobalVariable.userPass)

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.click(findTestObject('Page_Dashboard/Add_Item_To_Cart'))

WebUI.click(findTestObject('Page_Dashboard/button_Cart'))

WebUI.click(findTestObject('Page_Cart/button_Checkout'))

WebUI.setText(findTestObject('Page_Checkout/Field_FirstName'), 'Puja Aditya')

WebUI.setText(findTestObject('Page_Checkout/Field_LastName'), 'Raihan')

WebUI.setText(findTestObject('Page_Checkout/Field_PostalCode'), '42123')

WebUI.click(findTestObject('Page_Checkout/button_Continue'))

WebUI.verifyElementPresent(findTestObject('Page_Checkout/product_Item'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Checkout/product_name'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Checkout/product_desc'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Checkout/Payment_Info'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Checkout/summary_tax_label'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Checkout/summary_total_label'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Checkout/summary_subtotal_label'), 0)

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Page_Checkout/button_finish'))

WebUI.verifyElementPresent(findTestObject('Page_Checkout/complete_checkout'), 0)

WebUI.verifyTextPresent('THANK YOU FOR YOUR ORDER', false)

WebUI.verifyElementPresent(findTestObject('Page_Checkout/Image'), 0)

WebUI.closeBrowser()

