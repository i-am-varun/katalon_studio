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

WebUI.navigateToUrl('https://www.eurocarparts.com/')

WebUI.click(findTestObject('Object Repository/Page_Euro Car Parts  Car Parts Online  In S_6dc522/img'))

WebUI.click(findTestObject('Object Repository/Page_Secure Login  Euro Car Parts/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/Page_Secure Login  Euro Car Parts/img'))

WebUI.setText(findTestObject('Object Repository/Page_Secure Login  Euro Car Parts/input__email'), 'varunverma1173@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Secure Login  Euro Car Parts/input__password'), '2MHI+tpB8nz5gK/VW62piw==')

WebUI.click(findTestObject('Object Repository/Page_Secure Login  Euro Car Parts/button_Sign In'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Secure Login  Euro Car Parts/input__password'), '2MHI+tpB8nxk6shyL38K5jq9UEZp1CLN')

WebUI.click(findTestObject('Object Repository/Page_Secure Login  Euro Car Parts/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_My Account/h2_My Account'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_My Account/h2_My Account'), 'My Account')

WebUI.closeBrowser()

