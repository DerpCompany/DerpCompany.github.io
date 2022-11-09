package pages

import components.Footer
import components.Header
import data.Strings
import androidx.compose.runtime.Composable
import data.Ids
import org.jetbrains.compose.web.dom.*
import style.StyleCSS

@Composable
fun VolunteerPage() {
    org.jetbrains.compose.web.css.Style(StyleCSS)
    Header()
    Div(attrs = { id(Ids.container) }) {
        Div(attrs = { id(Ids.content) }) {
            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.BorderBottom, StyleCSS.ImageBloodHunt, StyleCSS.BackgroundImageCenter, StyleCSS.AlignCenter,
                StyleCSS.JustifySpaceAround,
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnMain, StyleCSS.tintDark, StyleCSS.shadow) }) {
                    H2 {
                        Text(Strings.volunteer_one_title)
                    }
                    P {
                        Text(Strings.volunteer_one_description)
                    }
                    Div(
                        attrs = { classes(StyleCSS.FlexAlignCenter) }
                    ) {
                        Button(attrs = { classes(StyleCSS.NavigationButton) }) {
                            A(href = "volunteer-form") {
                                Text(Strings.volunteer_one_action)
                            }
                        }
                    }
                }
                Div(attrs = { classes(StyleCSS.SectionColumnSub) }) {
                }
            }
            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.BorderBottom, StyleCSS.ImageReadyOrNot, StyleCSS.BackgroundImageLeft, StyleCSS.AlignCenter,
                StyleCSS.JustifySpaceAround, StyleCSS.SectionAlignEnd
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnMain, StyleCSS.tintDark, StyleCSS.shadow) }) {
                    H2 {
                        Text(Strings.volunteer_two_title)
                    }
                    P {
                        Text(Strings.volunteer_two_description)
                    }
                }
                Div(attrs = { classes(StyleCSS.SectionColumnSub) }) { }
            }
            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.BorderBottom, StyleCSS.ImageOverwatchHeroes2, StyleCSS.BackgroundImageRight, StyleCSS.AlignCenter,
                StyleCSS.JustifySpaceAround
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnMain, StyleCSS.tintDark, StyleCSS.shadow) }) {
                    H2 {
                        Text(Strings.volunteer_three_title)
                    }
                    P {
                        Text(Strings.volunteer_three_description)
                    }
                    Div(
                        attrs = { classes(StyleCSS.FlexAlignCenter) }
                    ) {
                        Button(attrs = { classes(StyleCSS.NavigationButton) }) {
                            A(href = "volunteer-form") {
                                Text(Strings.volunteer_three_action)
                            }
                        }
                    }
                }
                Div(attrs = { classes(StyleCSS.SectionColumnSub) }) {}
            }
            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.ImageNewWorld, StyleCSS.BackgroundImageLeft, StyleCSS.AlignCenter, StyleCSS.JustifySpaceAround,
                StyleCSS.SectionAlignEnd
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnMain, StyleCSS.tintDark, StyleCSS.shadow) }) {
                    H2 {
                        Text(Strings.volunteer_four_title)
                    }
                    P {
                        Text(Strings.volunteer_four_description)
                    }
                }
                Div(attrs = { classes(StyleCSS.SectionColumnSub) }) {}
            }
        }
    }
    Footer()
}