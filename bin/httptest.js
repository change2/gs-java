/**
 * User: changejava
 * Date: 2014/12/15
 * Time: 14:35
 */
var http = require("http");
var zlib = require("zlib");
var url = require("url");

http.createServer(function (request, response) {
  console.log(request.url);
  console.log(url.parse(request.url))
  console.log(request.method);
  console.log(request.headers);
  var i = 513,
    data = '';

  while (i--) {
    data += '.';
  }

  if ((request.headers['accept-encoding'] || '').indexOf('gzip') !== -1) {
    zlib.gzip(data, function (err, data) {
      response.writeHead(200, {
        'Content-Type': 'text/plain',
        'Content-Encoding': 'gzip'
      });
      response.end(data);
    });
  } else {
    response.writeHead(200, {
      'Content-Type': 'text/plain'
    });
    response.end(data);
  }
}).listen(8124);
