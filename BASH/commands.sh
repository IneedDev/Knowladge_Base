#!/usr/bin/env bash

touch myTextFile.txt
current_time=$(date "+%Y.%m.%d-%H")
echo "Current Time : $current_time"
echo "Some Text will be writte to the text file" >> $current_time-myTextFile.txt

remove file older than