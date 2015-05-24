Logger = {
  buffer: '',
  debug: function (s) {
    this.buffer += s + '<br/>';
  },
  reset: function () {
    this.buffer = '';
  },
  flush: function () {
    return this.buffer;
  }
}

function execute() {
  Logger.reset();
  try {
    var result = eval(document.getElementById('src').value);
    if (result) {
      output(Logger.flush() + result);
    }
    else {
      output(Logger.flush());
    }
  }
  catch (e) {
    output(Logger.flush() + e);
  }
}

function output(s) {
  document.getElementById('output').innerHTML = s;
}
