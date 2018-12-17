#!/usr/bin/env kscript

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*





val pattern = "yyyy-MM-dd"
val format = DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH)
var localDateTime = LocalDateTime.now()
print(format.format(localDateTime))
