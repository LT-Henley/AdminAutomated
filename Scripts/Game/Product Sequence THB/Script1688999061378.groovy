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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Page_Dashboard/span_Game'))

WebUI.mouseOver(findTestObject('Game/Page_Dashboard/span_Game'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Page_Dashboard/span_Product Sequence'))

WebUI.mouseOver(findTestObject('Game/Page_Dashboard/span_Product Sequence'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product Sequence/span_THB'))

WebUI.mouseOver(findTestObject('Game/Product Sequence/span_THB'))

WebUI.click(findTestObject('Game/Product Sequence/span_THB'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product Sequence/h3_Product Sequence'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product Sequence/h4_To change sequence, drag the game to the section of your choice'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product Sequence/ul_section_sortable'))

WebUI.verifyElementVisible(findTestObject('Game/Product Sequence/h3_Product Sequence'))

WebUI.verifyElementVisible(findTestObject('Game/Product Sequence/h4_To change sequence, drag the game to the section of your choice'))

WebUI.verifyElementVisible(findTestObject('Game/Product Sequence/ul_section_sortable'))

