[CarbonFX](http://carbonfx.org) ValaProject - Plugin for the Netbeans IDE for Vala
===============================================================================

This is a try to create plugin for Netbeans IDE to support comfortable Vala programming
[Vala](http://live.gnome.org/Vala) is a new and modern programming language based on GObject type system.

Feautures
-------------------------------------------------------------------------------

At this moment, we have implemented:
	
	* Syntax coloring;
	* Tabs and code indents;
	* Syntax error highlight.
	
Also there is a project template based on CMake.
Using this template you can build and run Vala based project from the Netbeans IDE.

Project template is based on 
[CMake for Vala](http://westhoffswelt.de/blog/0043_build_vala_projects_with_cmake_macros.html) 

Development
-------------------------------------------------------------------------------

The next tasks are:
	* Sample projects for application and library within a plugin;
	* Code completion and hints;
	* Improve project support (class view, hide generated files and folders);
	* Debugging from the IDE.
	
The plugin parser is based uppon ANTLR rules, see in antlr/Vala.g file.
If you want to support or contribute into the project please feel free to contact us.

Download and Install
-------------------------------------------------------------------------------

Download plugin for Netbeans from [download section](netbeans-valaproject/downloads).
To use a template project, copy it from the sources (git clone the project, and then copy template folder)

Acknowledgment and License
-------------------------------------------------------------------------------

The project is developed by Carbon Foundation X team with the support from [Innova Systems RU](http://www.inn.ru/).
Source code and binaries are distributed under BSD 3-clause license ("New BSD License" or "Modified BSD License").
