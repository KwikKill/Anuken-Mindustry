#!/bin/bash

ls *.jar | cut -d'-' -f 1 | sort -n | head -n -7 |  while read oldbuild; do
  echo "cleaning up ${oldbuild}"
  OLD_DESKFILE="${oldbuild}-Gab351-mod.jar"
  OLD_OLD_DESKFILE="${oldbuild}-gab_351-mod.jar"
  OLD_OLD_OLD_DESKFILE="${oldbuild}-desktop-bleeding-edge.jar"
  OLD_FILE1="Bleeding-Edge-Build-${oldbuild}.md"
  [ -e "${OLD_FILE1}" ] && git rm -f ${OLD_FILE1}
  [ -e "${OLD_DESKFILE}" ] && git rm -f ${OLD_DESKFILE}
  [ -e "${OLD_OLD_DESKFILE}" ] && git rm -f ${OLD_OLD_DESKFILE}
  [ -e "${OLD_OLD_OLD_DESKFILE}" ] && git rm -f ${OLD_OLD_OLD_DESKFILE}
done

git status
