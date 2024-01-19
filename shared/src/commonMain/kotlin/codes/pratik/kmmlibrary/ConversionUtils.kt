package codes.pratik.kmmlibrary

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

internal object ConversionUtils {
    internal inline fun <reified Model>convertJsonStringToModel(jsonString: String): Model {
        return Json.decodeFromString(jsonString)
    }
}