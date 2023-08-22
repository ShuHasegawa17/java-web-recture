#!/bin/sh
mysql -u root -ppassword << 'EOF'
use java_db
source ./sql/ddl.sql
exit
EOF