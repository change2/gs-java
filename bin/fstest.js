var fs = require("fs");
var util = require("util");

//复制文件,有大小限制。
function copy(src, dst) {
  console.time("read-big");
  fs.writeFileSync(dst, fs.readFileSync(src));
  console.timeEnd("read-big");
}

function copyBig(src, dst) {
  console.time("copy-big");
  fs.createReadStream(src).pipe(fs.createWriteStream(dst));
  console.timeEnd("copy-big");
}

function main(argv) {
  //copy(argv[0], argv[1]);
  copyBig(argv[0], argv[1]);
}

//main(process.argv.slice(2));

function read(path, options) {
  fs.readFile(path, options, function (err, data) {
    if (err)throw err;
    console.log(data);
  });
}


function write(path, content, options) {
  fs.writeFile(path, content, options, function (err) {
    if (err) throw err;
    console.log('It\'s saved!');
  });
}

function append(path, content, options) {
  fs.appendFile(path, content, options, function (err) {
    if (err)throw err;
    console.log("It\'s append")
  })
}

function watch(path) {
  fs.watchFile(path, function (current, previous) {
    console.log(current.mtime);
    console.log(previous.mtime);
  });
}

function testFileSystem() {
  fs.exists("C:/tools/code/gs-java/tmp/2.txt", function (exists) {
    util.debug(exists ? "It\' is exists" : " not exists");
  });

  fs.stat("C:/tools/code/gs-java/tmp/2.txt", function (err, stats) {
    if (err) throw err;
    console.log(stats.isFile());
    console.log(stats.isDirectory());
    console.log(stats.isSocket());
    console.log(stats.isFIFO());
    console.log(util.inspect(stats));
  });

  //fs.mkdir("c:/tmp/1",function(error){
  //  if(error) throw error;
  //  console.log("It\' is create success!");
  //});
}
var path = "C:/tools/code/gs-java/tmp/2.txt";
//watch(path);
//javascript只支持UTF-8，如果要支持GBK ，需要下载额外例如：IconV包的支持
write(path, "你好，赞赏", {encoding: "utf-8"});
append(path, "追加的内容\r\n1\r\n1", {encoding: "utf-8"});
read(path, {encoding: "utf-8"});
testFileSystem();