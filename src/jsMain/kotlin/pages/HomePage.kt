package pages

import components.Footer
import data.GameBanners
import components.Header
import data.Ids
import data.Strings
import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*
import style.StyleCSS

@Composable
fun HomePage() {
    org.jetbrains.compose.web.css.Style(StyleCSS)
    Header()
    Div {
        Div(attrs = {
            id(Ids.backgroundVideoContainer)
        }) {
            Video(attrs = {
                id(Ids.backgroundVideo)
            }) {
                Source(attrs = {
                    attr("src", "/public/video/banner-video.mp4")
                    attr("type", "video/mp4")
                }) { }
            }
            Div(attrs = {
                id(Ids.videoHeaderContainer)
            }) {
                Img(
                    src = "/public/img/logo-splash.webp",
                    attrs = {
                        id(Ids.videoHeader)
                    },
                )
            }
        }
        Div(attrs = { classes(StyleCSS.HeightLarge) }) { }
        Div(attrs = { classes(StyleCSS.SectionTriButton) }) {
            Button(attrs = { classes(StyleCSS.TriButton, StyleCSS.TriButtonBackgroundMain, StyleCSS.TriButtonHighlightMain) }) {
                A(
                    href = "/sustainability",
                    attrs = { classes(StyleCSS.TriButtonHighlightMain) }
                ) {
                    Text(Strings.sustainability)
                }
            }
            Button(attrs = { classes(StyleCSS.TriButton, StyleCSS.TriButtonBackgroundAlternative, StyleCSS.TriButtonHighlightAlternative) }) {
                A(
                    href = "/events",
                    attrs = { classes(StyleCSS.TriButtonHighlightAlternative) }
                ) {
                    Text(Strings.events)
                }
            }
            Button(attrs = { classes(StyleCSS.TriButton, StyleCSS.TriButtonBackgroundMain, StyleCSS.TriButtonHighlightMain) }) {
                A(
                    href = "/social",
                    attrs = { classes(StyleCSS.TriButtonHighlightMain) }
                ) {
                    Text(Strings.social_grups)
                }
            }
        }
        Div(attrs = { classes(StyleCSS.HeightXLarge) }) { }
        Div(attrs = { classes(StyleCSS.MaxWidthContent, StyleCSS.HorizontalPaddingMediun) }) {
            Div {
                H2 {
                    Text(Strings.something_for_everyone)
                }
            }
        }
        Div(attrs = { classes(StyleCSS.GameCarouselHolder) }) {
            Div(attrs = { classes(StyleCSS.GameCarouselInnerHolder) }) {
                repeat(GameBanners.repeat) {
                    GameBanners.assets.forEach {
                        Img(
                            src = "public/img/${it}",
                            attrs = {
                                classes(StyleCSS.GameCarouselItem)
                            }
                        )
                    }
                }
            }
        }
        Div(attrs = { classes(StyleCSS.HeightXXLarge) }) { }
        Div(attrs = { id(Ids.container) }) {
            Div(attrs = { id(Ids.content) }) {
                Div(attrs = { classes(
                    StyleCSS.Section, StyleCSS.ImageVikingDragon, StyleCSS.BackgroundImageCenter, StyleCSS.BorderTop,
                    StyleCSS.BorderBottom, StyleCSS.SectionAlignEnd, StyleCSS.AlignCenter, StyleCSS.JustifySpaceAround
                ) }) {
                    Div(attrs = { classes(StyleCSS.SectionColumnMain, StyleCSS.tintDark, StyleCSS.shadow) }) {
                        H2 {
                            Text(Strings.section_one_title)
                        }
                        P(attrs = { classes(StyleCSS.Bold) }) {
                            Text(Strings.section_one_description)
                        }
                        Div(attrs = { classes(StyleCSS.FlexAlignCenter) }) {
                            Button(attrs = { classes(StyleCSS.NavigationButton) }) {
                                A(href = "/join") {
                                    Text(Strings.section_one_action)
                                }
                            }
                        }
                    }
                    Div(attrs = { classes(StyleCSS.SectionColumnSub) }) { }
                }
                Div(attrs = { classes(
                    StyleCSS.Section, StyleCSS.ImageVanuParty, StyleCSS.BackgroundImageRight, StyleCSS.BorderTop,
                    StyleCSS.BorderBottom, StyleCSS.SectionAlignStart, StyleCSS.AlignCenter, StyleCSS.JustifySpaceAround
                ) }) {
                    Div(attrs = { classes(StyleCSS.SectionColumnMain, StyleCSS.tintDark, StyleCSS.shadow) }) {
                        H2 {
                            Text(Strings.section_two_title)
                        }
                        P(attrs = { classes(StyleCSS.Bold) }) {
                            Text(Strings.section_two_description)
                        }
                    }
                    Div(attrs = { classes(StyleCSS.SectionColumnSub) }) { }
                }
                Div(attrs = { classes(
                    StyleCSS.Section, StyleCSS.ImageRainbowSixSiege, StyleCSS.BackgroundImageLeft, StyleCSS.BorderTop,
                    StyleCSS.BorderBottom, StyleCSS.SectionAlignEnd, StyleCSS.AlignCenter, StyleCSS.JustifySpaceAround
                ) }) {
                    Div(attrs = { classes(StyleCSS.SectionColumnMain, StyleCSS.tintDark, StyleCSS.shadow) }) {
                        H2 {
                            Text(Strings.section_three_title)
                        }
                        P(attrs = { classes(StyleCSS.Bold) }) {
                            Text(Strings.section_three_description)
                        }
                        Div(attrs = { classes(StyleCSS.FlexAlignCenter) }) {
                            Button(attrs = { classes(StyleCSS.NavigationButton) }) {
                                A(href = "/join") {
                                    Text(Strings.section_three_action)
                                }
                            }
                        }
                    }
                    Div(attrs = { classes(StyleCSS.SectionColumnSub) }) { }
                }
                Div(attrs = { classes(
                    StyleCSS.Section, StyleCSS.ImageDiscord, StyleCSS.BackgroundImageCenter, StyleCSS.BorderTop,
                    StyleCSS.AlignCenter, StyleCSS.JustifyCenter
                ) }) {
                    Div(attrs = { classes(StyleCSS.SectionColumnMain) }) {
                        Iframe(attrs = {
                            id(Ids.discordEmbed)
                            attr("src", "https://discord.com/widget?id=154310693171101697&theme=dark")
                            attr("allowtransparency", "true")
                            attr("frameborder", "0")
                            attr("sandbox", "allow-popups allow-popups-to-escape-sandbox allow-same-origin allow-scripts")
                        })
                    }
                    Div(attrs = { classes(StyleCSS.SectionColumnSub) }) {
                        Button(attrs = { classes(StyleCSS.NavigationButton) }) {
                            A(href = "http://discord.derpcompany.com/") {
                                Text(Strings.join_discord)
                            }
                        }
                    }
                }
            }
        }
    }
    Footer()
}