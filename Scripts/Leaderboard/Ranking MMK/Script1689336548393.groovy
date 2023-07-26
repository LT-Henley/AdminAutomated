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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Page_Dashboard/span_Ranking'))

WebUI.mouseOver(findTestObject('Leaderboard/Page_Dashboard/span_Ranking'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard Ranking/span_MMK'))

WebUI.mouseOver(findTestObject('Leaderboard/Leaderboard Ranking/span_MMK'))

WebUI.click(findTestObject('Leaderboard/Leaderboard Ranking/span_MMK'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard Ranking/h3_Leaderboard List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard Ranking/select_May 2021'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard Ranking/button_Search'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard Ranking/h3_Leaderboard List'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard Ranking/select_May 2021'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard Ranking/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard Ranking/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard Ranking/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard Ranking/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard Ranking/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard Ranking/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard Ranking/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard Ranking/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard Ranking/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard Ranking/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard Ranking/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard Ranking/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard Ranking/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard Ranking/th_Rank'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard Ranking/th_Username'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard Ranking/th_Amount'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard Ranking/th_Phone Number'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard Ranking/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard Ranking/table_RankUsername'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard Ranking/th_Rank'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard Ranking/th_Username'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard Ranking/th_Amount'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard Ranking/th_Phone Number'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard Ranking/th_Action'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard Ranking/table_RankUsername'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard Ranking/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Leaderboard/Leaderboard Ranking/a_Next'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard Ranking/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Leaderboard/Leaderboard Ranking/a_Next'))

