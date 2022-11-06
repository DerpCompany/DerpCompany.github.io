package pages

import components.Footer
import components.Header
import data.Strings
import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*

@Composable
fun PatreonPage() {
    Header()
    Div(attrs = { id("container") }) {
        Div(attrs = { id("content") }) {
            Div(attrs = { classes(
                "section", "sectionBorderBottom", "backgroundGame4", "backgroundImageCenter", "alignCenter",
                "justifySpaceAround",
            ) }) {
                Div(attrs = { classes("sectionColumnMain", "tintDark", "shadow") }) {
                    H2 {
                        Text(Strings.patreon_one_title)
                    }
                    P {
                        Text(Strings.patreon_one_description)
                    }
                }
                Div(attrs = { classes("sectionColumnSub") }) {
                    Button(attrs = { classes("navButton") }) {
                        A(href = "https://www.patreon.com/bePatron?u=71975005") {
                            Text(Strings.patreon_one_action)
                        }
                    }
                }
            }
            Div(attrs = { classes(
                "section", "sectionBorderBottom", "backgroundGame9", "backgroundImageLeft", "alignCenter",
                "justifyCenter", "sectionAlignEnd"
            ) }) {
                Div(attrs = { classes("sectionColumnHalf", "tintDark", "shadow") }) {
                    H2 {
                        Text(Strings.patreon_two_title)
                    }
                    P {
                        Text(Strings.patreon_two_description)
                    }
                }
                Div(attrs = { classes("sectionColumnHalf") }) { }
            }
            Div(attrs = { classes(
                "section", "backgroundGame10", "backgroundImageCenter", "backgroundImageRight", "alignCenter",
                "justifyCenter"
            ) }) {
                Div(attrs = { classes("sectionColumnMain", "tintDark", "shadow") }) {
                    H2 {
                        Text(Strings.patreon_three_title)
                    }
                    P {
                        Text(Strings.patreon_three_description)
                    }
                }
                Div(attrs = { classes("sectionColumnSub") }) { }
            }
        }
    }
    Footer()
}