package pages

import components.Footer
import components.Header
import data.Strings
import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*

@Composable
fun VolunteerPage() {
    Header()
    Div(attrs = { id("container") }) {
        Div(attrs = { id("content") }) {
            Div(attrs = { classes(
                "section", "sectionBorderBottom", "backgroundGame5", "backgroundImageCenter", "alignCenter",
                "justifySpaceAround",
            ) }) {
                Div(attrs = { classes("sectionColumnMain", "tintDark", "shadow") }) {
                    H2 {
                        Text(Strings.volunteer_one_title)
                    }
                    P {
                        Text(Strings.volunteer_one_description)
                    }
                    Div(
                        attrs = { classes("flexAlignCenter") }
                    ) {
                        Button(attrs = { classes("navButton") }) {
                            A(href = "volunteer-form") {
                                Text(Strings.volunteer_one_action)
                            }
                        }
                    }
                }
                Div(attrs = { classes("sectionColumnSub") }) {
                }
            }
            Div(attrs = { classes(
                "section", "sectionBorderBottom", "backgroundGame6", "backgroundImageLeft", "alignCenter",
                "justifySpaceAround", "sectionAlignEnd"
            ) }) {
                Div(attrs = { classes("sectionColumnMain", "tintDark", "shadow") }) {
                    H2 {
                        Text(Strings.volunteer_two_title)
                    }
                    P {
                        Text(Strings.volunteer_two_description)
                    }
                }
                Div(attrs = { classes("sectionColumnSub") }) { }
            }
            Div(attrs = { classes(
                "section", "sectionBorderBottom", "backgroundGame7", "backgroundImageRight", "alignCenter",
                "justifySpaceAround"
            ) }) {
                Div(attrs = { classes("sectionColumnMain", "tintDark", "shadow") }) {
                    H2 {
                        Text(Strings.volunteer_three_title)
                    }
                    P {
                        Text(Strings.volunteer_three_description)
                    }
                    Div(
                        attrs = { classes("flexAlignCenter") }
                    ) {
                        Button(attrs = { classes("navButton") }) {
                            A(href = "volunteer-form") {
                                Text(Strings.volunteer_three_action)
                            }
                        }
                    }
                }
                Div(attrs = { classes("sectionColumnSub") }) {}
            }
            Div(attrs = { classes(
                "section", "backgroundGame8", "backgroundImageLeft", "alignCenter", "justifySpaceAround",
                "sectionAlignEnd"
            ) }) {
                Div(attrs = { classes("sectionColumnMain", "tintDark", "shadow") }) {
                    H2 {
                        Text(Strings.volunteer_four_title)
                    }
                    P {
                        Text(Strings.volunteer_four_description)
                    }
                }
                Div(attrs = { classes("sectionColumnSub") }) {}
            }
        }
    }
    Footer()
}