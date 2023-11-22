<?php
echo "examples for String functions \n";
$name = "nguyen xuan truong";
echo "ten = [$name] \n";
echo "===============\n";
echo " * str_word_count() = " . str_word_count($name) ."\n";
echo " * strlen() = ". strlen($name) . "\n";
echo " * ucwords() = " .ucwords($name) ."\n";
echo " * ucfirst() = " .ucfirst($name) . "\n";
echo " * strrev() = " .strrev($name) . "\n";
echo " * str_replace() = " .str_replace("u","o",$name) . "\n";
echo " * strpos() = " .strpos($name,"u") . "\n";
echo " * strpos() = " .strpos($name,"b") . "\n";