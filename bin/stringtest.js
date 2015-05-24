var a = new String('a');
var b = new String('a');
console.log(typeof a);
console.log(typeof ('' + a));
if (a == b) {
  console.log('a=b');
}

if (('' + a) == ('' + b)) {
  console.log('a=====b');
}

s = [100, 20, 3, 401, 50, 6000, 71, 8];
console.log(s.sort());

console.log(s.sort(function (a, b) {
  return a - b;
}));

console.log(s.sort(function (a, b) {
  return b - a;
}))