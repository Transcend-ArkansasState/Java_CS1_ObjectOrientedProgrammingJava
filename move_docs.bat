REM This script will copy all the staged Maven generated documentation into one cohesive directory
REM since I can't get Maven to do this as a part of it's build and deploy process.

REM https://stackoverflow.com/a/24860518
for /d %%d in (*.*) do (
    set thisDir=%%d
    echo !thisDir!
)
pause