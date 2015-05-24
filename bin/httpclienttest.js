/**
 * User: changejava
 * Date: 2014/12/15
 * Time: 17:20
 */
var http = require("http");
//http.get("http://localhost:8124/",function(res){
//  console.log(res.statusCode);
//  res.setEncoding("utf-8");
//  res.on("data",function(chunk){
//    console.log(chunk);
//  })
//});

http.request(
  {
    hostname: "http://localhost",
    port: 8124,
    path: "/"
  }
  , function (res) {
    res.setEncoding("utf-8");
    res.on("data", function (chunk) {
      console.log(chunk);
    })
  });