# java-html-generator
Java based HTML generator for making simple HTML pages quickly

The application is designed to provide a console interface for quickly creating simple HTML pages. Rather than being aimed
at novice programmers it is instead aimed at reducing the simple tasks of more experienced developers.

#### Example Implementation</br>
    Page page = new Page("Test Page");
    page.addHeader("Main Header");
    page.addSubHeader("Sub Header");
    page.addLink("https://google.com", "test link");
    page.addImage("test.jpg", "test image");
    page.addParagraph("This application provides quick implementation of HTML pages.");
    page.addOrderedList("item1", "item2", "item3");
	page.addUnorderedList("item1", "item2", "item3");
    page.printHtml();

#### Example Output</br>
    <html>
    <title>Test Page</title>
    <body>
    <h1>Main Header</h1>
    <h3>Sub Header</h3>
    <a href ="https://google.com">test link</a>
    <img src="test.jpg" alt="test image">
    <p>This application provides quick implementation of HTML pages</p>
    <ul>
        <li>item1</li>
        <li>item2</li>
        <li>item3</li>
    <ul>
    <ol>
        <li>item1</li>
        <li>item2</li>
        <li>item3</li>
    </ol>
    </body>
    </html>

