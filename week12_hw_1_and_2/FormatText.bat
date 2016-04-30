javac Main2.java
javac Rooms2.java
javac need.java
javac read.java

@if %ERRORLEVEL% GEQ 1 (
@echo ERROR: Fix your code
) else (
 del grocery.txt mountain.txt police.txt home.txt farm.txt sporting.txt gas.txt Intro.txt YouLose.txt YouWin.txt
 java Main2 grocery.txt mountain.txt police.txt home.txt farm.txt sporting.txt gas.txt Intro.txt YouLose.txt YouWin.txt 
) 