package components

import data.Strings
import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*
import style.StyleCSS

@Composable
fun Header() {
    Header {
        Div(attrs = { classes(StyleCSS.HeaderColumnWrapContent) }) {
            A(href = "/") {
                Img("/public/img/logo-white.png")
            }
        }
        Div(attrs = { classes(StyleCSS.HeaderColumn) }) {
            HeaderButton("/", Strings.home)
            HeaderButton("/patreon", Strings.patreon)
            HeaderButton("/volunteer", Strings.volunteer)
            HeaderButton("https://derpcompany.teemill.com/", Strings.shop, true)
        }
    }
}

@Composable
private fun HeaderButton(
    href: String,
    text: String,
    newTab: Boolean = false,
) {
    Button(attrs = { classes(StyleCSS.HeaderButton) }) {
        H3 {
            A(
                href = href,
                attrs = {
                    if (newTab) {
                        attr("target", "_blank")
                        attr("rel", "noopener noreferrer")
                    }
                }
            ) {
                Text(text)
            }
        }
    }
}