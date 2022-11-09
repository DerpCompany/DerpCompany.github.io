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
fun SocialPage() {
    Style(StyleCSS)
    Header()
    Div(attrs = { id(Ids.container) }) {
        Div(attrs = { id(Ids.content) }) {
            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.BorderBottom, StyleCSS.ImageMoreThanGaming, StyleCSS.BackgroundImageCenter, StyleCSS.TintDark, StyleCSS.AlignCenter,
                StyleCSS.JustifyCenter,
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnHalf, StyleCSS.TintDark, StyleCSS.Shadow) }) {
                    H2 {
                        Text(Strings.social_one_title)
                    }
                    P {
                        Text(Strings.social_one_description)
                    }
                }
                Div(attrs = { classes(StyleCSS.SectionColumnHalf) }) {
                }
            }

            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.BorderBottom, StyleCSS.ImageFilmClub, StyleCSS.BackgroundImageCenter, StyleCSS.TintVeryDark, StyleCSS.AlignCenter,
                StyleCSS.JustifyCenter,
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnHalf, StyleCSS.CenterFlex) }) {
                    Img(src = "/public/img/film_club_2021.webp")
                }
                Div(attrs = { classes(StyleCSS.SectionColumnHalf) }) {
                    H2 {
                        Text(Strings.social_two_title)
                    }
                    P {
                        Text(Strings.social_two_description)
                    }
                }
            }

            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.BorderBottom, StyleCSS.ImageAnimeClub, StyleCSS.BackgroundImageCenter, StyleCSS.TintDark, StyleCSS.AlignCenter,
                StyleCSS.JustifyCenter, StyleCSS.SectionAlignEnd
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnHalf, StyleCSS.CenterFlex) }) {
                    Img(src = "/public/img/anime_club_2021.webp")
                }
                Div(attrs = { classes(StyleCSS.SectionColumnHalf, StyleCSS.TintDark, StyleCSS.Shadow) }) {
                    H2 {
                        Text(Strings.social_three_title)
                    }
                    P {
                        Text(Strings.social_three_description)
                    }
                }
            }

            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.BorderBottom, StyleCSS.ImageBookClub, StyleCSS.BackgroundImageCenter, StyleCSS.TintDark, StyleCSS.AlignCenter,
                StyleCSS.JustifyCenter,
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnHalf, StyleCSS.CenterFlex) }) {
                    Img(src = "/public/img/book_club_2021.webp")
                }
                Div(attrs = { classes(StyleCSS.SectionColumnHalf, StyleCSS.TintDark, StyleCSS.Shadow) }) {
                    H2 {
                        Text(Strings.social_four_title)
                    }
                    P {
                        Text(Strings.social_four_description)
                    }
                }
            }

            Div(attrs = { classes(
                StyleCSS.Section, StyleCSS.BorderBottom, StyleCSS.ImageF1Club, StyleCSS.BackgroundImageCenter, StyleCSS.TintDark, StyleCSS.AlignCenter,
                StyleCSS.JustifyCenter,
            ) }) {
                Div(attrs = { classes(StyleCSS.SectionColumnHalf, StyleCSS.CenterFlex) }) {
                    Img(src = "/public/img/f1_club_2022.webp")
                }
                Div(attrs = { classes(StyleCSS.SectionColumnHalf, StyleCSS.TintDark, StyleCSS.Shadow) }) {
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