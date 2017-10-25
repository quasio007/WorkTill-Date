#! /bin/bash
echo "Enter first no. :"
read num1
echo "Enter Second no. :"
read num2

## Any of the below methord can be used :
#sum=$(( num1 + num2 ))
#sum=$( expr $num1 + $num2 )
sum=$( echo "$num1 + $num2" | bc -l)
echo "Sum of '$num1' '$num2' is $sum"