package pages

import components.Footer
import components.Header
import data.Strings
import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*

@Composable
fun EventsPage() {
    Header()
    Div(attrs = { id("container") }) {
        Div(attrs = { id("content") }) {
            Div(attrs = { classes(
                "section", "sectionBorderBottom", "backgroundGameSeasonalEvents", "backgroundImageRight", "alignCenter",
                "justifySpaceAround",
            ) }) {
                Div(attrs = { classes("sectionColumnHalf", "tintDark", "shadow") }) {
                    H2 {
                        Text(Strings.events_one_title)
                    }
                    P {
                        Text(Strings.events_one_description)
                    }
                }
                Div(attrs = { classes("sectionColumnHalf") }) {
                }
            }
            Div(attrs = { classes(
                "section", "sectionBorderBottom", "backgroundGameHalo", "backgroundImageRight", "alignCenter",
                "justifySpaceAround",
            ) }) {
                Div(attrs = { classes("sectionColumnHalf", "tintDark", "shadow") }) {
                    H2 {
                        Text(Strings.events_two_title)
                    }
                    P {
                        Text(Strings.events_two_description)
                    }
                }
                Div(attrs = { classes("sectionColumnHalf") }) {
                }
            }
            Div(attrs = { classes(
                "section", "sectionBorderBottom", "backgroundGamePartyAnimals", "backgroundImageLeft", "alignCenter",
                "justifySpaceAround", "sectionAlignEnd",
            ) }) {
                Div(attrs = { classes("sectionColumnHalf", "tintDark", "shadow") }) {
                    H2 {
                        Text(Strings.events_three_title)
                    }
                    P {
                        Text(Strings.events_three_description)
                    }
                }
                Div(attrs = { classes("sectionColumnHalf") }) {
                }
            }
            Div(attrs = { classes(
                "section", "sectionBorderBottom", "backgroundGameDBD", "backgroundImageRight", "alignCenter",
                "justifySpaceAround",
            ) }) {
                Div(attrs = { classes("sectionColumnHalf", "tintDark", "shadow") }) {
                    H2 {
                        Text(Strings.events_four_title)
                    }
                    P {
                        Text(Strings.events_four_description)
                    }
                }
                Div(attrs = { classes("sectionColumnHalf") }) {
                }
            }
            Div(attrs = { classes(
                "section", "sectionBorderBottom", "backgroundGameDerpmas", "backgroundImageLeft", "alignCenter",
                "justifySpaceAround", "sectionAlignEnd"
            ) }) {
                Div(attrs = { classes("sectionColumnHalf", "tintDark", "shadow") }) {
                    H2 {
                        Text(Strings.events_five_title)
                    }
                    P {
                        Text(Strings.events_five_description)
                    }
                }
                Div(attrs = { classes("sectionColumnHalf") }) {
                }
            }
        }
    }
    Footer()
}