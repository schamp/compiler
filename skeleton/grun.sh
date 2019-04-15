#!/bin/bash

# needed so the alias work
shopt -s expand_aliases


RULE=$1
INPUT=$2

ROOT=$(pwd)

if [ "-z ${RULE}" ] && [ -z "${INPUT}" ]; then
  echo "usage: ./grun.sh RULE INPUT_FILE"
  exit 1
fi

INPUT=${ROOT}/${INPUT}

if [ ! -f "$INPUT" ]; then
  echo "input file $INPUT doesn't exist or is not a file."
  exit 1
fi

export ANTLR4=$(pwd)/lib/antlr-4.7.2-complete.jar

export CLASSPATH=.:${ANTLR4}

alias antlr4="java -jar ${ANTLR4}"
alias grun='java org.antlr.v4.gui.TestRig'

mkdir -p /tmp/grun

cp src/decaf/Decaf.g4 /tmp/grun

pushd /tmp/grun > /dev/null

  antlr4 Decaf.g4

  javac *.java

  grun Decaf ${RULE} -trace -gui -tokens -tree ${INPUT}

popd
