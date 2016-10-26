
package mypackage.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class HelloWorld implements EntryPoint {

	public void onModuleLoad() {
		
		Label label = new Label("Hello World !!!");
		label.setSize("100px", "30px");
		label.setStyleName("label");
		RootPanel.get().add(label);
	}

}
