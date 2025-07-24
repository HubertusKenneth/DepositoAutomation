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

WebUI.setText(findTestObject('Object Repository/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (3)'), 'HUEBRTUS')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (3)'), 
    'J7R4ejOak4Y=')

WebUI.sendKeys(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (3)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/font_chromeflagsenable-webrtc-hide-local-ip_6fc727 (2)'))

WebUI.newTab('')

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.newTab('')

WebUI.switchToWindowTitle('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.switchToWindowTitle('ARB+ Banking System')

WebUI.setText(findTestObject('Object Repository/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (3)'), 'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (3)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (3)'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (3)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_Favorites (2)'))

WebUI.rightClick(findTestObject('Object Repository/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa (2)'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_Create New Favorite (2)'))

WebUI.setText(findTestObject('Object Repository/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd (2)'), 'DPMA0001')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_Run (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ARB Banking System/input_Nama Nasabah_xui.UI.Input-INPUTs'), 'HUBERTUS')

WebUI.sendKeys(findTestObject('Object Repository/Page_ARB Banking System/input_Nama Nasabah_xui.UI.Input-INPUTs'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_HUBERTUS KENNETH'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/label_Text Area_xui.UI.Labelcf'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Jenis Produk_xui.UI.ComboInput-INPUTo'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_DA - D.NAS-1 BL'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Cara Pengkreditan Bunga_xui.UI.ComboI_8ac0a3'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_3 - KREDIT REKENING'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Cara Pengkreditan Pokok_xui.UI.ComboI_bf70e4'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_3 - KREDIT KE REKENING LAIN'))

WebUI.setText(findTestObject('Object Repository/Page_ARB Banking System/input_No. Rek Kredit Bunga_xui.UI.ComboInpu_dcd38f'), 
    '370100059496')

WebUI.sendKeys(findTestObject('Object Repository/Page_ARB Banking System/input_No. Rek Kredit Bunga_xui.UI.ComboInpu_dcd38f'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_ARB Banking System/input_No. Rek Kredit Pokok_xui.UI.ComboInpu_e69651'), 
    '370100059496')

WebUI.sendKeys(findTestObject('Object Repository/Page_ARB Banking System/input_No. Rek Kredit Pokok_xui.UI.ComboInpu_e69651'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_Kirim Advis Jatuh Tempo_xui.UI.CheckBoxd'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Metode Advis Jatuh Tempo_xui.UI.Combo_12ca80'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_EMAIL'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_O K (1)'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Metode Advis Jatuh Tempo_xui.UI.Combo_12ca80'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_SURAT'))

WebUI.setText(findTestObject('Object Repository/Page_ARB Banking System/input_Nominal_xui.UI.Input-INPUTac'), '10000')

WebUI.sendKeys(findTestObject('Object Repository/Page_ARB Banking System/input_Nominal_xui.UI.Input-INPUTac'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_O K (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ARB Banking System/input_Nominal_xui.UI.Input-INPUTac'), '1000000')

WebUI.sendKeys(findTestObject('Object Repository/Page_ARB Banking System/input_Nominal_xui.UI.Input-INPUTac'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_ARB Banking System/input_Bunga Efektif_xui.UI.Input-INPUTaf'), '9')

WebUI.sendKeys(findTestObject('Object Repository/Page_ARB Banking System/input_Bunga Efektif_xui.UI.Input-INPUTaf'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Petugas Marketing_xui.UI.ComboInput-INPUTac'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_ADELA'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_Simpan (1)'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_O K (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ARB Banking System/input_Nomor Bilyet Tercetak_xui.UI.Input-INPUTab'), 
    '09876')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_Simpan (1)'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_Ya (2)'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_O K_1 (1)'))

WebUI.closeBrowser()

