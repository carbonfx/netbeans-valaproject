java -jar "%~dp0\dist\TestParser.jar" %1
if NOT ERRORLEVEL 0 echo "---Failed---" %1 