package org.space.com

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.codehaus.groovy.tools.shell.completion.KeywordSyntaxCompletor
import org.openqa.selenium.WebElement
import org.stringtemplate.v4.compiler.STParser.primary_return

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class ClickIf {

	@Keyword
	def clickIfPresent(TestObject tObj){
		try{
			if(WebUiCommonHelper.findWebElement(tObj, 1)){
				println("Web Element is found.");
				WebUI.click(tObj);
			}
		}
		catch(Exception){
			println ("Web Element not found.");
		}
	}
	
	@Keyword
	def enterTextIfPresent(TestObject tObj, String value){
		try{
			if(WebUiCommonHelper.findWebElement(tObj, 1)){
				println("Web Element is found.");
				WebUI.setText(tObj,value);
			}
		}
		catch(Exception){
			println ("Web Element not found.");
		}
	}
}
