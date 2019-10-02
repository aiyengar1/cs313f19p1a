# cs313f19p1b
Project 1A - Prints an updated "word cloud" for each sufficiently long word read from the standard input.

Problems:
- sbt test errors out in terminal
- Testing suite is not complete
- Testing suite was working until, Tuesday night. Now it gets an error even for previously passing tests :

Error:(45, 9) java: cannot access hw.WindowMaker
  bad class file: /Users/ananthiyengar/IdeaProjects/cs313f19p1b/target/scala-2.12/classes/hw/WindowMaker.class
    class file has wrong version 56.0, should be 52.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.

Extra Credit:
Treat words case-insensitively, i.e., ignore capitalization and the like: Line 56 in Class WindowMaker
