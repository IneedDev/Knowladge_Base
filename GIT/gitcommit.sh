# !/bin/bash
# pawel.romaniuk

git config --global credential.helper "cache --timeout 7200"
files=(*/)

echo -e "\n \e[32m******************** PROJECTS ********************  \e[0m \n"

for file in "${files[@]}"; do
    let counter=$counter+1
    echo "$counter - $file"
done

echo -e "\n"
read -p "Give number of project directory: " directory
cd $PWD/${files[$directory]::-1}
echo -e "\n \e[32m******************** STATUS ********************  \e[0m \n"

git status

echo -e "\n \e[32m******************** REMOTE BRANCHES ********************  \e[0m \n"

my_array=( `git branch -r` )
my_array_length=${#my_array[@]}
counter2=0

for element in "${my_array[@]:3:$my_array_length}"
do
  let counter2=$counter2+1
  echo "$counter2 ---- ${element##*/}"
done

echo -e "\n"
read -p "Give remote branch to push: " index

remote_branch=$(echo ${my_array[$index+2]##*/})

echo -e "\n \e[32m******************** GIT ADD ALL ********************  \e[0m \n"

git add .
git status

echo -e "\n \e[32m******************** COMMIT ********************  \e[0m \n"
read -p "Commit description: " desc

git commit -m "$desc"

echo -e "\n \e[32m******************** PUSH ********************  \e[0m \n"

git push origin $remote_branch
