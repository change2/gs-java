/**
 * User: changejava
 * Date: 2014/12/10
 * Time: 15:24
 */
var i = 0;
function count() {
  console.log("foo javascript...." + (i++))
}

function increment() {
  return i++;
}
exports.counts = count;
exports.increment = increment;