import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://the-internet.herokuapp.com/forgot_password')

WebUI.setText(findTestObject('Mail/input_E-mail_email'), 'miguel.negrillo@grupoonetec.com')

WebUI.click(findTestObject('Mail/i_Retrieve password'))

if(WebUI.verifyElementText(findTestObject('Mail/div_Your e-mails been sent'), "Your e-mail's been sent!", FailureHandling.CONTINUE_ON_FAILURE)) {
	WebUI.takeScreenshot("C:/Users/miguel.negrillo/Katalon Studio/Capturas_SeleniumTests/mail.png")
	//WebUI.takeScreenshot("/home/ubuntu/workspace_katalon/Capturas_SeleniumTests/mail.png")
}

WebUI.closeBrowser()

