import pages.*

fun main() {
    console.log("Starting page")

    route(
        content = { HomePage() },
        pageNotFoundContent = { HomePage() },
    ) {
        route(
            path = "patreon",
            content = { PatreonPage() },
        ) { }
        route(
            path = "volunteer",
            content = { VolunteerPage() },
        ) {  }
        route(
            path = "sustainability",
            content = { SustainabilityPage() },
        ) {  }
        route(
            path = "events",
            content = { EventsPage() },
        ) {  }
        route(
            path = "social",
            content = { SocialPage() },
        ) {  }
    }
}

