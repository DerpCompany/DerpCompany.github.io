package components

import data.Strings
import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*

@Composable
fun Header() {
    Header {
        Div(attrs = { classes("headerColumnWrapContent") }) {
            A(href = "/") {
                Img("/public/img/logo-white.png")
            }
        }
        Div(attrs = { classes("headerColumnMenu") }) {
            MenuButton("/", Strings.home)
            MenuButton("/patreon", Strings.patreon)
            MenuButton("/volunteer", Strings.volunteer)
            MenuButton("https://derpcompany.teemill.com/", Strings.shop, true)
        }
    }
}

@Composable
private fun MenuButton(
    href: String,
    text: String,
    newTab: Boolean = false,
) {
    Button(attrs = { classes("pagesLink") }) {
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