/**
 * User: changejava
 * Date: 2014/12/30
 * Time: 17:20
 */
var net = require("net");


var options = {
  url: 'http://172.16.10.68',
  port: 8124
};

var client = net.connect(options, function () {
  client.write(
    [
      'GET / HTTP/1.1',
      'User-Agent: curl/7.26.0',
      'Host: www.baidu.com',
      'Accept: */*',
      '',
      ''
    ].join("\n")
  );
});

client.on("data", function (chunk) {
  console.log(chunk.toString());
  client.end();
});