#!/bin/bash
echo "Think of a number between 1-100"

LOW=1
HIGH=100
while [[ true ]]
do
    echo $LOW 
    echo $HIGH
    RAND=`shuf -i $LOW-$HIGH -n 1`
    echo "Is your number $RAND? (L for lower, H for higher and Y for yes)"
    read RESPONSE
    while [[ true ]]
    do
        if [[ $RESPONSE == L ]]
        then
            HIGH=$RAND
            (( HIGH -= 1 ))
            if [[ $HIGH -lt $LOW ]]
            then
                echo "You lied! Your number had to be $RAND"
                exit
            fi
            break
        elif [[ $RESPONSE == H ]]
        then
            LOW=$RAND
            (( LOW += 1 ))
            if [[ $LOW -gt $HIGH ]]
            then
                echo "You lied! Your number had to be $RAND"
                exit
            fi
            break
        elif [[ $RESPONSE == Y ]]
        then
            echo "Thanks for playing"
            exit
        fi
    done

    if [[ $LOW == $HIGH ]]
    then
        echo "Your number has to be $LOW!"
            echo "Thanks for playing"
        exit
    fi
done
