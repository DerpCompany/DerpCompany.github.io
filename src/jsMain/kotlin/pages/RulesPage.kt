package pages

import components.Footer
import components.Header
import androidx.compose.runtime.Composable
import data.Ids
import data.Strings
import org.jetbrains.compose.web.dom.*
import style.StyleCSS
import org.jetbrains.compose.web.css.Style

@Composable
fun RulesPage() {
    Style(StyleCSS)
    Header()
    Div(attrs = { id(Ids.container) }) {
        Div(attrs = { id(Ids.content) }) {
            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.ImageRules, StyleCSS.BackgroundImageCenter, StyleCSS.TintVeryDark
            ) }) {
                Div(attrs = { classes(
                    StyleCSS.SectionColumnFullWidth, StyleCSS.TintDark, StyleCSS.Shadow,
                ) }) {
                    H2 {
                        Text(Strings.rules_title)
                    }
                    P {
                        Text(Strings.rules_description)
                    }
                }
            }
        }
    }
    Footer()
}