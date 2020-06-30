/* ScalablyTyped configuration */
enablePlugins(ScalablyTypedConverterGenSourcePlugin)

scalaVersion := "2.13.2"
name := "file-saver-slinky"
version := "0.1.1"

/* javascript / typescript deps */
Compile / npmDependencies ++= Seq(
  "@types/file-saver" -> "2.0.1",
  "file-saver" -> "2.0.2"
)

libraryDependencies ++= Seq(
  "org.scalatest" %%% "scalatest" % "3.1.2" % Test
)

/* disabled because it somehow triggers many warnings */
scalaJSLinkerConfig ~= (_.withSourceMap(false))

// because npm is slow
useYarn := true

stExperimentalEnableImplicitOps := true

// say we want custom code for slinky
stFlavour := Flavour.SlinkyNative

// focus only on these libraries
stMinimize := Selection.AllExcept("file-saver")

// shade into another package
stOutputPackage := "vision.id.filesaver.facade"

publishMavenStyle := true
homepage := Some(new URL("https://github.com/mcallisto/file-saver-slinky"))
startYear := Some(2020)
pomExtra := (
  <scm>
    <connection>scm:git:github.com:/mcallisto/file-saver-slinky</connection>
    <developerConnection>scm:git:git@github.com:mcallisto/file-saver-slinky.git</developerConnection>
    <url>github.com:mcallisto/file-saver-slinky.git</url>
  </scm>
    <developers>
      <developer>
        <id>mcallisto</id>
        <name>Mario Càllisto</name>
      </developer>
    </developers>
  )
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "libs"
