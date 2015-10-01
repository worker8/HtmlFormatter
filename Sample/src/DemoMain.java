
public class DemoMain {

    public static void main(String[] args) {
        String input = "This is a small string";
        String result = HtmlFormatter.from(input).small().getHtmlString();
        System.out.println(result);

        input = "This is a bold string";
        result = HtmlFormatter.from(input).bold().getHtmlString();
        System.out.println(result);

        input = "This is colored string";
        result = HtmlFormatter.from(input).fontColor("blue").getHtmlString();
        System.out.println(result);

        input = "This is colored + bold string";
        result = HtmlFormatter.from(input).bold().fontColor("blue").getHtmlString();
        System.out.println(result);
    }
}
