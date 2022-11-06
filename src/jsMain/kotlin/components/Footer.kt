package components

import data.Strings
import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*

@Composable
fun Footer() {
    Footer {
        Div(attrs = { classes("footerColumn") }) {
            A(href = "/") {
                Img("/public/img/logo.png")
            }
        }
        Div(attrs = { classes("footerColumn") }) {
            H1 {
                Text(Strings.get_connected)
            }
            SocialButton(
                href = "http://discord.derpcompany.com/",
                img = "/public/img/footer_discord_d.png",
                newTab = true,
            )
            SocialButton(
                href = "https://www.youtube.com/user/D3rpCompany",
                img = "/public/img/footer_youtube_d.png",
                newTab = true,
            )
            SocialButton(
                href = "https://www.twitch.tv/derpcompanytv",
                img = "/public/img/footer_twitch_d.png",
                newTab = true,
            )
            SocialButton(
                href = "https://steamcommunity.com/groups/DerpCompanyGaming",
                img = "/public/img/footer_steam_d.png",
                newTab = true,
            )
        }
    }
}

@Composable
private fun SocialButton(
    href: String,
    img: String,
    newTab: Boolean = false,
) {
    A(
        href = href,
        attrs = {
            if (newTab) {
                attr("target", "_blank")
                attr("rel", "noopener noreferrer")
            }
        }
    ) {
        Img(src = img)
    }
}
