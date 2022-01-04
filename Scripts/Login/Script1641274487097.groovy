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

Mobile.startApplication('D:\\Users\\Maulana Yusuf\\kuliah\\MAGANG\\app.apk', true)

Mobile.tap(findTestObject('Object Repository/Login/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.TextView - Masuk'), 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - examplemail.com'), 'mangaku11@yopmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText'), 'yusuf123', 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.TextView - Lanjutkan'), 10)

Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

