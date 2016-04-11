javac FormatText.java

@if %ERRORLEVEL% GEQ 1 (
@echo ERROR: Fix your code
) else (
 java FormatText FormatText.txt FixedText.txt
)