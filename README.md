Nashorn debugging
=================
This project illustrates what is needed in order to be able to debug
a nashorn .js-file with Intellij.

## Continuous test
### Scalatest
In order to use sbt for continuous testing with maven create a file _~/.sbt/0.13/plugins/plugins.sbt_ with the following contents:

    addSbtPlugin("com.github.shivawu" % "sbt-maven-plugin" % "0.1.3-SNAPSHOT")
    
    resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
    
Then run sbt ~test
    
### Infinitest
In order to use infinitest for continuous testing of java classes in Intellij

- install infinitest plugin
- add infinitest facet to the module(s)
- now there will be a infinitest tool window in the tool bar below the editor pane

In order to use inifinitest to run a specific test class put something like this in _infinitest.filters_:

    ^(?!.*NashornDemoTest)
