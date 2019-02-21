#!/bin/sh
git add .
echo " "
echo "******Computo*Distribuido**********"
echo "**mensaje de commit(sin espacios)**"
echo "***********************************"
echo " "
read msg
git commit -m $msg
git push
