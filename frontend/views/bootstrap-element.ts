import {LitElement, html, css, CSSResultGroup} from 'lit';
import bootstrap from 'bootstrap/dist/css/bootstrap.min.css';

/*
 * A super class for "Bootstrap elements". Basically only
 * imports the Bootstrap css into shadow of elements extending
 * from this.
 */
export class BootstrapElement extends LitElement {
  static styles = [
    bootstrap,
    css`
      /* Use serif font that applies only inside bootstrap templates to show shadow dom "shields" from style leaks */
      h1,h2,h3,h4,h5 {
        font-family: "Times New Roman", Times, serif;
      }
  `];
}