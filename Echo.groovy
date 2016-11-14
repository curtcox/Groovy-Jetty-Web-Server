class Echo {

static def headers(request) {
    def all = ""
    for (name in request.headerNames) {
    	all = all + row(name,request.getHeader(name))
    }
    return all
}

static def row(key,value) {
    return "<tr><td>$key</td><td>$value<td></tr>"
}

static def response(request) {
    return "<html><body><table>" + 
	           row('scheme'      , request.scheme) +
	           row('secure'      , request.secure) +
	           row('method'      , request.method) +
	           headers(request) +
	           row('queryString' , request.queryString) +
 	           row('pathInfo'    , request.pathInfo) +
 	           row('requestURI'  , request.requestURI) +
 	           row('servletPath' , request.servletPath) +
 	           row('localAddr'   , request.localAddr) +
 	           row('localName'   , request.localName) +
 	           row('localPort'   , request.localPort) +
 	           row('remoteUser'  , request.remoteUser) +
 	           row('remoteAddr'  , request.remoteAddr) +
 	           row('remoteHost'  , request.remoteHost) +
 	           row('remotePort'  , request.remotePort) +
 	           row('serverName'  , request.serverName) +
 	           row('serverPort'  , request.serverPort) +
           "</table></body></html>"
}

}