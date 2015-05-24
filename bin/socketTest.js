/**
 * User: changejava
 * Date: 2014/12/30
 * Time: 17:01
 */

var net = require("net");

var options = {};
var server = net.createServer(options, function (connect) {
  console.log('client connected');
  connect.on("data", function (chunk) {
    //console.log(chunk.toString("utf-8"));
    connect.write([
      'HTTP/1.1 200 OK',
      'Content-Type: text/plain',
      'Content-Length: 11',
      '',
      'Hello World'
    ].join('\n'));
  });
  connect.write("hello world\r\n");
  connect.on("end", function () {
    console.log('client disconnected');
  })

  connect.pipe(connect);
});


server.listen("8124", function () {
  console.log('server bound');
});
