#!/bin/bash
echo "What is your name?"
read NAME
echo "What is your age?"
read AGE
echo "What is your Reddit username?"
read USER

STRING="your name is $NAME, you are $AGE years old, and your username is $USER"
echo $STRING
echo $STRING > log.txt
