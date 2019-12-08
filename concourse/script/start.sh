#!/bin/sh

echo "Hello-TD!"
#echo "This is running from a script"
#echo "Printing 1 to 10..."

#for x in $(seq 1 10);
#do
 # echo "$x"
#done

#echo "Finished printing!"


sudo apt install git
git clone https://github.com/litemars/TD_test.git

ls
cd TD_test
ls

java -jar TD-test.java
