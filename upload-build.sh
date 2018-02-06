#!/usr/bin/env bash

# cd $HOME
git config --global user.email $GHEMAIL
git config --global user.name $GHUSERNAME

# add, commit and push files
git clone https://github.com/Gab351/Anuken-Mindustry.wiki.git
cd Anuken-Mindustry.wiki

DESKFILE=$TRAVIS_BUILD_NUMBER"-Gab351-mod.jar"
cp ../desktop/build/libs/desktop-release.jar $DESKFILE

FILE1="Bleeding-Edge-Build-"$TRAVIS_BUILD_NUMBER".md"

if [ ! -e $FILE1 ]; then
    touch $FILE1
fi

NEWLINE="\n"
echo "### Commit #"$TRAVIS_COMMIT".${NEWLINE} Desktop JAR download: [Link]("$DESKFILE")" >> $FILE1

git add $FILE1
git add $DESKFILE

# now remove old build
bash ../cleanup_builds.sh
git commit -m "Added a new bleeding edge build"

git push https://$GHUSERNAME:$GHPASSWORD@github.com/Gab351/Anuken-Mindustry.wiki.git --all
