package codes.pratik.kmmlibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform