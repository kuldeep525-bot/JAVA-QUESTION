// 9. Write a Java program to create an interface Searchable with a method search(String keyword) that searches for a given keyword in a text document. Create two classes Document and WebPage that implement the Searchable interface and provide their own implementations of the search() method.


interface Searchable{
  boolean search(String keyword);
}

class Document implements Searchable{
  private String content;

  Document(String content)
  {
    this.content=content;
  }

  public boolean search(String keyword)
  {
    return content.contains(keyword);
  }
}


class WebPage implements Searchable{
  private String htmlcontent;
  private String url;

  WebPage(String htmlcontent,String url)
  {
    this.htmlcontent=htmlcontent;
    this.url=url;
  }

  public boolean search(String keyword)
  {
    return htmlcontent.contains(keyword);
  }
}


 class main {
    public static void main(String[] args) {
        Document document = new Document("This is a sample document.");
        boolean documentContainsKeyword = document.search("sample");
        System.out.println("Document contains keyword 'sample': " + documentContainsKeyword);

        WebPage webPage = new WebPage("this is sample website", "https://kuldeep.com");
        boolean webPageContainsKeyword = webPage.search("is");
        System.out.println("Webpage contains keyword 'webpage': " + webPageContainsKeyword);
    }
}