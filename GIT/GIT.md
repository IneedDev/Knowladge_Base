**list of local branches**

_git branch_

**list of all branches**

_git branch -a_

**list of all remote branches**

_git branch -r_

**create local branch**

_git checkout -b PR-001_

**push local branch to remote**

_git push origin PR-001_

**create remote branch from current local branch**

_git checkout -b PR-001 origin/PR-001_

**delete a branch**

_git branch -d PR-001_

**delete remote branch**

git push origin --delete PR-001

**switch to branch**

_git checkout PR-001_

**switch to last checked branch**

_git checkout -_

**merge active branch with branch**

_git merge PR-001_

**Update local branch**
- _git pull_
- _git pull origin PR-001_
- _git status_

**add file to staging are**

_git status add filename_

**add all new and changed file to staging area**

_git status add -A_

**initial git and config**

- _git init_
- _git clone ssh:....._
- _git remote add origin ssh://_


**check user email and name**

- _git config user.email_
- _git config user.name_

**change user email and name**
- _git config user.email "user@email"_
- _git config user.name "user name"_

**Untrack files already added to git repository based on .gitignore**
- _git rm -r --cached ._
- _git add ._
- _git commit -m ".gitignore in now working"_

** git credentials cache and timeout
git config --global credential.helper "cache --timeout 7200"

** get remote repo url 

git remote get-url origin

** refresh all remoyte branches in intelij

VCS - git - fetch