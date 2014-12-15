/**
 * User: changejava
 * Date: 2014/12/15
 * Time: 14:35
 */
var http = require("http");

var httpServer = http.createServer(function (request, response) {
  var buffer = "Hello World \n";
  response.writeHead(200, {'Content-Type': 'text-plain', 'Content-length': buffer.length, 'username': 'changejava'});
  response.end(buffer);
});
httpServer.listen(8124);

