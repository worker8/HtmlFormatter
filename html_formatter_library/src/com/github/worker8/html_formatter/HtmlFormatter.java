package com.github.worker8.html_formatter;
/**
 * Created by tanjunrong on 10/1/15.
 */
public class HtmlFormatter {
    String mInputString;

    public HtmlFormatter(String mInputString) {
        this.mInputString = mInputString;
    }

    public static HtmlFormatter from(String inputString){
        return new HtmlFormatter(inputString);
    }
    public HtmlFormatter small(){
        mInputString = "<small>" + mInputString +"</small>";
        return this;
    }
    public HtmlFormatter strong(){
        mInputString = "<strong>" + mInputString +"</strong>";
        return this;
    }
    public HtmlFormatter bold(){
        return strong();
    }
    public HtmlFormatter fontColor(String color){
        mInputString = "<font color='" + color +"'>" + mInputString + "</font>";
        return this;
    }
    public String getHtmlString(){
        return mInputString;
    }
}
