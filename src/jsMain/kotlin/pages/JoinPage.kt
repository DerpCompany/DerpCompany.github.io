package pages

import components.Footer
import components.Header
import androidx.compose.runtime.Composable
import data.Ids
import org.jetbrains.compose.web.dom.*
import style.StyleCSS
import org.jetbrains.compose.web.css.Style

@Composable
fun JoinPage() {
    Style(StyleCSS)
    Header()
    Div(attrs = { id(Ids.container) }) {
        Div(attrs = { id(Ids.content) }) {
            Div(attrs = { classes(
                StyleCSS.ImageJoin, StyleCSS.BackgroundImageCenter, StyleCSS.TintDark
            ) }) {
                Iframe(attrs = {
                    attr("src", "https://docs.google.com/forms/d/e/1FAIpQLScChtgICQuQ8b2aS9F-jo_XSNprxp2KNscf6lrkviMQjGKNBQ/viewform?embedded=true")
                    attr("width", "100%")
                    attr("height", "3000")
                    attr("frameborder", "0")
                    attr("marginheight", "0")
                    attr("marginwidth", "0")
                })
            }
        }
    }
    Footer()
}