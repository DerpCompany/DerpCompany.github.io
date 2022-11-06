package pages

import components.Footer
import components.Header
import data.Strings
import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*

@Composable
fun SustainabilityPage() {
    Header()
    Div(attrs = { id("container") }) {
        Div(attrs = { id("content") }) {
            Div(attrs = { classes(
                "section", "sectionBorderBottom", "backgroundSustainability", "backgroundImageCenter", "alignCenter",
                "justifyCenter",
            ) }) {
                Div(attrs = { classes("sectionColumnMain", "tintDark", "shadow") }) {
                    H2 {
                        Text(Strings.sustainability_one_title)
                    }
                    P {
                        Text(Strings.sustainability_one_description)
                    }
                }
                Div(attrs = { classes("sectionColumnSub") }) {
                }
            }
            Div(attrs = { classes(
                "section", "sectionBorderBottom", "alignCenter", "justifyCenter", "sectionAlignEnd",
            ) }) {
                Div(attrs = { classes("sectionColumnHalf", "tintDark", "shadow") }) {
                    H2 {
                        Text(Strings.sustainability_two_title)
                    }
                    P {
                        Text(Strings.sustainability_two_description)
                    }
                }
                Div(attrs = { classes("sectionColumnHalf") }) {
                }
            }
            Div(attrs = { classes(
                "section", "alignCenter", "justifyCenter",
            ) }) {
                Div(attrs = { classes("sectionColumnMain", "tintDark", "shadow") }) {
                    H2 {
                        Text(Strings.sustainability_three_title)
                    }
                    P {
                        Text(Strings.sustainability_three_description)
                    }
                }
                Div(attrs = { classes("sectionColumnSub") }) {
                    Button(attrs = {
                        classes("navButton")
                        attr("target", "_blank")
                        attr("rel", "noopener noreferrer")
                    }) {
                        A(href = "https://derpcompany.teemill.com/") {
                            Text(Strings.sustainability_three_action)
                        }
                    }
                }
            }
        }
    }
    Footer()
}