# !/bin/bash

files=(*/)
counter=-1

for file in "${files[@]}"; do
    let counter=$counter+1
    echo "$counter - $file"
done
echo -e "\n \e[32m******************** PROJECT ********************  \e[0m \n"
read -p "Give number of project directory: " directory

cd $PWD/${files[$directory]::-1}
echo -e "\n \e[32m******************** STATUS ********************  \e[0m \n"
git status
echo -e "\n \e[32m******************** BRANCH ********************  \e[0m \n"
git branch -a
git add .
echo -e "\n \e[32m******************** COMMIT ********************  \e[0m \n"
read -p "Commit description: " desc
git commit -m "$desc"
read -p "Remote branch:  " remote
echo 'your remote brach is ' $remote
echo -e "\n \e[32m******************** PUSH ********************  \e[0m \n"
git push origin $remote
