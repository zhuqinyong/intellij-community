// "Change return type of enclosing function 'test' to 'String'" "true"
fun test(i: Int) {
    return when (i) {
        0 -> ""<caret>
        else -> ""
    }
}
// FUS_QUICKFIX_NAME: org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix$ForEnclosing
// FUS_K2_QUICKFIX_NAME: org.jetbrains.kotlin.idea.quickfix.fixes.ChangeTypeQuickFixFactories$UpdateTypeQuickFix