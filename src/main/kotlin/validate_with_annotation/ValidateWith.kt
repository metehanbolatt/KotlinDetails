package validate_with_annotation

import kotlin.reflect.KClass

@Retention
@Target(AnnotationTarget.FIELD)
annotation class ValidateWith(val validator: KClass<*>)