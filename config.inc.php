<?php

// Pingstream configuration file

// Define global $CONFIG array - don't change this!
global $CONFIG;
$CONFIG = array();
$CONFIG['send'] = new stdClass();

// Set account details for sending party
$CONFIG['send']->user = 'testuser';        // User portion of JID
$CONFIG['send']->host = '127.0.0.1';        // Host portion of JID
$CONFIG['send']->resc = 'pingstream';    // Resource portion of JID
$CONFIG['send']->pass = 'mypass';        // Password for user

// Full path to our cache directory
$CONFIG['cachedir'] = '';

// Set the receiving account details
$CONFIG['receive'] = 'receivinguser@127.0.0.1';

// Set the RSS feed we're going to check
$CONFIG['rss'] = 'http://www.ibm.com/developerworks/views/web/rss/libraryview.jsp';