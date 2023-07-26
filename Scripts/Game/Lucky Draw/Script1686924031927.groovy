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

WebUI.callTestCase(findTestCase('Login Admin'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Page_Dashboard/span_Game'))

WebUI.mouseOver(findTestObject('Game/Page_Dashboard/span_Game'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Page_Dashboard/span_Lucky Draw'))

WebUI.mouseOver(findTestObject('Game/Page_Dashboard/span_Lucky Draw'))

WebUI.click(findTestObject('Game/Page_Dashboard/span_Lucky Draw'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Lucky Draw/h3_Luckydraw Levels'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Lucky Draw/button_Add New Level'))

WebUI.verifyElementVisible(findTestObject('Game/Lucky Draw/h3_Luckydraw Levels'))

WebUI.verifyElementVisible(findTestObject('Game/Lucky Draw/button_Add New Level'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Lucky Draw/th_Level'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Lucky Draw/th_Threshold'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Lucky Draw/th_Total Rewards'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Lucky Draw/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Lucky Draw/div_Level'))

WebUI.verifyElementVisible(findTestObject('Game/Lucky Draw/th_Level'))

WebUI.verifyElementVisible(findTestObject('Game/Lucky Draw/th_Threshold'))

WebUI.verifyElementVisible(findTestObject('Game/Lucky Draw/th_Total Rewards'))

WebUI.verifyElementVisible(findTestObject('Game/Lucky Draw/th_Action'))

WebUI.verifyElementVisible(findTestObject('Game/Lucky Draw/div_Level'))

