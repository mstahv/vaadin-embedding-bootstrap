package org.vaadin.example;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.RouterLayout;

/**
 * This MainLayout implements a main layout that mimics
 * the pricing example by Bootstrap. Instead of the content
 * part, a Vaadin view defined in MainView class is shown, but
 * otherwise (header/navigation, footer, typogrophy) the layout
 * is like in: https://getbootstrap.com/docs/5.1/examples/pricing/
 *
 * <p>The header and footer has been split into Lit templates,
 * where also most of the css is defined. This is to minimize
 * potential css collisions with the CSS brought in by both
 * Lumo and Bootstrap CSS.</p>
 */
@CssImport("./styles/shared-styles.css")
public class MainLayout extends Div implements RouterLayout {

    private final WebsiteHeader header = new WebsiteHeader();
    private final Main main = new Main();
    private final WebsiteFooter footer = new WebsiteFooter();

    public MainLayout() {
        // These are class names from the Bootstrap template
        setClassName("container py-3");
        add(header, main, footer);
    }

    @Override
    public void showRouterLayoutContent(HasElement content) {
        // instead of the default impl, add to main
        main.getElement().appendChild(content.getElement());
    }
}
