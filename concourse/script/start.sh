#!/bin/sh

echo "Hello-TD!"

pwd
cd repo/test
pwd
echo "entro in task"
cd Task1
echo "dopo task"
pwd
ls
echo "entro in bin"
cd bin
echo "dopo bin"
pwd
echo "elenco bin"
ls
echo "fine elenco bin"
cd org
ls
cd magee
ls
cd math
ls
cd ../../../../..


java -jar TD-test.jar paths.txt
