var fs = require("fs");
var bin = new Buffer("A","utf-8");
console.error(bin);
var byteBuf = new Buffer([0x68,0x65,0x6c,0x6c,0x6f]);
console.error(byteBuf.toString("utf-8"));
//得到新的buffer。原buffer保持不变。任何对字符串修改将会得到一个新的字符串
var sub = byteBuf.slice(2);
sub[0] = "0x60";
console.error(sub);

//copy buffer to dup

bin = new Buffer([0x61,0x62,0x63,0x64,0x65,0x41]);
var dup = new Buffer(bin.length);
bin.copy(dup);
console.error(dup.toString("UTF-8"));
