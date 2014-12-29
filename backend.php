<?php

require_once('lib.inc.php');

if ($lastitem = get_last_feed_item()) {
    if (feed_has_changed($lastitem['link'])) {
        send_notification(last_item_html($lastitem));
    }
}