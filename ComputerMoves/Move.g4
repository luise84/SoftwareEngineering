grammar Move;

file
    : row row row row row row row EOF;

row : (move move move move move move move LineBreak) | EOF;

move
   : SimpleRow SimplePosition Separator;


Separator
  : ';' ;

SimpleRow
  : ('a'|'b'|'c'|'d'|'e'|'f'|'g');

SimplePosition
 : [1-7];

LineBreak
 : '\r\n';





