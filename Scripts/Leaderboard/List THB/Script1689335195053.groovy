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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Page_Dashboard/span_leaderboard'))

WebUI.mouseOver(findTestObject('Leaderboard/Page_Dashboard/span_leaderboard'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Page_Dashboard/span_List'))

WebUI.mouseOver(findTestObject('Leaderboard/Page_Dashboard/span_List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Page_Dashboard/span_THB'))

WebUI.mouseOver(findTestObject('Leaderboard/Page_Dashboard/span_THB'))

WebUI.click(findTestObject('Leaderboard/Page_Dashboard/span_THB'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/h3_Leaderboard Management'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/button_Add'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/h3_Leaderboard Management'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/button_Add'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/th_Name EN'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/th_Name BM'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/th_Name CN'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/th_Name TH'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/th_Description'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/th_Banner ImageEN'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/th_Banner ImageBM'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/th_Banner ImageCN'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/th_Banner ImageTH'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/th_Start Datetime'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/th_End Datetime'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/th_Status'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/table_Name ENName BMName CNName THDescriptionBanner ImageENBanner ImageBMBanner ImageCNBanner ImageTHStart DatetimeEnd DatetimeStatusAction'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/th_Name EN'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/th_Name BM'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/th_Name CN'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/th_Name TH'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/th_Description'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/th_Banner ImageEN'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/th_Banner ImageBM'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/th_Banner ImageCN'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/th_Banner ImageTH'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/th_Start Datetime'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/th_End Datetime'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/th_Status'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/th_Action'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/table_Name ENName BMName CNName THDescriptionBanner ImageENBanner ImageBMBanner ImageCNBanner ImageTHStart DatetimeEnd DatetimeStatusAction'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard List/li_Next'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard List/li_Next'))

