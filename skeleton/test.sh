#!/bin/bash -e

ant
pushd scanner > /dev/null;
  for x in *; do
    echo "Running test on ${x}..."
    CMD="java -jar ../dist/Compiler.jar -target scan ${x}"
    echo $CMD;
    $CMD | tee /tmp/${x}.out;
    diff output/${x}.out /tmp/${x}.out
  done
popd > /dev/null;

