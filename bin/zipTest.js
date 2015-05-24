/**
 * User: changejava
 * Date: 2014/12/15
 * Time: 11:13
 */
var fs = require("fs");
var z = require("zlib");
var r = fs.createReadStream("c:/tmp/1.txt");
var one = fs.createReadStream("c:/tmp/one.txt");
var w = fs.createWriteStream("c:/tmp/1.txt.gz");
var two = fs.createWriteStream("c:/tmp/two.txt");
var gzip = z.createGzip();
r.on("end", function () {
  console.log("GoodBye");
  w.end();
});

//写zip流
r.pipe(gzip).pipe(w);


//2.写文本流2 unpipe, 停止写
one.pipe(two);
setTimeout(function () {
  console.log("stop write 2.txt")
  one.unpipe(two);
  console.log("manually close the file stream ");
  two.end();
}, 1);

var data = fs.readFileSync("c:/tmp/1.txt", {encoding: 'utf-8'});
console.log(data);