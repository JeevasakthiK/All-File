package org.fbLog;

import org.base.BaseClass;

public class Log_value extends BaseClass {

	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		maxi();
		fbLogin f = new fbLogin();
		value(f.getEmail(),"jeevasakthi@2404");
		value(f.getPwd(), "1223456");
		click(f.getLogBtn());
	}

}
