#!/bin/bash
git branch -a
git add .
read -p "Commit description: " desc
git commit -m "$desc"
echo 'remote branch'
read remote
echo 'your remote brach is ' $remote
git push origin $remote
