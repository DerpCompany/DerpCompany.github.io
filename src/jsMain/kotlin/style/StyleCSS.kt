package style

import data.Ids
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto

object StyleCSS : StyleSheet() {

    init {

        /**
         * Global settings.
         */

        "*" style {
            boxSizing("border-box")
        }

        "body" style {
            minHeight(600.px)
            margin(Constants.size_none)
        }

        "h1, h2, h3, h4, h5, h6, p" style {
            whiteSpace("pre-wrap")
        }

        "p" style {
            fontSize(Constants.font_size_medium);
        }

        "h1" style {
            "a" style {
                textDecoration("none")
            }
            fontSize(Constants.font_size_xxlarge);
        }

        "h2" style {
            fontSize(Constants.font_size_xlarge);
        }

        "h3" style {
            fontSize(Constants.font_size_large);
        }

        "h4" style {
            fontSize(Constants.font_size_medium);
        }

        "h5" style {
            fontSize(Constants.font_size_small);
        }

        "h6" style {
            fontSize(Constants.font_size_xsmall);
        }

        "@font-face" style {
            fontFamily("myriad")
            property("src", "url('/public/fonts/myriad_pro_regular.ttf')")
        }

        "html" style {
            backgroundColor(Color("#17161a"))
            fontFamily("myriad")
            color(Constants.color_text)
            backgroundImage("url(/public/img/BG.png)")
            backgroundRepeat("repeat")
        }

        "a" style {
            color(Constants.color_highlight);
        }

        "button" style {
            fontFamily("inherit")
            fontSize(Constants.font_size_small)
        }

        "header" style {
            border {
                style(LineStyle.Solid)
                color(Constants.color_highlight)
            }
            borderWidth(
                top = Constants.size_none,
                bottom = Constants.border_xsmall,
                right = Constants.size_none,
                left = Constants.size_none,
            )
            backgroundColor(Constants.color_transparet)

            display(DisplayStyle.Flex)
            flexWrap(FlexWrap.Wrap)
            alignContent(AlignContent.Stretch)
            justifyContent(JustifyContent.SpaceAround)
            alignItems(AlignItems.Center)

            onMobile {
                type("header") style {
                    flexDirection(FlexDirection.Column)
                }
            }
        }

        "footer" style {
            border {
                style(LineStyle.Solid)
                color(Constants.color_highlight)
            }
            borderWidth(
                top = Constants.border_xsmall,
                bottom = Constants.size_none,
                right = Constants.size_none,
                left = Constants.size_none,
            )
            backgroundColor(Constants.color_background)

            display(DisplayStyle.Flex)
            flexWrap(FlexWrap.Wrap)
            justifyContent(JustifyContent.Center)
            paddingTop(Constants.size_xsmall)
            paddingBottom(Constants.size_small)
        }

        "#${Ids.container}" style {
            margin(Constants.size_none)
        }

        "#${Ids.content}" style {
            maxWidth(Constants.horizontal_full)
            property("margin", "auto")

            "img" style {
                maxWidth(100.percent)
                height(auto)
            }
        }

        /**
         * Full screen video
         */
        "#${Ids.backgroundVideoContainer}" style {
            width(100.percent)
            position(Position.Relative)
        }

        "#${Ids.backgroundVideo}" style {
            width(100.percent)
            maxHeight(800.px)
            property("object-fit", "cover")
            marginBottom((-4).px)
        }

        "#${Ids.videoHeaderContainer}" style {
            position(Position.Absolute)
            property("z-index", "10")
            property("bottom", "0px")
            property("left", "0px")
            width(100.percent)
            height(100.percent)
            display(DisplayStyle.Flex)
            justifyContent(JustifyContent.Center)
            alignItems(AlignItems.Center)
        }

        "#${Ids.videoHeader}" style {
            width(100.percent)
            maxWidth(Constants.horizontal_full)
        }

        /**
         * Discord embed
         */
        "#${Ids.discordEmbed}" style  {
            width(100.percent)
            padding(Constants.size_none)
            height(600.px)
        }
    }

    /**
     * Header Menu
     */
    val HeaderButton by style {
        property("border-style", "none")
        backgroundColor(Constants.color_transparet)

        paddingLeft(Constants.size_xsmall)
        paddingRight(Constants.size_xsmall)
        paddingTop(Constants.size_none)
        paddingBottom(Constants.size_none)
        margin(Constants.size_xxsmall)

        "a" style {
            property("transition", "all 0.2s ease")
            textDecoration("none")
            color(Constants.color_text)

            self + hover style {
                color(Constants.color_highlight)
            }
        }

        "h3" style {
            padding(Constants.size_none)
            margin(Constants.size_none)

            onMobile {
                self style {
                    fontSize(Constants.font_size_medium)
                }
            }
        }

        onMobile {
            self style {
                padding(Constants.size_none)
                margin(Constants.size_xxsmall)
            }
        }
    }

    val HeaderColumnWrapContent by style {
        property("width", "initial")
        maxWidth(Constants.horizontal_eighth)
    }

    val HeaderColumn by style {
        maxWidth(Constants.horizontal_three_eighths)
        width(100.percent)
        display(DisplayStyle.Flex)
        flexWrap(FlexWrap.Wrap)
        alignContent(AlignContent.Stretch)
        justifyContent(JustifyContent.SpaceAround)
        alignItems(AlignItems.Center)
    }

    /**
     * Footer
     */
    val FooterColumn by style {
        padding(Constants.size_xsmall)
        width(100.percent)
        maxWidth(Constants.horizontal_quarter)
        textAlign("center")
    }

    /**
     * Buttons and CTAs
     */
    val NavigationButton by style {
        backgroundColor(rgba(0,0,0,.7))
        border(
            Constants.border_small,
            LineStyle.Solid,
            Constants.color_highlight,
        )

        margin(Constants.size_small)
        paddingTop(Constants.size_small)
        paddingBottom(Constants.size_small)
        paddingLeft(Constants.size_none)
        paddingRight(Constants.size_none)

        "a" style {
            property("transition", "all 0.2s ease")
            letterSpacing(Constants.border_small)
            fontSize(Constants.font_size_small)
            textAlign("center")
            fontWeight("bold")
            textDecoration("none")
            color(Constants.color_text)

            padding(Constants.size_small)


            self + hover style {
                backgroundColor(Constants.color_highlight)
            }
        }
    }

    /**
     * Game carousel
     */
    val GameCarouselHolder by style {
        display(DisplayStyle.Flex)
        flexWrap(FlexWrap.Nowrap)
        marginLeft((-150).px)
        overflowX("auto")
        paddingTop(Constants.size_medium)
        paddingBottom(Constants.size_medium)
        overflow("hidden")
    }

    val GameCarouselInnerHolder by style {
        display(DisplayStyle.Flex)
        flexWrap(FlexWrap.Nowrap)
    }

    val GameCarouselItem by style {
        marginTop(Constants.size_none)
        marginBottom(Constants.size_none)
        marginRight((-64).px)
        marginLeft((-64).px)
        height(350.px)
        width(450.px)
        property("object-fit", "cover")
        property("clip-path", "polygon(25% 0%, 100% 0%, 75% 100%, 0% 100%)")

        property("transition", "all 0.2s ease")
        property("-webkit-mask-image", "url(/public/img/carousell-mask.png)")
        property("mask-image", "url(/public/img/carousell-mask.png)")
        property("-webkit-mask-repeat", "no-repeat")
        property("mask-repeat", "no-repeat")

        self + hover style {
            property("transform", "scale(1.15)")
        }
    }

    /**
     * Tri-button section
     */
    val SectionTriButton by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.SpaceBetween)
    }

    val TriButton by style {
        property("border-style", "none")
        backgroundPosition("center")
        backgroundRepeat("no-repeat")
        backgroundSize("cover")

        padding(Constants.size_none)
        flex(1)

        "a" style {
            display(DisplayStyle.Block)
            paddingTop(Constants.size_xlarge)
            paddingBottom(Constants.size_xlarge)
            paddingLeft(Constants.size_small)
            paddingRight(Constants.size_small)


            property("transition", "all 0.2s ease")
            letterSpacing(Constants.border_small)
            fontSize(Constants.font_size_large)
            textAlign("center")
            fontWeight("bold")
            textDecoration("none")
        }

        "a" style {
            onMobile {
                self style {
                    paddingTop(Constants.size_medium)
                    paddingBottom(Constants.size_medium)
                    paddingLeft(Constants.size_xxsmall)
                    paddingRight(Constants.size_xxsmall)

                    fontSize(Constants.font_size_small)
                }
            }
        }
    }

    val TriButtonBackgroundMain by style {
        backgroundColor(Color("#00F0FF"))

        "a" style {
            color(Color.black)
        }


        onMobile {
            self style {
                fontSize(Constants.font_size_small)
            }
        }
    }

    val TriButtonBackgroundAlternative by style {
        backgroundColor(Color("#5A12F2"))

        "a" style {
            color(Color.white)
        }

        onMobile {
            self style {
                fontSize(Constants.font_size_small)
            }
        }
    }

    val TriButtonHighlightMain by style {
        "a" style {
            self + hover style {
                backgroundColor(Constants.color_highlight_tributton_1)
            }
        }
    }

    val TriButtonHighlightAlternative by style {
        "a" style {
            self + hover style {
                backgroundColor(Constants.color_highlight_tributton_2)
            }
        }
    }

    /**
     * Sections
     */
    val Section by style {
        minHeight(Constants.size_xtall)
        paddingTop(Constants.size_medium)
        paddingBottom(Constants.size_medium)
        paddingLeft(Constants.size_none)
        paddingRight(Constants.size_none)
        display(DisplayStyle.Flex)
        flexWrap(FlexWrap.Wrap)

        onMobile {
            self style {
                minHeight("auto")
                paddingTop(Constants.size_large)
                paddingBottom(Constants.size_large)
                paddingLeft(Constants.size_none)
                paddingRight(Constants.size_none)
                justifyContent(JustifyContent.Center)
                flexDirection(FlexDirection.Column)
                alignItems(AlignItems.Center)
            }
        }
    }

    val SectionColumnMain by style {
        width(100.percent)
        maxWidth(Constants.horizontal_three_eighths)
        padding(Constants.size_medium)
    }

    val SectionColumnSub by style {
        width(100.percent)
        maxWidth(Constants.horizontal_eighth)
        paddingTop(Constants.size_medium)
        paddingBottom(Constants.size_medium)
        paddingLeft(Constants.size_none)
        paddingRight(Constants.size_none)
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
    }

    val SectionColumnHalf by style {
        width(100.percent)
        maxWidth(Constants.horizontal_quarter)
        padding(Constants.size_medium)
    }

    val SectionColumnFullWidth by style {
        width(100.percent)
        maxWidth(Constants.horizontal_half)
        padding(Constants.size_medium)
    }

    val SectionAlignEnd by style {
        flexDirection(FlexDirection.RowReverse)

        onMobile {
            self style {
                flexDirection(FlexDirection.Column)
            }
        }
    }

    val SectionAlignStart by style {
        flexDirection(FlexDirection.Row)

        onMobile {
            self style {
                flexDirection(FlexDirection.Column)
            }
        }
    }

    /**
     * Styling
     */
    val HeightLarge by style {
        height(Constants.size_large)
    }

    val HeightXLarge by style {
        height(Constants.size_xlarge)
    }

    val HeightXXLarge by style {
        height(Constants.size_xxlarge)
    }

    val HorizontalPaddingMediun by style {
        paddingLeft(Constants.size_medium)
        paddingRight(Constants.size_medium)
    }

    val AlignCenter by style {
        alignContent(AlignContent.Center)
    }

    val JustifyCenter by style {
        justifyContent(JustifyContent.Center)
    }

    val JustifySpaceAround by style {
        justifyContent(JustifyContent.SpaceAround)
    }

    val MaxWidthContent by style {
        maxWidth(Constants.horizontal_full)
        property("margin", "auto")
    }

    val FlexAlignCenter by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.SpaceEvenly)
        alignItems(AlignItems.Center)
    }

    val CenterFlex by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
    }

    val Bold by style {
        fontWeight("bold")
    }

   val BorderTop by style {
        property("border-top", "${Constants.border_xsmall} solid ${Constants.color_highlight}")
    }

    val BorderBottom by style {
        property("border-bottom", "${Constants.border_xsmall} solid ${Constants.color_highlight}")
    }

    /**
     * Background image positioning
     */
    val BackgroundImageRight by style {
        backgroundPosition("right")
        backgroundSize("auto 100%")
        backgroundRepeat("no-repeat")
        onMobile {
            self style {
                backgroundPosition("center")
                backgroundSize("cover")
            }
        }
    }

    val BackgroundImageLeft by style {
        backgroundPosition("left")
        backgroundSize("auto 100%")
        backgroundRepeat("no-repeat")
        onMobile {
            self style {
                backgroundPosition("center")
                backgroundSize("cover")
            }
        }
    }

    val BackgroundImageCenter by style {
        backgroundPosition("center")
        backgroundSize("cover")
    }

    /**
     * Background tinting
     */
    val TintDark by style {
        backgroundColor(rgba(0, 0, 0, .30))
        backgroundBlendMode("multiply")

        onMobile {
            self style {
                backgroundColor(rgba(0, 0, 0, .40))
            }
        }
    }

    val TintVeryDark by style {
        backgroundColor(rgba(0,0,0,.60))
        backgroundBlendMode("multiply")

        onMobile {
            self style {
                backgroundColor(rgba(0, 0, 0, .70))
            }
        }
    }

    val Shadow by style {
        property("box-shadow", "0px 0px 50px 50px rgba(0,0,0,0.3")
        borderRadius(25.px)

        onMobile {
            self style {
                property("box-shadow", "0px 0px 50px 50px rgba(0,0,0,0.4")
            }
        }
    }

    /**
     * Background images
     */
    val ImageVikingDragon by style {
        backgroundImage("url('/public/img/tj-foo-vikingdragon.webp')")
    }

    val ImageVanuParty by style {
        backgroundImage("url('/public/img/vanu_party3.webp')")
    }

    val ImageRainbowSixSiege by style {
        backgroundImage("url('/public/img/y5s4_2.webp')")
    }

    val ImageDestiny by style {
        backgroundImage("url('/public/img/d2withqueen.webp')")
    }

    val ImageBloodHunt by style {
        backgroundImage("url('/public/img/vampire-the-masquerade-bloodhunt--key-art-05-ps5-en-4may22.webp')")
    }

    val ImageReadyOrNot by style {
        backgroundImage("url('/public/img/ron_cutout.webp')")
    }

    val ImageOverwatchHeroes2 by style {
        backgroundImage("url('/public/img/overwatchheros2.webp')")
    }

    val ImageNewWorld by style {
        backgroundImage("url('/public/img/newworld.webp')")
    }

    val ImageSeaOfThieves by style {
        backgroundImage("url('/public/img/seaofthieves_bg2.webp')")
    }

    val ImageHowHelping by style {
        backgroundImage("url('/public/img/how_helping.webp')")
    }

    val ImageSeasonalEvents1 by style {
        backgroundImage("url('/public/img/seasonalEvents1.webp')")
    }

    val ImageHalo by style {
        backgroundImage("url('/public/img/halo.webp')")
    }

    val ImagePartyAnimals by style {
        backgroundImage("url('/public/img/partyanimals.webp')")
    }

    val ImageDeadByDeadlight by style {
        backgroundImage("url('/public/img/deadbydaylight.webp')")
    }

    val ImageDerpmas by style {
        backgroundImage("url('/public/img/derpmas.webp')")
    }

    val ImageTombRaider by style {
        backgroundImage("url('/public/img/background2x.webp')")
    }

    val ImageRules by style {
        backgroundImage("url('/public/img/rules_bg.webp')")
    }

    val ImageJoin by style {
        backgroundImage("url('/public/img/join_bg.webp')")
    }

    val ImageMoreThanGaming by style {
        backgroundImage("url('/public/img/morethangaming_bg.webp')")
    }

    val ImageAnimeClub by style {
        backgroundImage("url('/public/img/animeclub_bg.webp')")
    }

    val ImageFilmClub by style {
        backgroundImage("url('/public/img/filmclub_bg.webp')")
    }

    val ImageBookClub by style {
        backgroundImage("url('/public/img/bookclub_bg.webp')")
    }

    val ImageF1Club by style {
        backgroundImage("url('/public/img/f1_bg3.webp')")
    }

    val ImageTeemill by style {
        backgroundImage("url('/public/img/.webp')")
    }

    val ImageSustainability by style {
        backgroundImage("url('/public/img/.webp')")
    }

    val ImageDiscord by style {
        backgroundImage("url('/public/img/discord_bg2.webp')")
    }
}

fun <TBuilder> GenericStyleSheetBuilder<TBuilder>.onMobile(
    rulesBuild: GenericStyleSheetBuilder<TBuilder>.() -> Unit
) {
    media(
        CSSMediaQuery.MediaType(CSSMediaQuery.MediaType.Enum.Screen).and(mediaMaxWidth(Constants.mobile_cutoff)),
        rulesBuild,
    )
}