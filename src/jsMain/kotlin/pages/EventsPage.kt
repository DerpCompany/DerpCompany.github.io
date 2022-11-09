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
fun EventsPage() {
    Style(StyleCSS)
    Header()
    Div(attrs = { id(Ids.container) }) {
        Div(attrs = { id(Ids.content) }) {
            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.BorderBottom, StyleCSS.ImageSeasonalEvents1, StyleCSS.BackgroundImageRight, StyleCSS.AlignCenter,
                StyleCSS.JustifySpaceAround,
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnHalf, StyleCSS.TintDark, StyleCSS.Shadow) }) {
                    H2 {
                        Text(Strings.events_one_title)
                    }
                    P {
                        Text(Strings.events_one_description)
                    }
                }
                Div(attrs = { classes(StyleCSS.SectionColumnHalf) }) {
                }
            }
            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.BorderBottom, StyleCSS.ImageHalo, StyleCSS.BackgroundImageRight, StyleCSS.AlignCenter,
                StyleCSS.JustifySpaceAround,
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnHalf, StyleCSS.TintDark, StyleCSS.Shadow) }) {
                    H2 {
                        Text(Strings.events_two_title)
                    }
                    P {
                        Text(Strings.events_two_description)
                    }
                }
                Div(attrs = { classes(StyleCSS.SectionColumnHalf) }) {
                }
            }
            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.BorderBottom, StyleCSS.ImagePartyAnimals, StyleCSS.BackgroundImageLeft, StyleCSS.AlignCenter,
                StyleCSS.JustifySpaceAround, StyleCSS.SectionAlignEnd,
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnHalf, StyleCSS.TintDark, StyleCSS.Shadow) }) {
                    H2 {
                        Text(Strings.events_three_title)
                    }
                    P {
                        Text(Strings.events_three_description)
                    }
                }
                Div(attrs = { classes(StyleCSS.SectionColumnHalf) }) {
                }
            }
            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.BorderBottom, StyleCSS.ImageDeadByDeadlight, StyleCSS.BackgroundImageRight, StyleCSS.AlignCenter,
                StyleCSS.JustifySpaceAround,
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnHalf, StyleCSS.TintDark, StyleCSS.Shadow) }) {
                    H2 {
                        Text(Strings.events_four_title)
                    }
                    P {
                        Text(Strings.events_four_description)
                    }
                }
                Div(attrs = { classes(StyleCSS.SectionColumnHalf) }) {
                }
            }
            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.BorderBottom, StyleCSS.ImageDerpmas, StyleCSS.BackgroundImageLeft, StyleCSS.AlignCenter,
                StyleCSS.JustifySpaceAround, StyleCSS.SectionAlignEnd
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnHalf, StyleCSS.TintDark, StyleCSS.Shadow) }) {
                    H2 {
                        Text(Strings.events_five_title)
                    }
                    P {
                        Text(Strings.events_five_description)
                    }
                }
                Div(attrs = { classes(StyleCSS.SectionColumnHalf) }) {
                }
            }
        }
    }
    Footer()
}