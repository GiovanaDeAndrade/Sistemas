#!/usr/bin/env sh
set -eu
cd "$(dirname "$0")"
mkdir -p out
javac -encoding UTF-8 -d out @fontes.txt
java -cp out estudo.t05.Main "$@"
