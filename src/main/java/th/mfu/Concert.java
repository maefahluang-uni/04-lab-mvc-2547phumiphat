package th.mfu;

import java.util.Date;

public class Concert {

    //TODO: add attributes
    private int id;
    private String title;
    private String performer;
    private Date date;
    private String description;


    public Concert() {
    }
    public Concert(String title, String description) {
        //TODO: set attributes
        this.id = id;
        this.title = title;
        this.performer = performer;
        this.date = date;
        this.description = description;
    }
    //TODO: add getters and setters for all attributes
    public int getid(){
        return id;
    }
        public void setid(int id){
        this.id = id;
    }

    public String gettitle(){
        return title;
    }
        public void settitle(String title){
        this.title = title;
    }

    public String getperformer(){
        return title;
    }
        public void setperformer(String performer){
        this.performer = performer;
    }

    public Date getdate(){
        return date;
    }
        public void setdate(Date date){
            this.date = date;
        }

    public String getdescription(){
        return description;
    }
        public void setdescription(String description){
            this.description = description;
        }
    // You can use Source action/generate getter setter function
@Override 
    public String ToString(){
        return
    }

}
