var http = require('http');
var zlib = require("zlib");

var options = {
  url: 'http://172.16.10.68',
  port: 8124,
  method: 'GET',
  headers: {
    'Accept-Encoding': 'gzip, deflate'
  }
};

//var httpGet = http.get(options, function (resp) {
//  console.log("Got response: " + resp.statusCode);
//  console.log("Heads:" + JSON.stringify(resp.headers));
//});
//httpGet.on("data", function (chunk) {
//  console.log("Data:"+ chunk);
//}).on("error", function (e) {
//  console.log("Got error: " + e.message);
//});
http.request(options, function (resp) {
  console.log(resp.statusCode);
  console.log(JSON.stringify(resp.headers));
  var body = [];
  resp.
    on("data", function (chunk) {
      body.push(chunk);
    })
    .on("error", function (e) {
      console.log(e)
    })
    .on("end", function () {
      body = Buffer.concat(body);
      if (resp.headers['content-encoding'] === 'gzip') {
        zlib.gunzip(body, function (err, data) {
          console.log(data.toString("UTF-8"));
        })
      } else {
        console.log(body.toString());
      }
    });
}).end();
