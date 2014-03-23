package p3

object ArgParser {
  private val Version = "1.0.0"

  private def displayHelp: Unit = println("Can't help you this time")

  private def displayVersion: Unit = println(Version)

  private def unknownArgument(arg: String): Unit = println("Don't know what to do with " + arg)

  def parseArgument(arg: String): Unit = arg match {
    case "-h"    => displayHelp
    case "-v"    => displayVersion
    case unknown => unknownArgument(unknown)
  }
}