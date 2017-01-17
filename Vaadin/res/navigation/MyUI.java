package com.vogella.vaadin.com.vogella.vaadin.first;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("mytheme")
public class MyUI extends UI {

	Navigator myNavigator; 

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	
    	 myNavigator = new Navigator(this, this); 
    	 NavigatorHolder.myHolder= myNavigator; 
    	    myNavigator.addView("", new MainView()); 
    	    myNavigator.addView("detail", new DetailView()); 
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
