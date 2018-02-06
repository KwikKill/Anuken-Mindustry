#!/usr/bin/env bash

OLD_TRAVIS_BUILD_NUMBER=`expr $TRAVIS_BUILD_NUMBER - 7`
OLD_DESKFILE=$OLD_TRAVIS_BUILD_BUMBER"-desktop-bleeding-edge.jar"
OLD_FILE1="Bleeding-Edge-Build-"$OLD_TRAVIS_BUILD_NUMBER".md"

echo "OLD_TRAVIS_BUILD_NUMBER=${OLD_TRAVIS_BUILD_NUMBER}"
echo "OLD_DESKFILE=${OLD_DESKFILE}"
echo "OLD_FILE1=${OLD_FILE1}"

if [ -e $OLD_FILE1 ]; then
    rm -f $OLD_FILE1
    rm -f $OLD_DESKFILE
    git add $OLD_FILE1
    git add $OLD_DESKFILE
fi
