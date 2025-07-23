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

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.setText(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (5)'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (5)'))

WebUI.setEncryptedText(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (5)'), 
    'J7R4ejOak4Y=')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (5)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/div_1. Copy URL berikut dan paste di Tab Br_6170e0 (2)'))

WebUI.newTab('')

WebUI.switchToWindowTitle('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.switchToWindowTitle('ARB+ Banking System')

WebUI.setText(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (5)'), 
    'HUBERTUS')

WebUI.setEncryptedText(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (5)'), 
    'J7R4ejOak4Y=')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (5)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/span_O K (5)'))

WebUI.setEncryptedText(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (5)'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (5)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/span_O K_1 (5)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/span_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (5)'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (5)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/span_Favorites (5)'))

WebUI.rightClick(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/div_TEST EOD GL_xui.UI.Stacks-PANELab'))

WebUI.rightClick(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa (5)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/span_Create New Favorite (5)'))

WebUI.setText(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd (5)'), 
    'DPMA0001')

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/span_Run (5)'))

WebUI.setText(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Nama Nasabah_xui.UI.Input-INPUTs (5)'), 
    'HUBERTUS')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Nama Nasabah_xui.UI.Input-INPUTs (5)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/span_HUBERTUS KENNETH (5)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/label_Text Area_xui.UI.Labelcf (5)'))

WebUI.doubleClick(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Jenis Produk_xui.UI.ComboInput-INPUTo (5)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/span_PCA - KEN TEST (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Tgl Mulai Berlaku Produk_xui.UI.Combo_e1b7d7 (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/td_1 (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Tgl Mulai Berlaku Produk_xui.UI.Combo_e1b7d7 (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/p_31'))

