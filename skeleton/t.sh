#!/bin/bash -e

ant
x=$1
pushd scanner > /dev/null;
  echo "Running test on ${x}..."
  CMD="java -jar ../dist/Compiler.jar -target scan ${x}"
  echo $CMD;
  $CMD | tee /tmp/${x}.out;
  diff output/${x}.out /tmp/${x}.out
popd > /dev/null;


