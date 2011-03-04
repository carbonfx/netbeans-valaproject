#!/bin/bash

sort output/Vala.tokens | \
awk -F "=" '{print ("new ValaTokenId (ValaParser.tokenNames[ValaLexer." \
     $1 "], \"\", ValaLexer." $1 "),");}'