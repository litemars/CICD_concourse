#!/bin/sh

echo "Hello-TD!"
#echo "This is running from a script"
#echo "Printing 1 to 10..."

#for x in $(seq 1 10);
#do
 # echo "$x"
#done

#echo "Finished printing!"
ls -R
echo "find"
cd repo
ls -la
cd test
ls -la
cd Task1
ls -la
cd src
ls -la
cd org
ls -la
cd magee
ls -la
cd math
ls -la
pwd
cd ../../../../../../
ls -la
cd ./repo/concourse/script
pwd


java -jar TD-test.jar path.txt
