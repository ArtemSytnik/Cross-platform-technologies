echo off
set path=C:\Program Files\Java\jdk-15.0.1\bin
set include=C:\Program Files\Java\jdk-15.0.1\include
set lib=C:\Program Files\Java\jdk-15.0.1\lib
set link=C:\Program Files\Java\jdk-15.0.1\bin
javac -version Sytnik.java
java Sytnik
javap -c Sytnik >1.txt
javadoc Sytnik.java -d 1
pause
