@echo off
for /R %%i in (*.vala) do call c:\maqdev\dev\carbonfx\vala-netbeans\antlr\TestParser\testparse.cmd "%%i"