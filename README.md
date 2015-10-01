# HtmlFormatter
A pure java convenience class to format String into Html String. It is aimed to be used with Android, but since it's pure Java, it should work fine outside Android land, but I'm not sure if there is such use case.

# Example
#### .small()
```
String input = "This is a small string";
String result = HtmlFormatter.from(input).small().getHtmlString();
System.out.println(result);
// ----- output -----
// <small>This is a small string</small>
```

#### .bold() or .strong()
```
input = "This is a bold string";
result = HtmlFormatter.from(input).bold().getHtmlString();
System.out.println(result);
// ----- output -----
// <strong>This is a bold string</strong>
```

#### .fontColor()
```
input = "This is colored string";
result = HtmlFormatter.from(input).fontColor("blue").getHtmlString();
System.out.println(result);
// ----- output -----
// <font color='blue'>This is colored string</font>
```

#### using together
```
input = "This is colored + bold string";
result = HtmlFormatter.from(input).bold().fontColor("blue").getHtmlString();
System.out.println(result);
// ----- output -----
<font color='blue'><strong>This is colored + bold string</strong></font>
```

# Using with Android TextView
```
String titleText = "This is a ";
titleText += HtmlFormatter.from("small").fontColor("red").small().getHtmlString();
titleText += " string!";
authorTextView.setText(Html.fromHtml(titleText), TextView.BufferType.SPANNABLE);
```

# Installation
```
repositories {
    maven { url "https://jitpack.io" }
}
dependencies {
    compile 'com.github.worker8:HtmlFormatter:v1.0.4'
}
```

# License
Copyright 2015 Tan Jun Rong

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
