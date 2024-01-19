package codes.pratik.kmmlibrary

class MainSerializer {

    fun serialize() {
        val jsonString = "{\"name\":\"Joe\",\"age\":22,\"role\":\"intern\"}"

        val person = ConversionUtils.convertJsonStringToModel<Person>(jsonString)
    }

}

@kotlinx.serialization.Serializable
internal class Person {
    val name: String? = null
    val age: Int? = null
    val role: String? = null
}

