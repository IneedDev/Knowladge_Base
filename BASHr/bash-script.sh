#!/usr/bin/env bash
echo "test from bash script"

#variables
greeting="Welcome from bash script with variable"
user=$(whoami)
day=$(date +%A)

echo "$greeting back from $user today is $day"
echo "$BASH_VERSION"