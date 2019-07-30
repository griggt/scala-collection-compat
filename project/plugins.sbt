val crossVer = "0.6.1"
val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).filter(_.nonEmpty).getOrElse("0.6.28")
val scalaNativeVersion =
  Option(System.getenv("SCALANATIVE_VERSION")).filter(_.nonEmpty).getOrElse("0.3.9")

addSbtPlugin("org.scala-js"           % "sbt-scalajs"                   % scalaJSVersion)
addSbtPlugin("org.portable-scala"     % "sbt-scalajs-crossproject"      % crossVer)
addSbtPlugin("org.scala-native"       % "sbt-scala-native"              % scalaNativeVersion)
addSbtPlugin("org.portable-scala"     % "sbt-scala-native-crossproject" % crossVer)
addSbtPlugin("org.scala-lang.modules" % "sbt-scala-module"              % "2.0.0")
addSbtPlugin("ch.epfl.scala"          % "sbt-scalafix"                  % "0.9.5")
addSbtPlugin("com.eed3si9n"           % "sbt-buildinfo"                 % "0.9.0")
addSbtPlugin("com.jsuereth"           % "sbt-pgp"                       % "1.1.2-1")
addSbtPlugin("de.heikoseeberger"      % "sbt-header"                    % "5.2.0")
