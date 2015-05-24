/**
 * User: changejava
 * Date: 2014/12/12
 * Time: 10:36
 */

var fs = require("fs");
var z = require("zlib");
var rs = fs.createReadStream("c:/tmp/1.txt");
var ws = fs.createWriteStream("c:/tmp/2.out");
var w = fs.createWriteStream("c:/tmp/1.txt.gz");
var gzip = z.createGzip();
//有数据传递的时候触发, chunk data string
rs.setEncoding("utf8");
rs.on("data", function (chunk) {
  rs.pause();
  doSomething(chunk);
  ws.write(chunk);
});
//先留到zlib，然后再输出流
rs.pipe(gzip).pipe(w);
var count = 0;

//once the buffer is drained ，the readable event will fire again when more data is available
rs.on("readable", function () {
  ++count;
  console.log("readable event emit %d", count);
  //var chunk;
  //
  //while (null !== (chunk = rs.read())) {
  //  console.log('got %d bytes of data', chunk.length);
  //}
})
//读取完毕触发
rs.on("end", function () {
  cleanUp();
});
var assert = require('assert');
function doSomething(chunk) {
  assert.equal(typeof chunk, 'string');
  //console.log("data  event %s:",chunk);
  console.log("got bytes of data length: %d", chunk.length);
  rs.resume();
}
var cleanUp = function () {
  console.log("end event,there will be no more data.");
  ws.end();//结束写的流，相当于通知关闭
};