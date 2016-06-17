
# SoftwareEngineering-Halma

Halma ist ein Brettspiel für zwei Spieler. Das Spiel besitzt ein quadratisches Spielfeld, auf dem in den gegenüberliegenden beiden Ecken jeweils 15 Spielfiguren stehen. Ziel ist es, so schnell wie möglich mit allen eigenen Spielfiguren in das jeweils gegenüberliegende Feld zu kommen. Der Spieler darf in seinem Sielzug seine Figur auf den direkt nächsten freien Punkt bewegen (schieben) oder solange über andere Figuren springen, sofern das darauffolgende Feld nicht belegt ist. Es sind immer alle Richtungen möglich: horizontal, vertikal oder diagonal. Hat der Spieler in dem vorherigen Spielzug eine Spielfigur geschoben, so darf diese Spielfigur beim nächsten Zug nicht springen. Diese oder zumindest eine andere Spielfigur von ihm muss nochmals geschoben werden - erst danach kann wieder eine Spielfigur springen. Hat der Spieler keinen Platz zum Schieben, muss er aussetzen.
In diesem Projekt soll eine Person gegen den Computer spielen können.

Erweiterung der Codegenerierung :  
  Spielzugregeln gemäß des Levels der KI durch if-Abfragen 
  Spielzugregeln gemäß des Levels zur Überprüfung der Züge des realen Spielers
  Grafische Attribute wie Farbe/Textur für Spielfeld/Steine/etc.. 
  Spielfeldgenerierung mit Anordnung beider Spielfigurenblöcke: Klassisch, Renpaarden, Le Zug

Level Straight: nur waagerechte und senkrechte Bewegungen nach vorne und hinten erlaubt (4)
Level Free: alle Bewegungsrichtungen nach vorne und hinten erlaubt (8)
Level Diagonal Forward: nur diagonale Bewegungsrichtungen nach vorne erlaubt (2)

