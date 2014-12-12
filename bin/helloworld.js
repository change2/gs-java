/**
 * User: hp
 * Date: 2014/12/10
 * Time: 15:16
 */

var foo1 = require("./foo");
var foo2 = require("./foo");
var data = require("./data")
var echo = require("../lib/main");
function hello() {
  console.log("hello world");
}

hello();
console.log(foo1.counts());
console.log(foo1.counts());
console.log(foo2.counts());
console.log(foo2.counts());
console.log(data.data.datas[0].id);
//exports 把当前模块或者方法导出成一个名字，然后new 模块就可以直接调用这个方法了
//实际的含义就是把方法暴露出去，
exports.create = function (name) {
  return {
    name: name,
    head: "this is head",
    body: "this is body",
    counter: foo1.increment()
  }
}

var name = this.create("changejava");
console.log(name);
delete  name;
console.log("deleted....");
console.log(name);
echo.echo("你好");