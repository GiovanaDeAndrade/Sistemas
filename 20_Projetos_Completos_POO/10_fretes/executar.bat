@echo off
cd /d "%~dp0"
if not exist out mkdir out
javac -encoding UTF-8 -d out @fontes.txt
if errorlevel 1 (
    echo Nao foi possivel compilar. Confira se um JDK esta instalado.
    pause
    exit /b 1
)
java -cp out estudo.t10.Main %*
pause
