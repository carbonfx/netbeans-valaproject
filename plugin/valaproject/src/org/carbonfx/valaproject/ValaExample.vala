/*
	Hello world application
*/

// Single line comment

using GLib;

/**
	JavaDoc comment
*/
class Sample : Object
{
	 void run ()
	 {
			 stdout.printf ("Hello World\n");
	 }

	 static int main (string[] args)
	 {
			 var sample = new Sample ();
			 sample.run ();
#if 0
			 bad_code;
#else
#endif

			 return 0;
	 }
}