/**
 * User: changejava
 * Date: 2014/12/30
 * Time: 18:25
 */


process.stdin.setEncoding("utf-8");

process.stdin.on('readable', function () {
  var chunk = process.stdin.read();
  if (chunk !== null) {
    process.stdout.write('data: ' + chunk);
  }
});

process.stdin.on("end", function () {
  process.stdout.write('end');
});


process.argv.forEach(function (val, index, array) {
  console.log(index + ': ' + val);
});

process.on("SIGHUP", function () {
  console.log("Got SIGNUP");
});

//setTimeout(function() {
//  console.log('Exiting.');
//  process.exit(0);
//}, 100);
//process.kill(process.pid,"SIGHUP");
console.log(process.pid);