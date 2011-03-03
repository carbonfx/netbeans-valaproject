[CarbonFX](http://carbonfx.org) ValaProject - this is a plugin for the Netbeans IDE for Vala
===============================================================================

While we have new great programming language named [Vala](http://live.gnome.org/Vala), 
there is a lack of support in popular IDEs of it.
So this project is a try to allow comfortable Vala programming in the Netbeans IDE.

Feautures
-------------------------------------------------------------------------------

At this moment, we have implemented:
	
	* Syntax coloring;
	* Tabs and code indents;
	
Also there is a project template based on CMake.
Using template you can build and run Vala based project from the Netbeans IDE.

[CMake for Vala](http://westhoffswelt.de/blog/0043_build_vala_projects_with_cmake_macros.html) 
- thanks to Jakob Westhoff for this.

Development
-------------------------------------------------------------------------------

The next great targets are:
	* Code completion;
	* Debugging.
	
The plugin parser is based uppon ANTLR rules, see in antlr/Vala.g file.
If you want to support or contribute into the project please feel free to contact us.

Download and Install
-------------------------------------------------------------------------------

Download plugin for Netbeans from [download section](vala-netbeans/downloads).
Get a template project from sources (git clone code source, and copy a template folder)
