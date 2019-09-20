import java.util.ArrayList;
import java.util.List;


public class Jobs {

    private String company;
    private String title;
    private String startdate;
    private String enddate;
    private List<String> descriptions= new ArrayList<>();
    //private String descriptions;

    public Jobs() {
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

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<String> descriptions) {
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