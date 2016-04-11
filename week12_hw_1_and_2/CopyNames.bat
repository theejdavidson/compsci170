javac CopyNames.java

@if %ERRORLEVEL% GEQ 1 (
@echo ERROR: Fix your code
) else (
	del fixedNames.txt
	java CopyNames copyNames.txt fixedNames.txt
)