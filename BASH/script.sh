#!/usr/bin/env bash

echo "hello form bash script"
greeting="Welcome from greeting"
user=$(whoami)
day=$(date +%A)

echo "$user and $day"
echo "$BASH_VERSION"

echo "some calculations based on defined variables"

num_a=4
num_b=4
string1="string1"
string2="string2"

echo "$[$a + $b]"

echo "compare strings and int"

[ $num_a -eq $num_b ]
echo $?

[ $string1 = $string2 ]
echo $?

if [ $num_a -lt $num_b ] ; then
    echo "a jest mniejsze od b"
fi

num_c=100
num_d=200

if [ $num_c -lt $num_d ]; then
    echo "$num_a is less than $num_b!"
fi