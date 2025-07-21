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

import com.kms.katalon.core.testobject.ConditionType
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.setText(findTestObject('Object Repository/PendaftaranProdukDepositoBank/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/PendaftaranProdukDepositoBank/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/PendaftaranProdukDepositoBank/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PendaftaranProdukDepositoBank/Page_ARB Banking System/span_Favorites'))

WebUI.rightClick(findTestObject('Object Repository/PendaftaranProdukDepositoBank/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa'))

WebUI.click(findTestObject('Object Repository/PendaftaranProdukDepositoBank/Page_ARB Banking System/span_Create New Favorite'))

WebUI.setText(findTestObject('Object Repository/PendaftaranProdukDepositoBank/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd'), 
    'DPPM0001')

WebUI.click(findTestObject('Object Repository/PendaftaranProdukDepositoBank/Page_ARB Banking System/span_Run'))

WebUI.click(findTestObject('Object Repository/PendaftaranProdukDepositoBank/Page_ARB Banking System/label_Urut Berdasarkan_xui.UI.Labelw'))

WebUI.setText(findTestObject('Object Repository/PendaftaranProdukDepositoBank/Page_ARB Banking System/input_Kode Produk_xui.UI.Input-INPUTm'), 
    'BNK12')

WebUI.setText(findTestObject('Object Repository/PendaftaranProdukDepositoBank/Page_ARB Banking System/input_Nama Produk_xui.UI.Input-INPUTn'), 
    'KENNETH TEST')

WebUI.setText(findTestObject('Object Repository/PendaftaranProdukDepositoBank/Page_ARB Banking System/input_Saldo Minimum_xui.UI.Input-INPUTo'), 
    '2000000')

WebUI.setText(findTestObject('Object Repository/PendaftaranProdukDepositoBank/Page_ARB Banking System/input_Saldo Maksimum_xui.UI.Input-INPUTp'), 
    '2000000000')

WebUI.click(findTestObject('Object Repository/PendaftaranProdukDepositoBank/Page_ARB Banking System/input_Jangka Waktu Bunga_xui.UI.ComboInput-INPUTv'))

WebUI.click(findTestObject('Object Repository/PendaftaranProdukDepositoBank/Page_ARB Banking System/span_SAMA DENGAN JT POKOK'))

WebUI.click(findTestObject('Object Repository/PendaftaranProdukDepositoBank/Page_ARB Banking System/input_Jangka Waktu Pokok_xui.UI.ComboInput-INPUTu'))

WebUI.click(findTestObject('Object Repository/PendaftaranProdukDepositoBank/Page_ARB Banking System/span_24 Bulan'))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//span[contains(@class,'xui-icon-circleright')]"))

TestObject NominalAkhir = new TestObject("NominalAkhir")
NominalAkhir.addProperty("xpath", ConditionType.EQUALS, "//span[@id='xui.UI.TreeGrid-CELL:b:-c_b']")
WebUI.click(NominalAkhir)

WebUI.delay(1)

def driver = DriverFactory.getWebDriver()
def activeInput = driver.switchTo().activeElement()

activeInput.clear()
activeInput.sendKeys("990000")
activeInput.sendKeys(Keys.TAB)


WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//span[text()='Simpan']"))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_Ya'))

WebUI.click(findTestObject('Object Repository/PersetujuanUbahSaldoTes/Page_ARB Banking System/span_O K'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/img_START_xui.UI.Imagec'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_Sign Out'))

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/span_Yes'))

WebUI.closeBrowser()

