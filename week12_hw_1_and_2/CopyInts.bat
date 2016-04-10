javac CopyInts.java

@if %ERRORLEVEL% GEQ 1 (
@echo ERROR: Fix your code
) else (
 java CopyInts copyInts.txt
)