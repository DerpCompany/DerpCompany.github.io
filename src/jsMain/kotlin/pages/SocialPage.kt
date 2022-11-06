package pages

import components.Footer
import components.Header
import data.Strings
import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*

@Composable
fun SocialPage() {
    Header()
    Div(attrs = { id("container") }) {
        Div(attrs = { id("content") }) {
            Div(attrs = { classes(
                "section", "sectionBorderBottom", "backgroundMoreThanGaming", "backgroundImageCenter", "tintDark", "alignCenter",
                "justifyCenter",
            ) }) {
                Div(attrs = { classes("sectionColumnHalf", "tintDark", "shadow") }) {
                    H2 {
                        Text(Strings.social_one_title)
                    }
                    P {
                        Text(Strings.social_one_description)
                    }
                }
                Div(attrs = { classes("sectionColumnHalf") }) {
                }
            }

            Div(attrs = { classes(
                "section", "sectionBorderBottom", "backgroundFilmClub", "backgroundImageCenter", "tintVeryDark", "alignCenter",
                "justifyCenter",
            ) }) {
                Div(attrs = { classes("sectionColumnHalf", "centerFlex") }) {
                    Img(src = "/public/img/film_club_2021.webp")
                }
                Div(attrs = { classes("sectionColumnHalf") }) {
                    H2 {
                        Text(Strings.social_two_title)
                    }
                    P {
                        Text(Strings.social_two_description)
                    }
                }
            }

            Div(attrs = { classes(
                "section", "sectionBorderBottom", "backgroundAnimeClub", "backgroundImageCenter", "tintDark", "alignCenter",
                "justifyCenter", "sectionAlignEnd"
            ) }) {
                Div(attrs = { classes("sectionColumnHalf", "centerFlex") }) {
                    Img(src = "/public/img/anime_club_2021.webp")
                }
                Div(attrs = { classes("sectionColumnHalf", "tintDark", "shadow") }) {
                    H2 {
                        Text(Strings.social_three_title)
                    }
                    P {
                        Text(Strings.social_three_description)
                    }
                }
            }

            Div(attrs = { classes(
                "section", "sectionBorderBottom", "backgroundBookClub", "backgroundImageCenter", "tintDark", "alignCenter",
                "justifyCenter",
            ) }) {
                Div(attrs = { classes("sectionColumnHalf", "centerFlex") }) {
                    Img(src = "/public/img/book_club_2021.webp")
                }
                Div(attrs = { classes("sectionColumnHalf", "tintDark", "shadow") }) {
                    H2 {
                        Text(Strings.social_four_title)
                    }
                    P {
                        Text(Strings.social_four_description)
                    }
                }
            }

            Div(attrs = { classes(
                "section", "sectionBorderBottom", "backgroundF1Club", "backgroundImageCenter", "tintDark", "alignCenter",
                "justifyCenter",
            ) }) {
                Div(attrs = { classes("sectionColumnHalf", "centerFlex") }) {
                    Img(src = "/public/img/f1_club_2022.webp")
                }
                Div(attrs = { classes("sectionColumnHalf", "tintDark", "shadow") }) {
                    H2 {
                        Text(Strings.social_five_title)
                    }
                    P {
                        Text(Strings.social_five_description)
                    }
                }
            }
        }
    }
    Footer()
}