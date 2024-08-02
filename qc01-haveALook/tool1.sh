#!/bin/bash

cat song_wordlist.txt | while read line
do
   # do something with $line here
   if steghide extract -q -p $line -sf challenge.jpg; then
     echo $line
     break
   #else
   #    echo command returned some error
   fi
done
