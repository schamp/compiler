#!/bin/bash -e

function run_scanner_test {
    echo "Running scanner test on ${1}..."
    CMD="java -jar ../dist/Compiler.jar -target scan ${1}"
    echo $CMD;
    $CMD | tee /tmp/${1}.out;
    diff output/${1}.out /tmp/${1}.out
}

function run_parser_test {
    echo "Running parser test on ${1}..."
    CMD="java -jar ../dist/Compiler.jar -target parse ${1}"
    echo $CMD;
    $CMD
    if [[ $? -ne 0 ]]; then
        echo "Test failed."
        exit $?
    else
        echo "Test passed."
    fi
}

ant

# scanner test
pushd scanner > /dev/null;
  if [ "$1" != "" ]; then
    run_scanner_test $1;
  else
    for x in *; do
      if [[ ${x} == "output" ]]; then
          # pass
          echo "Skipping output dir."
      elif [[ ${x} == *"skip"* ]]; then
          echo "Skipping scanner test on ${x}..."
      else
          run_scanner_test ${x}
      fi
    done
  fi
popd > /dev/null;

# parser test
pushd parser > /dev/null;
  if [ "$1" != "" ]; then
     run_parser_test $1;
  else
    for x in legal*; do
        if [[ ${x} == *"skip"* ]]; then
            echo "Skipping parser test on ${x}..."
        else
            run_parser_test ${x}
        fi
    done
  fi
popd > /dev/null;