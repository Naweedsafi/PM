package com.learn.java;

public class Browser {

	private void startIeBrowser() {
		System.out.println("IE is started...");
	}
	private void startChromeBrowser() {
		System.out.println("Chrome is started...");
	}
	//public void startABrowser(String Browsertype) {
		// if user is passing IE run IE methode
		//else run chrome method
		//if(Browsertype.contains("IE"))
			//startIeBrowser();
			//else {
				//startChromeBrowser();
			//}
		public void startABrowser(String Browsertype) {
			if(Browsertype.contains("IE"));
			startIeBrowser();
			
			}
		}
}
			