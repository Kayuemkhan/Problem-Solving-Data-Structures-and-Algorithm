package algorithms.dataStructures.stack;

import java.util.Stack;
public class BrowserBackButton {
    private final Stack<String> pageStack;
    public BrowserBackButton() {
        pageStack = new Stack<>();
    }
    public void visitPage(String url) {
        // Add the URL to the stack when a new page is visited
        pageStack.push(url);
        System.out.println("Visited page: " + url);
    }
    public void goBack() {
        if (!pageStack.isEmpty()) {
            String previousPage = pageStack.pop();
            System.out.println("Navigating back to: " + previousPage);
        } else {
            System.out.println("Cannot go back. No pages in history.");
        }
    }
    public static void main(String[] args) {
        BrowserBackButton browser = new BrowserBackButton();
        // Visit different web pages
        browser.visitPage("https://www.example.com");
        browser.visitPage("https://www.example.com/page1");
        browser.visitPage("https://www.example.com/page2");
        // Press the back button to navigate back
        browser.goBack();
        browser.goBack();
        browser.goBack();
        browser.goBack(); // Trying to go back when no pages are left
    }
}