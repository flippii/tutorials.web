
package mypackage.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class HelloGwt implements EntryPoint {

	public void onModuleLoad() {
		Header header = new Header("Hello");
		header.setStyleName("headerpane");
		Label label = new Label("Hello GWT !!!");
		label.setStyleName("label");
		Button button = new Button("Say something");
		button.addClickListener(new ClickListener() {
			public void onClick(Widget sender) {
				Window.alert("Hello, again");
			}
		});

		RootPanel.get().add(header);
		RootPanel.get().add(label);
		RootPanel.get().add(button);
	}
}
