package com.vogella.vaadin.com.vogella.vaadin.first;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class MainView extends VerticalLayout implements View { 

	@Override 
      public void enter(ViewChangeEvent event) { 
    	removeAllComponents(); 
        setSizeFull(); 
       
        Button button = new Button("Switch to Details view!"); 
        button.addClickListener( e -> { 
              NavigatorHolder.myHolder.navigateTo("detail"); 

        }); 
        
        addComponent(button);
        
        setComponentAlignment(button, Alignment.MIDDLE_CENTER); 
      } 

} 