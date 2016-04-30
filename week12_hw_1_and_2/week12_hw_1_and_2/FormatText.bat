javac FormatText.java

@if %ERRORLEVEL% GEQ 1 (
@echo ERROR: Fix your code
) else (
 del FixedText.txt 
 java FormatText FormatText.txt FixedText.txt
) 