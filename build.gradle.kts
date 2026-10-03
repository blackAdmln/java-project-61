group = "hexlet.code"

plugins {
	application
	id("com.diffplug.spotless") version "8.10.3"
}

repositories {
	mavenCentral()
}

dependencies {

}

application {
	mainClass.set("hexlet.code.App")
}

spotless {
  format ("misc") {
    target ("*.gradle", ".gitattributes", ".gitignore")

    trimTrailingWhitespace()
    leadingSpacesToTabs()
    endWithNewline()
  }
  java {
	  importOrder()
	  removeUnusedImports()
	  googleJavaFormat().aosp()
	  formatAnnotations()
	  leadingTabsToSpaces(4)
  }
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}


