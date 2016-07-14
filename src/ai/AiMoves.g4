grammar AiMoves;
file: command (Oder* NEWLINE command)* (NEWLINE command)* EOF;

command: choosetype WHITESPACE+ 'Stein' WHITESPACE+ Connector WHITESPACE+ move WHITESPACE+ movetype WHITESPACE* movedirection* WHITESPACE* '.'*;

NEWLINE: [\r\n]+;
WHITESPACE: [ \t\n\r];
choosetype: 'Zufaelliger' | 'Vorderster' | 'Hinterster' | 'zufaelliger' | 'vorderster' | 'hinterster';
Connector: 'und';
move: 'ziehe' | 'springe';
movetype: 'zufaellig' | 'gerade' | 'zur Seite' | 'zur seite' | 'diagonal';
movedirection:  'nach' WHITESPACE ('vorne' | 'hinten');
Oder: 'oder';
