
package mypackage.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;

public class Header extends Composite {
	private Label title;

	public Header(String title) {
		this.title = new Label(title);
		initWidget(this.title);
	}

	public void setStyleName(String style) {
		this.title.setStyleName(style);
	}

	public void setTitle(String title) {
		this.title.setText(title);
	}

}
