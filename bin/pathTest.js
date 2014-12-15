/**
 * User: changejava
 * Date: 2014/12/15
 * Time: 12:23
 */
var cache = {};
var path = require("path");
var fs = require("fs");

function store(key, value) {
  cache[path.normalize(key)] = value;
}

store("c://tmp", 1);
store("c:////tmp", 2);
store("c:\\tmp", 3);
store("c:\\\\tmp", 4);
store("c:///tmp", 4);
store("d:///tmp", 1);
console.log(cache);
console.log(path.extname("c:\\tmp\1.out"));

var dir = "c:\\tmp";


function travel(dir, callback) {
  fs.readdirSync(dir).forEach(function (file) {
    var pathname = path.join(dir, file);
    if (fs.statSync(pathname).isDirectory()) {
      travel(pathname, callback)
    } else {
      callback(pathname);
    }
  });
}

travel(dir, function (pathname) {
  console.log(pathname);
});

function readText(pathname) {
  var bin = fs.readFileSync(pathname);
  if (bin[0] == 0xEF && bin[1] == 0xBB && bin[2] === 0xBF) {
    bin = bin.slice(3);  //BOM 的移除，Bom标记文件的编码。在文件的头部， 不属于文件的内容的一部分
  }
  return bin.toString("utf-8");
}

var iconv = require("iconv-lite");
console.log(readText("c:/tmp/1.txt"));


function readText2(pathname) {
  var bin = fs.readFileSync(pathname);
  if (bin[0] == 0xEF && bin[1] == 0xBB && bin[2] === 0xBF) {
    bin = bin.slice(3);  //BOM 的移除，Bom标记文件的编码。在文件的头部， 不属于文件的内容的一部分
  }
  return iconv.decode(bin, "gbk");
}
console.log("======================================");
console.log(readText2("C:/tools/code/gs-java/tmp/2.txt"));



