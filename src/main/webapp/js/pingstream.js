var BOSH_SERVICE = '/xmpp-httpbind'
var connection = null;

function notifyUser(msg) {
  if (msg.getAttribute('from') == "testuser@127.0.0.1/pingstream") {
    var elems = msg.getElementsByTagName('body');
    var body = elems[0];
    $('#notifications').append(Strophe.getText(body));
  }
  return true;
}

function onConnect(status) {
  if (status == Strophe.Status.CONNECTED) {
    $('#notifications').html('<p class="welcome">Hello! Any new posts will appear below.</p>');
    connection.addHandler(notifyUser, null, 'message', null, null, null);
    connection.send($pres().tree());
  }
}

$(document).ready(function () {
  connection = new Strophe.Connection(BOSH_SERVICE);
  connection.connect("receivinguser@127.0.0.1",
    "receivinguserpass",
    onConnect);
});

