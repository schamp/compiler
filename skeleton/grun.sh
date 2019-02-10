#!/bin/bash

# needed so the alias

shopt -s expand_aliases

RULE=$1
INPUT=$2

ROOT=$(pwd)

if [ "${INPUT}" != "" ]; then
  INPUT=${ROOT}/${INPUT}
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

  grun Decaf ${RULE} -trace -gui -tokens ${INPUT}

popd