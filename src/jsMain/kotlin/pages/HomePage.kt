package pages

import components.Footer
import data.GameBanners
import components.Header
import data.Ids
import data.Strings
import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*

@Composable
fun HomePage() {
    Header()
    Div {
        Div(attrs = {
            id("backgroundVideoContainer")
        }) {
            Video(attrs = {
                id("backgroundVideo")
            }) {
                Source(attrs = {
                    attr("src", "/public/video/banner-video.mp4")
                    attr("type", "video/mp4")
                }) { }
            }
            Div(attrs = {
                id("videoHeader")
            }) {
                Img(
                    src = "/public/img/logo-splash.webp",
                    attrs = {
                        classes("headervidlink")
                    },
                )
            }
        }
        Div(attrs = { classes("heightLarge") }) { }
        Div(attrs = { classes("sectionTriButton") }) {
            Button(attrs = { classes("triButton", "tintDark",  "triButtonBackground1", "triButtonHighlight1") }) {
                A(
                    href = "/sustainability"
                ) {
                    Text(Strings.sustainability)
                }
            }
            Button(attrs = { classes("triButton", "tintDark",  "triButtonBackground2", "triButtonHighlight2") }) {
                A(
                    href = "/events"
                ) {
                    Text(Strings.events)
                }
            }
            Button(attrs = { classes("triButton", "tintDark",  "triButtonBackground1", "triButtonHighlight1") }) {
                A(
                    href = "/social"
                ) {
                    Text(Strings.social_grups)
                }
            }
        }
        Div(attrs = { classes("heightXLarge") }) { }
        Div(attrs = { classes("maxWidthContent", "horizontalPaddingMediun") }) {
            Div {
                H2 {
                    Text(Strings.something_for_everyone)
                }
            }
        }
        Div(attrs = { classes("sectionGameRow") }) {
            Div(attrs = { classes("sectionGameInnerRow") }) {
                repeat(GameBanners.repeat) {
                    GameBanners.assets.forEach {
                        Img(
                            src = "public/img/${it}",
                            attrs = {
                                classes("gameCatalogItem")
                            }
                        )
                    }
                }
            }
        }
        Div(attrs = { classes("heightXXLarge") }) { }
        Div(attrs = { id("container") }) {
            Div(attrs = { id("content") }) {
                Div(attrs = { classes(
                    "section", "hideTopBorder", "backgroundGame1", "backgroundImageCenter", "sectionBorderTop",
                    "sectionBorderBottom", "sectionAlignEnd", "alignCenter", "justifySpaceAround"
                ) }) {
                    Div(attrs = { classes("sectionColumnMain", "tintDark", "shadow") }) {
                        H2 {
                            Text(Strings.section_one_title)
                        }
                        P(attrs = { classes("bold") }) {
                            Text(Strings.section_one_description)
                        }
                        Div(attrs = { classes("flexAlignCenter") }) {
                            Button(attrs = { classes("navButton") }) {
                                A(href = "/join") {
                                    Text(Strings.section_one_action)
                                }
                            }
                        }
                    }
                    Div(attrs = { classes("sectionColumnSub") }) { }
                }
                Div(attrs = { classes(
                    "section", "hideTopBorder", "backgroundGame2", "backgroundImageRight", "sectionBorderTop",
                    "sectionBorderBottom", "sectionAlignStart", "alignCenter", "justifySpaceAround"
                ) }) {
                    Div(attrs = { classes("sectionColumnMain", "tintDark", "shadow") }) {
                        H2 {
                            Text(Strings.section_two_title)
                        }
                        P(attrs = { classes("bold") }) {
                            Text(Strings.section_two_description)
                        }
                    }
                    Div(attrs = { classes("sectionColumnSub") }) { }
                }
                Div(attrs = { classes(
                    "section", "hideTopBorder", "backgroundGame3", "backgroundImageLeft", "sectionBorderTop",
                    "sectionBorderBottom", "sectionAlignEnd", "alignCenter", "justifySpaceAround"
                ) }) {
                    Div(attrs = { classes("sectionColumnMain", "tintDark", "shadow") }) {
                        H2 {
                            Text(Strings.section_three_title)
                        }
                        P(attrs = { classes("bold") }) {
                            Text(Strings.section_three_description)
                        }
                        Div(attrs = { classes("flexAlignCenter") }) {
                            Button(attrs = { classes("navButton") }) {
                                A(href = "/join") {
                                    Text(Strings.section_three_action)
                                }
                            }
                        }
                    }
                    Div(attrs = { classes("sectionColumnSub") }) { }
                }
                Div(attrs = { classes(
                    "section", "hideTopBorder", "backgroundDiscord", "backgroundImageCenter", "sectionBorderTop",
                    "alignCenter", "justifyCenter"
                ) }) {
                    Div(attrs = { classes("sectionColumnMain") }) {
                        Iframe(attrs = {
                            id(Ids.discordEmbed)
                            attr("src", "https://discord.com/widget?id=154310693171101697&theme=dark")
                            attr("allowtransparency", "true")
                            attr("frameborder", "0")
                            attr("sandbox", "allow-popups allow-popups-to-escape-sandbox allow-same-origin allow-scripts")
                        })
                    }
                    Div(attrs = { classes("sectionColumnSub") }) {
                        Button(attrs = { classes("navButton") }) {
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