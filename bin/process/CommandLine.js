/**
 * User: changejava
 * Date: 2014/12/30
 * Time: 17:30
 */

var child_process = require("child_process");
var util = require("util");


function copy(source, target, callback) {
  child_process.exec(util.format('copy  %s\\* %s', source, target), callback);
}

function ping(ip, count, callback) {
  child_process.exec(util.format("ping -n %s %s", count, ip), callback);
}


console.log = function (d) {
  process.stderr.write(d + '\n');
};

//copy("C:\\tmp","C:\\tmp1",function(err){
//  console.log(err);
//});

//ping("localhost", 10, function (err) {
//  console.log(err);
//});


process.on("exit", function (code) {
  setTimeout(function () {
    console.log('This will not run');
  }, 0);
  console.log('About to exit with code:', code)
});

process.on("uncaughtException", function (err) {
  console.log('Caught exception: ' + err);
});

setTimeout(function () {
  console.log('This will still run.');
}, 500);

//nonexistentFunc();
console.log('This will not run.');

console.log(Boolean(process.stdin.isTTY));
console.log(Boolean(process.stdout.isTTY));

var chunk = process.stdin.read();
console.log(chunk);

process.exit(0);