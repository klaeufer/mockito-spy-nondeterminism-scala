version := "0.1"

scalaVersion := "2.12.7"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies ++= Seq(
  "org.mockito"   %  "mockito-inline"  % "2.21.0" % Test,
  "com.novocode"  %  "junit-interface" % "0.11"   % Test
)
