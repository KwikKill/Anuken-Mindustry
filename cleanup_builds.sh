#!/bin/bash

ls *-Gab351-mod.jar | sort | head -n +7 | cut -d'-' -f 1 | while read oldbuild; do
  OLD_DESKFILE="${oldbuild}-Gab351-mod.jar"
  OLD_FILE1="Bleeding-Edge-Build-${oldbuild}.md"
  [ -e "${OLD_FILE1}" ] && git rm -f ${OLD_FILE1}
  [ -e "${OLD_DESKFILE}" ] && git rm -f ${OLD_DESKFILE}
done

git status
