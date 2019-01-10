#!/bin/bash -e

ant
x=$2
if [[ $1 == "scanner" ]]; then
  pushd scanner > /dev/null;
    echo "Running test on ${x}..."
    CMD="java -jar ../dist/Compiler.jar -target scan ${x}"
    echo $CMD;
    $CMD | tee /tmp/${x}.out;
    diff output/${x}.out /tmp/${x}.out
  popd > /dev/null;
elif [[ $1 == "parser" ]]; then
  pushd parser > /dev/null;
    echo "Running test on ${x}..."
    CMD="java -jar ../dist/Compiler.jar -target parse ${x}"
    echo $CMD;
    $CMD;
popd > /dev/null;
fi


