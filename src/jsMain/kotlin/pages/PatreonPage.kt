package pages

import components.Footer
import components.Header
import data.Strings
import androidx.compose.runtime.Composable
import data.Ids
import org.jetbrains.compose.web.dom.*
import style.StyleCSS

@Composable
fun PatreonPage() {
    org.jetbrains.compose.web.css.Style(StyleCSS)
    Header()
    Div(attrs = { id(Ids.container) }) {
        Div(attrs = { id(Ids.content) }) {
            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.BorderBottom, StyleCSS.ImageDestiny, StyleCSS.BackgroundImageCenter, StyleCSS.AlignCenter,
                StyleCSS.JustifySpaceAround,
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnMain, StyleCSS.tintDark, StyleCSS.shadow) }) {
                    H2 {
                        Text(Strings.patreon_one_title)
                    }
                    P {
                        Text(Strings.patreon_one_description)
                    }
                }
                Div(attrs = { classes(StyleCSS.SectionColumnSub) }) {
                    Button(attrs = { classes(StyleCSS.NavigationButton) }) {
                        A(href = "https://www.patreon.com/bePatron?u=71975005") {
                            Text(Strings.patreon_one_action)
                        }
                    }
                }
            }
            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.BorderBottom, StyleCSS.ImageSeaOfThieves, StyleCSS.BackgroundImageLeft, StyleCSS.AlignCenter,
                StyleCSS.JustifyCenter, StyleCSS.SectionAlignEnd
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnHalf, StyleCSS.tintDark, StyleCSS.shadow) }) {
                    H2 {
                        Text(Strings.patreon_two_title)
                    }
                    P {
                        Text(Strings.patreon_two_description)
                    }
                }
                Div(attrs = { classes(StyleCSS.SectionColumnHalf) }) { }
            }
            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.ImageHowHelping, StyleCSS.BackgroundImageRight, StyleCSS.AlignCenter,
                StyleCSS.JustifyCenter
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnMain, StyleCSS.tintDark, StyleCSS.shadow) }) {
                    H2 {
                        Text(Strings.patreon_three_title)
                    }
                    P {
                        Text(Strings.patreon_three_description)
                    }
                }
                Div(attrs = { classes(StyleCSS.SectionColumnSub) }) { }
            }
        }
    }
    Footer()
}