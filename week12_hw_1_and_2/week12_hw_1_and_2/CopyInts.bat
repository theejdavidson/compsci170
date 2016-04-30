javac CopyInts.java

@if %ERRORLEVEL% GEQ 1 (
@echo ERROR: Fix your code
) else (
 del uniqueInts.txt
  java CopyInts copyInts.txt uniqueInts.txt
  java CopyInts noInts.txt noInts.out.txt

)
