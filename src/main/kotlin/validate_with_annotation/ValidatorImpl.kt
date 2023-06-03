package validate_with_annotation

import java.lang.reflect.Field

class RangeValidator : Validator<Any?> {

    override fun validate(field: Field, value: Any?): ValidationError? =
        if (((value as Int) < 1) || (value > 33)) FormatError("${field.name} field is out of range (1,33)") else null
}

class FormatValidator : Validator<Any?> {
    override fun validate(field: Field, value: Any?): ValidationError? =
        if ((value as String).contains("s")) null else FormatError("${field.name} field does not contain an s")
}
