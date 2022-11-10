import androidx.compose.runtime.Composable
import kotlinx.browser.window
import org.jetbrains.compose.web.renderComposable

data class RouteBuilder(
    val path: String = "",
    val currentPath: String = window.location.pathname,
) {
    fun destinationFound(): Boolean {
        return if (path == "") {
            "/" == currentPath
        } else {
            path == currentPath
        }
    }

    fun correctPath(): Boolean {
        return currentPath.startsWith(path)
    }

    fun printDestinationFound() {
        console.log("Route Found: $path")
    }
}

fun route(
    content: @Composable () -> Unit,
    pageNotFoundContent: @Composable () -> Unit,
    routeBuilder: RouteBuilder = RouteBuilder(),
    children: RouteBuilder.() -> Unit,
) {
    console.log("Comparing ${routeBuilder.currentPath} with ${routeBuilder.path}")

    try {
        if (routeBuilder.destinationFound()) {
            routeBuilder.printDestinationFound()
            renderComposable(rootElementId = "contentRoot") {
                content()
            }
        } else {
            routeBuilder.children()
        }
        console.log("Page not found. Falling back to 404")
        renderComposable(rootElementId = "contentRoot") {
            pageNotFoundContent()
        }
    } catch (pageFound: PageFoundException) {
        console.log("Page found!")
    }
}

fun RouteBuilder.route(
    path: String,
    content: @Composable () -> Unit,
    children: RouteBuilder.() -> Unit = {},
) {
    val childRoute = this.copy(
        path = "${this.path}/$path"
    )

    console.log("Comparing ${childRoute.currentPath} with ${childRoute.path}")

    if (childRoute.destinationFound()) {
        printDestinationFound()
        renderComposable(rootElementId = "contentRoot") {
            content()
        }
        throw PageFoundException()
    } else if (childRoute.correctPath()){
        childRoute.children()
        throw PageNotFoundException()
    }
}

class PageNotFoundException : Throwable()

class PageFoundException : Throwable()
