#!/bin/sh

echo "Hello-TD!"
#echo "This is running from a script"
#echo "Printing 1 to 10..."

#for x in $(seq 1 10);
#do
 # echo "$x"
#done

#echo "Finished printing!"
cd /tmp/build/23524be9/repo/test/Task1/bin//org/magee/math/
pwd
ls -la
cd repo
pwd
ls -la
cd concourse/script
pwd


java -jar TD-test.jar path.txt
