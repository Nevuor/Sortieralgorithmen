
** Anleitung zur Erstellung eines Bubblesorts **


- Erstellen Sie ein Struktogramm für einen Bubblesort für eine Reihe beliebiger Länge l


Denkanstöße: (Veranschaulichung finden Sie in der Veranschaulichung.pdf Datei)


1. In jedem Durchgang wird das erste Elemente mit seinem rechten Nachbar verglichen

2. Ist das linke Elemente kleiner als das rechte wird nicht getauscht

3. Ist das linke Element größer als das rechte wird es mit diesem getauscht

4. Nach dem Vergleich (und Tausch) wird das ehemals rechte Element mit seinem rechten Nachbar verglichen

5. Das geschieht bis ein Element keinen rechten Nachbar mehr hat. Jetzt beginnt ein neuer Durchgang.

6. Die Sortierung ist beendet wenn bei einem Durchgang keine Elemente mehr getauscht werden

Zusätzlich: Da nach jedem Durchgang immer mindestens ein weiteres Elemente an seinem finalen Platz ist, kann das zu Sortierende Array nach jedem Durchgang um eins verkürzt werden.

Allgemein:

Ist Feld [n] > Feld [n +1] tausche, sonst tausche nicht.


- Programmieren Sie das Sortierverfahren in Java

1. Öffnen Sie Intellij
2. Öffnen Sie die Datei BubblesortVorlage.java, die im Repository liegt
3. Programmieren Sie den Bubblesort Algorithmus
