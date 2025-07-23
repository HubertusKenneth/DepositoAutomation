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

WebUI.setText(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (4)'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (4)'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (4)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/span_Favorites (4)'))

WebUI.rightClick(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa (4)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/span_Create New Favorite (4)'))

WebUI.setText(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd (4)'), 
    'DPMA0001')

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/span_Run (4)'))

WebUI.setText(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Nama Nasabah_xui.UI.Input-INPUTs (4)'), 
    'HUBERTUS')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Nama Nasabah_xui.UI.Input-INPUTs (4)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/span_HUBERTUS KENNETH (4)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/label_Text Area_xui.UI.Labelcf (4)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Jenis Produk_xui.UI.ComboInput-INPUTo (4)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/span_PCA - KEN TEST'))

WebUI.setText(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Nomor Bilyet Tercetak_xui.UI.Input-INPUTab (4)'), 
    '888888888')

WebUI.setText(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Nominal_xui.UI.Input-INPUTac (4)'), 
    '300000000')

WebUI.setText(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Bunga Efektif_xui.UI.Input-INPUTaf (1)'), 
    '9')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Bunga Efektif_xui.UI.Input-INPUTaf (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Cara Pengkreditan Bunga_xui.UI.ComboI_8ac0a3 (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/span_3 - KREDIT REKENING (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Cara Pengkreditan Pokok_xui.UI.ComboI_bf70e4 (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/span_3 - KREDIT KE REKENING LAIN (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_Tgl Mulai Berlaku Produk_xui.UI.Combo_e1b7d7 (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/p_31'))

WebUI.setText(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_No. Rek Kredit Bunga_xui.UI.ComboInpu_dcd38f (1)'), 
    '370100059496')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_No. Rek Kredit Bunga_xui.UI.ComboInpu_dcd38f (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_No. Rek Kredit Pokok_xui.UI.ComboInpu_e69651 (1)'), 
    '370100059651')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/input_No. Rek Kredit Pokok_xui.UI.ComboInpu_e69651 (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/label_Text Area_xui.UI.Labelcf (4)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/span_Simpan (3)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/span_Ya (3)'))

WebUI.click(findTestObject('Object Repository/PembukaanDepositoPerorangan/Page_ARB Banking System/span_O K_1'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/img_START_xui.UI.Imagec (4)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/span_Sign Out (4)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekening/Page_ARB Banking System/span_Yes (4)'))

WebUI.closeBrowser()

