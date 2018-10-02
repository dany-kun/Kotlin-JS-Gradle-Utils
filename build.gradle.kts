
extra["kotlinVer"] = "1.2.70"
extra["konanVer"] = "0.9.2"

plugins {
    kotlin("jvm") version "1.2.31" apply false
}

allprojects {
    group = "com.github.salomonbrys.gradle"
    version = "1.2.0"
}

subprojects {
    repositories {
        jcenter()
        google()
        maven(url = "https://plugins.gradle.org/m2/")
    }

}
