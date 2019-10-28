#sudo root user
sudo su -
exit

#current directory
pwd
ls


#create new directory
mkdir "dirname"

sudo usermod -a -G docker $USER

#get content of file
cat /usr/src/filename.txt

# unhide files from terminal
ls -ld .?*
