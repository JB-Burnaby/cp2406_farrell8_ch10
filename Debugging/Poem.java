public class Poem {

    public String title;
    public int lines;

    public Poem(String name, int numLines){
        title = name;
        lines = numLines;
    }

    public String getTitle(){
        return title;
    }

    public int getLines(){
        return lines;
    }


}
