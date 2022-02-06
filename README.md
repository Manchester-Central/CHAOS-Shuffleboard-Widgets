# CHAOS Shuffleboard Widgets

This repository contains the code [FRC Team 131, CHAOS,](https://www.chaos131.com) uses for their custom ShuffleBoard widgets.

It currently contains:
* A widget for configuring the Auto Steps that we use for our autonomous scripting language


# HOW-TO: Build, Debug, and Deploy our Widget(s)

## Building

You may still use the FRC 2022 VSCode IDE and build the code using the *WPILib Command Palette*.  Steps:

1. Click the *WPILib Command Palette* button in the top right corner or press CTRL-SHIFT-P.
2. Type *WPILib: Build Robot Code*

Why would we be building Robot code?  We aren't - this command simply invokes the `build` task set up by Gradle.


You may alternately use the *WPILib: Run a command in Gradle* command:

1. Click the *WPILib Command Palette* button in the top right corner or press CTRL-SHIFT-P.
2. Type `WPILib: Run a command in Gradle`
3. Type `build` to execute the build task

Building only builds the project.  It does not deploy the resulting jar where it can be picked up by Shuffleboard automatically.

## Deploying

Deploying will copy the jar to the `%USERPROFILE%/Shuffleboard/plugins` (Windows) or `~/Shuffleboard/plugins` (Linux/Mac) folder on the local machine.  Shuffleboard will automatically make widgets in our jar available for use when it starts. Deploying is similar to building:

1. Click the *WPILib Command Palette* button in the top right corner or press CTRL-SHIFT-P.
2. Type `WPILib: Run a command in Gradle`
3. Type `deployWidget` to execute the deployment

Running the `deployWidget` task will automatically invoke the `build` task.

## Debugging

Once the `deployWidget` Gradle task copies our jar for automatic loading by Shuffleboard, you can perform some debugging.

### Non-Interactive Debugging
Using Java API methods to output text to [STDOUT](https://en.wikipedia.org/wiki/Standard_streams "Learn about standard streams") (i.e. `System.out.println()` or similar) will be captured in output log files.  Every time Shuffleboard runs, 
a log file may be found at `%USERPROFILE%/Shuffleboard` (Windows) or `~/Shuffleboard` (Linux/Mac).  

### Interactive Debugging
A tutorial about debugging in VSCode can be found [here](https://code.visualstudio.com/docs/java/java-debugging "Java Debuggin in VSCode") for those who are not familiar with interactive debugging.  A file `.vscode/launch.json` has been included that will automatically launch Shuffleboard when selecting **Debug->Start Debugging** (or **F5** as the keyboard shortcut).  You can then set breakpoints, inspect variables, and do all sorts of other things that make debugging this way superior to the old-school *log-to-stdout* method.


# Thanks
Thanks to [FRC Team 3735, VorTX,](https://github.com/vortx3735) for the [Shuffleboard Widget Template](https://github.com/nleach999/Vortx3735.Shuffleboard.2019.WidgetTutorial)!
