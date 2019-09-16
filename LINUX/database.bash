#create postgresql database

sudo apt update
sudo apt install postgresql postgresql-contrib

uninstall postgres
sudo apt-get --purge remove postgresql


#switch to user postgres
sudo -i -u postgres

#postgresql without switching user
sudo -u postgres psql

CREATE DATABASE namedb

CREATE ROLE tecmint LOGIN;

CREATE DATABASE tecmint;

#run script sql from file

psql -u postgres -d mydb -a -f "D:\index.sql"

#list tables in db ubuntu postgres
#  choose database
  \c mydatabase_name
  \dt

#  connect to your database
  sudo -u postgres psql db
#load sql script from file
  psql \i sql-create-large-table.sql
# list datbles in your db
  \dt