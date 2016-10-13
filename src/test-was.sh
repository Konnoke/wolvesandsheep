#!/bin/bash

# This cleans all the players in players/*.jar and removes unnecessary packages.
#
#


target=dist/WolvesAndSheep.jar

alljars=
allclasses=
for file in `ls players/*.jar players/*/*.jar classic.players/*.jar classic.players/*/*.jar`; do

file2=`echo $file | tr [:upper:] [:lower:]` 
mv $file $file2 
file=$file2
touch -r "$file" /tmp/sametime.tmp

# delete javafx and was packages if necessary
zip -d $file javafx/\* >/dev/null
zip -d $file was/\* >/dev/null
zip -d $file players/\* >/dev/null
zip -d $file basic/\* >/dev/null
zip -d $file sandbox2.policy test-was.sh reitter.jar run.py >/dev/null

if [ "$file" != "players/reitter.jar" ]; then
   zip -d $file reitter/* >/dev/null
fi

touch -r /tmp/sametime.tmp "$file"

allclasses="$allclasses `basename $file .jar`"
alljars="$alljars:$file"

done


#echo "Suggsted run command:"
#echo "./java17 -Xmx1500m -classpath dist/WolvesAndSheep.jar:$alljars was.ClassTournament -e -c -r 3"
