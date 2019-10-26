# !/bin/bash
git config --global credential.helper "cache --timeout 7200"
files=(*/)
counter=-1
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
echo -e "\n \e[32m******************** BRANCH ********************  \e[0m \n"
git branch -a
echo -e "\n \e[32m******************** GIT ADD ALL ********************  \e[0m \n"
git add .
git status
echo -e "\n \e[32m******************** COMMIT ********************  \e[0m \n"
read -p "Commit description: " desc
git commit -m "$desc"
echo -e "\n \e[32m******************** PUSH ********************  \e[0m \n"
read -p "Remote branch:  " remote
echo 'Your remote brach is ' $remote
git push origin $remote

