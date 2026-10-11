# Задание 2. Методы классов-оболочек

`x` — метод существует; `—` — отсутствует. В столбце `isStatic` отмечены статические методы.

| Метод | Boolean | Byte | Character | Double | Float | Integer | Long | Short | isStatic |
|---|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
| byteValue() | — | x | — | x | x | x | x | x | — |
| doubleValue() | — | x | — | x | x | x | x | x | — |
| floatValue() | — | x | — | x | x | x | x | x | — |
| intValue() | — | x | — | x | x | x | x | x | — |
| longValue() | — | x | — | x | x | x | x | x | — |
| shortValue() | — | x | — | x | x | x | x | x | — |
| parseXxx(String) | x | x | — | x | x | x | x | x | x |
| parseXxx(String, int radix) | — | x | — | — | — | x | x | x | x |
| valueOf(String, int radix) | — | x | — | — | — | x | x | x | x |
| toString() | x | x | x | x | x | x | x | x | — |
| toString(primitive) | x | x | x | x | x | x | x | x | x |
| toString(primitive, int radix) | — | — | — | — | — | x | x | — | x |

`parseXxx` означает `parseBoolean`, `parseByte`, `parseDouble`, `parseFloat`, `parseInt`, `parseLong` или `parseShort`. У `Character` метода `parseChar` нет.

`radix` — основание системы счисления. В строках `toString(primitive...)` рассматриваются методы с собственным примитивным типом оболочки, например `Integer.toString(int, int)` и `Long.toString(long, int)`.

Методы `byteValue`–`shortValue` доступны числовым оболочкам, в том числе через наследование от `Number`. У `Boolean` и `Character` вместо них есть `booleanValue()` и `charValue()`.
