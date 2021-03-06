enablePlugins(ScalaJSPlugin)

name := "Circuits Up"
scalaVersion := "2.13.1"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

resolvers += "jitpack" at "https://jitpack.io"

updateOptions := updateOptions.value.withLatestSnapshots(false)

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "1.0.0",
  "com.github.wbillingsley.veautiful" %%% "veautiful" % "master-SNAPSHOT",
  "com.github.wbillingsley.veautiful" %%% "veautiful-templates" % "master-SNAPSHOT",
	"com.github.wbillingsley.veautiful" %%% "scatter" % "master-SNAPSHOT",
	//"com.github.wbillingsley.veautiful" %%% "wren" % "master-SNAPSHOT"
)