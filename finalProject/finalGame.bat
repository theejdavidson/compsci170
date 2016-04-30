javac read.java
javac Main.java
javac Place.java
javac need.java


@if %ERRORLEVEL% GEQ 1 (
@echo ERROR: Fix your code
) else (
 del 
 java Main
) 