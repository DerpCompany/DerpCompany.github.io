package pages

import components.Footer
import components.Header
import data.Strings
import androidx.compose.runtime.Composable
import data.Ids
import org.jetbrains.compose.web.dom.*
import style.StyleCSS
import org.jetbrains.compose.web.css.Style

@Composable
fun SustainabilityPage() {
    Style(StyleCSS)
    Header()
    Div(attrs = { id(Ids.container) }) {
        Div(attrs = { id(Ids.content) }) {
            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.BorderBottom, StyleCSS.ImageTombRaider, StyleCSS.BackgroundImageCenter, StyleCSS.AlignCenter,
                StyleCSS.JustifyCenter,
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnMain, StyleCSS.TintDark, StyleCSS.Shadow) }) {
                    H2 {
                        Text(Strings.sustainability_one_title)
                    }
                    P {
                        Text(Strings.sustainability_one_description)
                    }
                }
                Div(attrs = { classes(StyleCSS.SectionColumnSub) }) {
                }
            }
            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.BorderBottom, StyleCSS.AlignCenter, StyleCSS.JustifyCenter, StyleCSS.SectionAlignEnd,
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnHalf, StyleCSS.TintDark, StyleCSS.Shadow) }) {
                    H2 {
                        Text(Strings.sustainability_two_title)
                    }
                    P {
                        Text(Strings.sustainability_two_description)
                    }
                }
                Div(attrs = { classes(StyleCSS.SectionColumnHalf) }) {
                }
            }
            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.AlignCenter, StyleCSS.JustifyCenter,
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnMain, StyleCSS.TintDark, StyleCSS.Shadow) }) {
                    H2 {
                        Text(Strings.sustainability_three_title)
                    }
                    P {
                        Text(Strings.sustainability_three_description)
                    }
                }
                Div(attrs = { classes(StyleCSS.SectionColumnSub) }) {
                    Button(attrs = {
                        classes(StyleCSS.NavigationButton)
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