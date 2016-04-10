javac CopyNames.java

@if %ERRORLEVEL% GEQ 1 (
@echo ERROR: Fix your code
) else (
 java CopyNames copyNames.txt
)