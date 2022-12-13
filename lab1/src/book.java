public class book {
    protected String title, genre;
    protected int pages;
    public book(){} //конструктор

    public void setTitle(String t){
        title = t;
    } //setter

    public void setGenre(String g){
        genre = g;
    }

    public void setPages(int p){
        pages = p;
    }

    public String getTitle(){
        return(title);
    }

    public String getGenre(){
        return(genre);
    }

    public int getPages(){
        return(pages);
    }
    public String toString(){
       String result= "Book name: "+getTitle()+"/n Book gener: "+getGenre()+" \n Pages: "+getPages();
       return(result);
    }
    public boolean equals(book obj){
        return(this.toString().equals(obj.toString()));
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
