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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Page_Dashboard/span_Product List'))

WebUI.mouseOver(findTestObject('Game/Page_Dashboard/span_Product List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Page_Dashboard/span_MMK'))

WebUI.mouseOver(findTestObject('Game/Page_Dashboard/span_MMK'))

WebUI.click(findTestObject('Game/Page_Dashboard/span_MMK'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/h3_Game List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/h3_Game List'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/th_Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/th_Category'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/th_Description'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/th_Up By'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/th_Down By'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/th_Up At'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/th_Down At'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/th_Up Time'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/th_Down Time'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/th_Status'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/th_Maintenance Scheduled'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/th_Maintenance Schedule From'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/th_Maintenance Schedule To'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/th_Product Languages'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/table_Name'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/th_Name'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/th_Category'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/th_Description'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/th_Up By'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/th_Down By'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/th_Up At'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/th_Down At'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/th_Up Time'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/th_Down Time'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/th_Status'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/th_Maintenance Scheduled'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/th_Maintenance Schedule From'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/th_Maintenance Schedule To'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/th_Product Languages'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/th_Action'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/table_Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Product List/a_Next'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Game/Product List/a_Next'))

