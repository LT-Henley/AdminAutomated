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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Page_Dashboard/span_Banner'))

WebUI.mouseOver(findTestObject('Banner/Page_Dashboard/span_Banner'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Page_Dashboard/span_Sequence'))

WebUI.mouseOver(findTestObject('Banner/Page_Dashboard/span_Sequence'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner Sequence/span_MYR'))

WebUI.mouseOver(findTestObject('Banner/Banner Sequence/span_MYR'))

WebUI.click(findTestObject('Banner/Banner Sequence/span_MYR'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner Sequence/h3_Banner Sequence'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner Sequence/select_lkym5tigerhubking1678'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner Sequence/select_enchbmthvtidmy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner Sequence/button_Search'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner Sequence/h3_Banner Sequence'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner Sequence/select_lkym5tigerhubking1678'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner Sequence/select_enchbmthvtidmy'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner Sequence/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner Sequence/h4_To change sequence, drag the game to the section of your choice'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner Sequence/img_section_drag-id-33'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner Sequence/img_section_drag-id-48'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner Sequence/img_section_drag-id-66'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner Sequence/h4_To change sequence, drag the game to the section of your choice'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner Sequence/img_section_drag-id-33'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner Sequence/img_section_drag-id-48'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner Sequence/img_section_drag-id-66'))

