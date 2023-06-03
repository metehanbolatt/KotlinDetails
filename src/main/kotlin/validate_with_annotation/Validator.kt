package validate_with_annotation

import java.lang.reflect.Field

interface Validator<T> {
    fun validate(field: Field, value: T): ValidationError?
}

interface ValidationError {
    val errorMsg: String
}

data class FormatError(override val errorMsg: String) : ValidationError