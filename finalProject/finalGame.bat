javac read.java
javac Main2.java
javac Rooms2.java
javac need.java


@if %ERRORLEVEL% GEQ 1 (
@echo ERROR: Fix your code
) else (
 del 
 java Main2 
) 