import java.util.ArrayList;


public class Jobs {

    private String company;
    private String title;
    private String startdate;
    private String enddate;
    private String descriptions[]= new String[0];
    //private String descriptions;

    public Jobs() {
    }

    public Jobs(String company, String title, String startdate, String enddate, String descriptions[]) {
        this.company = company;
        this.title = title;
        this.startdate = startdate;
        this.enddate = enddate;
        this.descriptions = descriptions;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }


    public String[] getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String[] descriptions) {
        this.descriptions = descriptions;
    }

    public String displayJob(){
        String result="";

        for(String des:descriptions) {
            result = result + des;

        }
        String jobIn = "Company: " + getCompany() + "\n\tTitle: " + getTitle() + "\n\tStarting working date: "
                    + getStartdate() + "\n\tEnd working date: " + getEnddate() + "\n\t\tDiscription:"+result;

        return  jobIn;
    }
}