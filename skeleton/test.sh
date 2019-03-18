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

if [[ $1 == "scanner" ]]; then
  pushd scanner > /dev/null;
    for x in *; do
      if [[ "${x}" != "output" ]]; then
        echo "Running test on ${x}..."
        CMD="java -jar ../dist/Compiler.jar -target scan ${x}"
        echo $CMD;
        $CMD | tee /tmp/${x}.out;
        diff output/${x}.out /tmp/${x}.out
      fi
    done
  popd > /dev/null;
elif [[ $1 == "parser" ]]; then
  pushd parser > /dev/null;
    for x in *; do
      echo "Running test on ${x}..."
      CMD="java -jar ../dist/Compiler.jar -target parse ${x}"
      echo $CMD;
      $CMD;
    done
  popd > /dev/null;
fi

