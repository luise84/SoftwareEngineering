grammar Attributes;
file: color NEWLINE computerplayer NEWLINE player NEWLINE playfield NEWLINE fieldnumber NEWLINE level NEWLINE ai EOF;

color: 'Spielfeldfarbe' Whitespace* Separator Whitespace* 'RGB(' Value Comma Value Comma Value')';
computerplayer: 'Bildpfad des Computerspielers' Whitespace* Separator Whitespace* path;
player: 'Bildpfad des Spielers' Whitespace* Separator Whitespace* path;
playfield: 'Spielfeldtyp' Whitespace* Separator Whitespace* pType;
fieldnumber: 'Spielfeldanzahl' Whitespace* Separator Whitespace* Value;
level: 'Level' Whitespace* Separator Whitespace* lType;
ai: 'AI' Whitespace* Separator Whitespace* aiType;

path:  Folder '\\' File;

NEWLINE: [\r\n]+;
Value: [0-9]+;
Comma: ',';
Folder: [a-zA-Z]+ | [0-9]+;
File: ([a-z]+ | [0-9]+ )'.'('png' | 'PNG' | 'JPG' | 'jpg');


pType: 'Renpaarden' | 'renpaarden' | 'Le Zug' | 'le zug' | 'Classic' | 'classic' ;
lType: ('Free' | 'free') | ( 'Straight' | 'straight') | ('Diagonal' | 'diagonal');
aiType: 'easy' | 'Easy' | 'Medium' | 'medium' | 'hard' | 'Hard';
Separator: ':';
Whitespace: [ \t\n\r];

