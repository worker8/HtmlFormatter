# HtmlFormatter
A pure java convenience class to format String into Html String. It is designed to be used with Android, but since it's pure Java, it should work fine outside Android land, but I'm not sure if there is such use case.

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
