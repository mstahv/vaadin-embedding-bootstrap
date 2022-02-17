package org.vaadin.example;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.littemplate.LitTemplate;

@Tag("website-footer")
@JsModule("./views/website-footer.ts")
@NpmPackage(value = "bootstrap", version = "5")
public class WebsiteFooter extends LitTemplate {

    /**
     * Creates the hello world template.
     */
    public WebsiteFooter() {
        getElement().getStyle().set("width", "100%");
    }
}