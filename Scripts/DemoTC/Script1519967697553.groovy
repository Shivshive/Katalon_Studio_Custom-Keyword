import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://127.0.0.1:5500/Interface/KeywordTest.html')

WebUI.maximizeWindow()

CustomKeywords.'org.space.com.ClickIf.clickIfPresent'(findTestObject('Radio_Buttons/Page_Hello world/input_r1'))

CustomKeywords.'org.space.com.ClickIf.enterTextIfPresent'(findTestObject('InputBox/InputBox_radio_1'), 'Radio 1 Clicked.')

CustomKeywords.'org.space.com.ClickIf.clickIfPresent'(findTestObject('Radio_Buttons/Page_Hello world/input_r2'))

CustomKeywords.'org.space.com.ClickIf.enterTextIfPresent'(findTestObject('InputBox/InputBox_radio_2'), 'Radio 2 Clicked.')

CustomKeywords.'org.space.com.ClickIf.clickIfPresent'(findTestObject('Radio_Buttons/Page_Hello world/input_r3'))

CustomKeywords.'org.space.com.ClickIf.enterTextIfPresent'(findTestObject('InputBox/InputBox_radio_3'), 'Radio 3 is clicked.')

CustomKeywords.'org.space.com.ClickIf.clickIfPresent'(findTestObject('Radio_Buttons/Page_Hello world/input_r4'))

CustomKeywords.'org.space.com.ClickIf.enterTextIfPresent'(findTestObject('InputBox/InputBox_radio_4'), 'Radio 4 is clicked.')

CustomKeywords.'org.space.com.ClickIf.clickIfPresent'(findTestObject('Radio_Buttons/Page_Hello world/input_r5'))

CustomKeywords.'org.space.com.ClickIf.enterTextIfPresent'(findTestObject('InputBox/InputBox_radio_5'), 'Radio 5 is clicked.')

CustomKeywords.'org.space.com.ClickIf.clickIfPresent'(findTestObject('Radio_Buttons/Page_Hello world/input_r6'))

CustomKeywords.'org.space.com.ClickIf.enterTextIfPresent'(findTestObject('InputBox/InputBox_radio_6'), 'Radio 6 is clicked.')

CustomKeywords.'org.space.com.ClickIf.clickIfPresent'(findTestObject('Radio_Buttons/Page_Hello world/input_r7'))

CustomKeywords.'org.space.com.ClickIf.enterTextIfPresent'(findTestObject('InputBox/InputBox_radio_7'), 'Radio 7 is clicked')

CustomKeywords.'org.space.com.ClickIf.clickIfPresent'(findTestObject('Radio_Buttons/Page_Hello world/input_r8'))

CustomKeywords.'org.space.com.ClickIf.enterTextIfPresent'(findTestObject('InputBox/InputBox_radio_8'), 'Radio 8 is clicked.')

CustomKeywords.'org.space.com.ClickIf.clickIfPresent'(findTestObject('Radio_Buttons/Page_Hello world/input_r9'))

CustomKeywords.'org.space.com.ClickIf.enterTextIfPresent'(findTestObject('InputBox/InputBox_radio_9'), 'Radio 9 is clicked.')

CustomKeywords.'org.space.com.ClickIf.clickIfPresent'(findTestObject('Radio_Buttons/Page_Hello world/input_r10'))

CustomKeywords.'org.space.com.ClickIf.enterTextIfPresent'(findTestObject('InputBox/InputBox_radio_10'), 'Radio 10 is clicked.')

//WebUI.delay(10)
WebUI.closeBrowser()

