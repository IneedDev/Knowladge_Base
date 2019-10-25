#!/bin/bash
echo '\n******************** STATUS ********************\n'
git status
echo '******************** BRANCH ********************\n'
git branch -a
git add .
echo '\n'
read -p "Commit description: " desc
echo '\n'
git commit -m "$desc"
read -p "Remote branch: " remote
echo 'your remote brach is's $remote
git push origin $remote
