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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

//WebUI.click(findTestObject('Sidebar/span_SideBarToggle'))
//
//WebUI.click(findTestObject('Sidebar/a_Logbook'))
WebUI.click(findTestObject('Logbook/button_Tambah Logbook'))

WebUI.setText(findTestObject('FormTambahLogBook/input_Tanggal'), '07202025')

WebUI.click(findTestObject('FormTambahLogBook/input_JamMulai'))

WebUI.click(findTestObject('FormTambahLogBook/li_JamMulai'))

WebUI.click(findTestObject('FormTambahLogBook/input_JamSelesai'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FormTambahLogBook/li_JamSelesai'))

WebUI.selectOptionByIndex(findTestObject('FormTambahLogBook/select_ModeKerja'), 1)

WebUI.setText(findTestObject('FormTambahLogBook/input_Project'), 'Project A')

WebUI.setText(findTestObject('FormTambahLogBook/input_NamaTim'), 'Tim B')

WebUI.setText(findTestObject('FormTambahLogBook/input_UseCase'), 'Use Case C')

WebUI.selectOptionByIndex(findTestObject('FormTambahLogBook/select_Kegiatan'), 1)

WebUI.setText(findTestObject('FormTambahLogBook/input_Hasil'), 'Sangat Baik')

WebUI.setText(findTestObject('FormTambahLogBook/input_Capaian'), '100')

WebUI.selectOptionByIndex(findTestObject('FormTambahLogBook/select_NextStep'), 1)

WebUI.setText(findTestObject('FormTambahLogBook/input_Path'), '//FILEPATH//Sample.pdf')

WebUI.setText(findTestObject('FormTambahLogBook/textarea_DetailPekerjaan'), 'Detail Pekerjaan')

WebUI.selectOptionByIndex(findTestObject('FormTambahLogBook/select_WaktuKerja'), 1)

WebUI.click(findTestObject('FormTambahLogBook/button_Submit'))

WebUI.click(findTestObject('FormPengajuanCuti/button_OKModal'))

