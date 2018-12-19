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

WebUI.navigateToUrl('https://the-internet.herokuapp.com/dynamic_controls')

if(WebUI.verifyElementNotChecked(findTestObject('Dynamic Controls/input'), 30, FailureHandling.CONTINUE_ON_FAILURE)) {
	WebUI.click(findTestObject('Dynamic Controls/input'))
}

WebUI.click(findTestObject('Dynamic Controls/button_Remove'))

WebUI.click(findTestObject('Dynamic Controls/button_Add'))


if(WebUI.verifyElementPresent(findTestObject('Dynamic Controls/input_A checkbox_checkbox'),
	30)) {
	if(!WebUI.verifyElementNotChecked(findTestObject('Dynamic Controls/input_A checkbox_checkbox'), 30, FailureHandling.CONTINUE_ON_FAILURE)) {
		WebUI.click(findTestObject('Dynamic Controls/input_A checkbox_checkbox'))
	}
}


WebUI.click(findTestObject('Dynamic Controls/input_A checkbox_checkbox'))



WebUI.click(findTestObject('Dynamic Controls/form_Enable'))

if(WebUI.verifyElementText(findTestObject('Dynamic Controls/button_Enable'), "Enable", FailureHandling.CONTINUE_ON_FAILURE)) {
	WebUI.click(findTestObject('Dynamic Controls/button_Enable'))
	WebUI.waitForElementVisible(findTestObject('Object Repository/Dynamic Controls/Mensaje disponible'), 30)
	WebUI.setText(findTestObject('Object Repository/Dynamic Controls/input_1'), '¡Ya está disponible!')
}

//WebUI.takeScreenshot("C:/Users/miguel.negrillo/Katalon Studio/Capturas_SeleniumTests/dynamic_controls.png")
WebUI.takeScreenshot("/home/ubuntu/workspace_katalon/Capturas_SeleniumTests/dynamic_controls.png")

WebUI.closeBrowser()

