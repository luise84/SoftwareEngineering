grammar AiMoves;
file: command (NEWLINE command)* EOF;

command: choosetype WHITESPACE+ 'Stein' WHITESPACE+ Connector WHITESPACE+ move WHITESPACE+ movetype WHITESPACE* movedirection* WHITESPACE* '.';

NEWLINE: [\r\n]+;
WHITESPACE: [ \t\n\r];
choosetype: 'Zufälliger' | 'Vorderster' | 'Hinterster';
Connector: 'und';
move: 'ziehe' | 'springe';
movetype: 'zufällig' | 'gerade' | 'zur Seite' | 'diagonal';
movedirection:  'nach' WHITESPACE ('vorne' | 'hinten');
