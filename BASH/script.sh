#!/usr/bin/env bash

echo "hello form bash script"
greeting="Welcome from greeting"
user=$(whoami)
day=$(date +%A)

echo "$user and $day"
echo "$BASH_VERSION"

echo "some calculations based on defined variables"

a=4
b=4
string1="string1"
string2="string2"

echo "$[$a + $b]"

echo "compare strings and int"

[ $a -eq $b ]
echo $?

[ $string1 = $string2 ]
echo $?
