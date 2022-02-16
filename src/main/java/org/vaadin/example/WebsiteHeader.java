package org.vaadin.example;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.littemplate.LitTemplate;

@Tag("website-header")
@JsModule("./views/website-header.ts")
public class WebsiteHeader extends LitTemplate {
}
