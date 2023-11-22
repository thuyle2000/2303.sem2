<?php
echo "example static variable \n";

function fn_counting() {
    static $counter = 1;
    printf("hi, visit counter is #%d \n", $counter++);
}

fn_counting();
fn_counting();
fn_counting();
fn_counting();