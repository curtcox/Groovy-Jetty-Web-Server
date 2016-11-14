def echo() {
    response.contentType = 'text/html'
    println Echo.response(request)
}

def root() {
    response.contentType = 'text/html'
    println new File('root.html').text
}

SimpleGroovyServlet.run(8080) { ->
    if (request.pathInfo=="/")            { root(); return }
    if (request.pathInfo=="/favicon.ico") { return }
    echo()
}
