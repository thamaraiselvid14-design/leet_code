#!/bin/bash

# LeetCode topic organizer

declare -A TOPICS

# Array problems
TOPICS[2574]="Array"

# Add more problems here later
# TOPICS[1234]="String"
# TOPICS[5678]="Math"

for folder in [0-9][0-9][0-9][0-9]-*/; do

    [ -d "$folder" ] || continue

    name="${folder%/}"
    number="${name:0:4}"

    topic="${TOPICS[$number]}"

    if [ -n "$topic" ] && [ "$folder" != "$topic/" ]; then
        echo "Moving $name → $topic/"
        mv "$folder" "$topic/"
    fi

done

