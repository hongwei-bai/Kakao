[kakao](../../index.md) / [com.agoda.kakao](../index.md) / [IntentBuilder](./index.md)

# IntentBuilder

`class IntentBuilder`

Class for building Intent matchers

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `IntentBuilder()`<br>Class for building Intent matchers |

### Functions

| Name | Summary |
|---|---|
| [any](any.md) | `fun any(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches any intent |
| [getMatcher](get-matcher.md) | `fun getMatcher(): Matcher<`[`Intent`](https://developer.android.com/reference/android/content/Intent.html)`>` |
| [getResult](get-result.md) | `fun getResult(): `[`ActivityResult`](https://developer.android.com/reference/android/app/Instrumentation/ActivityResult.html)`?` |
| [hasAction](has-action.md) | `fun hasAction(action: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun hasAction(action: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches intent with given action |
| [hasCategories](has-categories.md) | `fun hasCategories(vararg categories: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun hasCategories(categories: Matcher<out `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches intent with given categories |
| [hasComponent](has-component.md) | `fun hasComponent(className: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches intent which component has given class name`fun hasComponent(component: `[`ComponentName`](https://developer.android.com/reference/android/content/ComponentName.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun hasComponent(component: Matcher<`[`ComponentName`](https://developer.android.com/reference/android/content/ComponentName.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun hasComponent(function: `[`ComponentNameBuilder`](../-component-name-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches intent with given component |
| [hasData](has-data.md) | `fun hasData(uri: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun hasData(uri: `[`Uri`](https://developer.android.com/reference/android/net/Uri.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun hasData(uri: Matcher<`[`Uri`](https://developer.android.com/reference/android/net/Uri.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun hasData(function: `[`UriBuilder`](../-uri-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches intent with given data |
| [hasExtra](has-extra.md) | `fun hasExtra(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun hasExtra(key: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, value: Matcher<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches intent with given extra |
| [hasExtraWithKey](has-extra-with-key.md) | `fun hasExtraWithKey(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun hasExtraWithKey(key: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches intent with given extra key |
| [hasExtras](has-extras.md) | `fun hasExtras(extras: Matcher<`[`Bundle`](https://developer.android.com/reference/android/os/Bundle.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun hasExtras(function: `[`BundleBuilder`](../-bundle-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches intent with given extras |
| [hasFlag](has-flag.md) | `fun hasFlag(flag: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches intent with given flag |
| [hasFlags](has-flags.md) | `fun hasFlags(flags: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun hasFlags(vararg flags: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches intent with given flags |
| [hasPackage](has-package.md) | `fun hasPackage(packageName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun hasPackage(packageName: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches intent with given package |
| [hasType](has-type.md) | `fun hasType(type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun hasType(type: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches intent with given type |
| [isInternal](is-internal.md) | `fun isInternal(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches any internal intent |
| [toPackage](to-package.md) | `fun toPackage(packageName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Matches intent which addresses to given package |
| [withResult](with-result.md) | `fun withResult(function: `[`ActivityResultBuilder`](../-activity-result-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Invoke this function if you want to set default result for intending intents |