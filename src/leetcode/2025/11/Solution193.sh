# Valid Phone Numbers
# https://leetcode.com/problems/valid-phone-numbers/
#!/bin/bash

# Use grep to filter valid phone numbers
grep -e "^[0-9]\{3\}\-[0-9]\{3\}\-[0-9]\{4\}$" -e "^([0-9]\{3\}) [0-9]\{3\}\-[0-9]\{4\}$" file.txt

# ^: indicates the starting of the string
# $: indicates the end of the string
# [0-9]\{3\} : represent 3 numbers (\{3\}) between the range 0-9 ([0-9] a digit in the range)
# \: suppresses the specialness of the character
# -e: to include multiple regex