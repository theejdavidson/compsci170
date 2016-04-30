javac CourseList.java

@if %ERRORLEVEL% GEQ 1 (
@echo ERROR: Fix your code
) else (
	type courses.txt | java CourseList
)