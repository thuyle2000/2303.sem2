<?php
preg_match_all('/[a-z]+/i', 'Nguyen Van An', $matches, PREG_OFFSET_CAPTURE);
print_r($matches);