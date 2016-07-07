grammar Attributes;
file:	color NEWLINE computerplayer NEWLINE player EOF ;

color: 'Spielfeldfarbe' Whitespace* Separator Whitespace* 'RGB(' Value Comma Value Comma Value')';
computerplayer: 'Bildpfad des Computerspielers' Whitespace* Separator Whitespace* path;
player: 'Bildpfad des Spielers' Whitespace* Separator Whitespace* path;

path: Drive? '\\'? Folder ('\\' Folder)* '\\' File;

NEWLINE: [\r\n]+;
Value: [0-9]+;
Comma: ',';
Folder: [a-zA-Z]+ | [0-9]+;
File: ([a-z]+ | [0-9]+ )'.'('png' | 'PNG' | 'JPG' | 'jpg');
Drive: [a-zA-Z]':';
Separator: ':';
Whitespace: [ \t\n\r];
