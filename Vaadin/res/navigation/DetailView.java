package com.vogella.vaadin.com.vogella.vaadin.first;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.VerticalLayout;

public class DetailView extends VerticalLayout implements View {

	private static final long serialVersionUID = 1L;

	@Override
	public void enter(ViewChangeEvent event) {
		removeAllComponents();
		setSizeFull();
		CheckBox checkbox = new CheckBox("I agree."); 
		Button button = new Button("Back to Overview!");
		button.addClickListener(e -> {
			NavigatorHolder.myHolder.navigateTo("");

		});

		addComponent(checkbox);
		addComponent(button);
		setComponentAlignment(checkbox, Alignment.MIDDLE_CENTER);
		setComponentAlignment(button, Alignment.MIDDLE_CENTER);
	}

}