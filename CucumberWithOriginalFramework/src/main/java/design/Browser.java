package design;

public interface Browser {

	public void launchBrowser(String browser,String url);
	
	public void getCurrentBrowserTitle();
	
	public void closeBrowser();
}
