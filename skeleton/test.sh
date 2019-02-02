#!/bin/bash -e

ant
pushd scanner > /dev/null;
  for x in *; do
    if [[ "${x}" != "output" ]]; then
      echo "Running test on ${x}..."
      cat ${x}
      CMD="java -jar ../dist/Compiler.jar -target scan ${x}"
      echo $CMD;
      $CMD | tee /tmp/${x}.out;
      diff output/${x}.out /tmp/${x}.out
    fi
  done
popd > /dev/null;

