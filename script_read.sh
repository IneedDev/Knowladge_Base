#!/usr/bin/env bash

# echo give email
# read email
# echo give user
# read user
# git config --global user.email "$email"
# git config --global user.name "$user"
echo check your git configs
git config user.name
git config user.email
git add .
echo give commit message
read mcommit
git commit -m "$mcommit"
echo commited
echo define remote branch to push
read remote_branch
git push origin $remote_branch
echo pushed to $remote_branch
