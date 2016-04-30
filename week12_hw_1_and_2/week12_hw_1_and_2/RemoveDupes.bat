javac RemoveDupes.java

@if %ERRORLEVEL% GEQ 1 (
@echo ERROR: Fix your code
) else (
	java RemoveDupes dupNames.txt
)