Nashorn debugging
=================
This project illustrates what is needed in order to be able to debug
a nashorn .js-file with Intellij.

In order to use sbt for contiuous testing with maven create a file _~/.sbt/0.13/plugins/plugins.sbt_ with the following contents:

    addSbtPlugin("com.github.shivawu" % "sbt-maven-plugin" % "0.1.3-SNAPSHOT")
    
    resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
    
In order to use inifinitest to run a specific test class put something like this in infinitest.filters:

    ^(?!.*NashornDemoTest)
