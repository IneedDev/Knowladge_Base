# !/bin/bash
# pawel.romaniuk

my_array=( `git status` )
my_array_length=${#my_array[@]}
counter2=0

for element in "${my_array[@]:1:$my_array_length}"
do
  let counter2=$counter2+1
  echo "${element}"
done