#!/bin/bash

function run_legal_test {
  echo "Running parser test on legal input ${1}..."]
  cat -n ${1}
  CMD="java -jar ../dist/Compiler.jar -target inter ${1}"
  echo $CMD;
  $CMD
  if [[ $? -ne 0 ]]; then
    echo "Test failed."
    cat -n ${1}
    exit $?
  else
    echo "Test passed."
  fi
}

function run_illegal_test {
  echo "Running parser test on illegal input ${1}..."
  cat -n ${1}
  CMD="java -jar ../dist/Compiler.jar -target inter ${1}"
  echo $CMD;
  $CMD | tee /tmp/${1}.out
  diff output/${1}.out /tmp/${1}.out
  if [[ $? -ne 0 ]]; then
    echo "Test failed."
    cat -n output/${1}.out
    exit $?
  else
    echo "Test passed."
  fi
}

ant
pushd semantics > /dev/null;
  if [[ "${1}" != "" ]]; then
    if [[ "${1}" =~ "illegal" ]]; then
      run_illegal_test "$1"
    else
      run_legal_test "$1"
    fi
  else
    for x in legal-*; do
      if [[ "${x}" != "output" ]]; then
        run_legal_test $x
      fi
    done
    for x in illegal-*; do
      if [[ "${x}" != "output" ]]; then
        run_illegal_test $x
      fi
    done
  fi
popd > /dev/null;

