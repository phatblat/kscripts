#!/usr/bin/env kscript

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

val pattern = "yyyy-MM-dd"
val format = DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH)
val localDateTime = LocalDateTime.now() //.minusDays(7)
val date = format.format(localDateTime)
println(date)

// trunk snapshots
val release_slug = "swift-DEVELOPMENT-SNAPSHOT-$date-a"
val url = "https://swift.org/builds/development/xcode/$release_slug/$release_slug-osx.pkg"
print(url)
