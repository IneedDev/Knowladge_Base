#!/bin/bash
echo 'give repo'
read repo
git clone $repo
echo 'give local branch to create'
read localbranch
git checkout -b $localbranch
git push origin $localbranch
