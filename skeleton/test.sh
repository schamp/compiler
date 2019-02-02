#!/bin/bash -e

function run_test {
  x=$1
  echo "Running scanner test on ${x}..."
  cat -n ${x}
  CMD="java -jar ../dist/Compiler.jar -target scan ${x}"
  echo $CMD;
  $CMD 2>&1 | tee /tmp/${x}.out;
  diff output/${x}.out /tmp/${x}.out
}

ant
pushd scanner > /dev/null;
  if [[ "${1}" != "" ]]; then
    run_test "$1"
  else
    for x in *; do
      if [[ "${x}" != "output" ]]; then
        run_test "${x}"
        echo
      fi
    done
  fi
popd > /dev/null;

