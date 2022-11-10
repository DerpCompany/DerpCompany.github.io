let devServer = config.devServer
if (devServer != undefined) {
    devServer.historyApiFallback = {
        index: '404.html'
    }
}

