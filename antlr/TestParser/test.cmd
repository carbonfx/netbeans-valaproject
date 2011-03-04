@echo off
for /R %%i in (*.vala) do call "%~dp0\testparse.cmd" "%%i"