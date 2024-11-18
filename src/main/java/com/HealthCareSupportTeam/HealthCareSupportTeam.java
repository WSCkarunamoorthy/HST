package com.HealthCareSupportTeam;
//import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "HST")
public class HealthCareSupportTeam {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer idd;
	 private String id;
	private String note;
    private String appoinmentdatetime;
    private String coordinatordetails;
    private String fhedetails;
    private String vendordetails;
    private String remaindercalltobeneficiary;
    private String remaindercalltocoordinater;
    private String primaryreport;
    private String investigationreport;
    private String consulatant20minssession;
    private String finalreporttoclient;
    private String chtmail;
    private String followupcall;

    // Default constructor
    public HealthCareSupportTeam() {}

    // Constructor with parameters
    public HealthCareSupportTeam(
    		String id, 
    		String note, 
    		String appoinmentdatetime, 
    		String coordinatordetails, 
    		String fhedetails, 
    		String vendordetails,
            String remaindercalltobeneficiary, 
            String remaindercalltocoordinater, 
            String primaryreport, 
            String investigationreport, 
            String consulatant20minssession, 
            String finalreporttoclient, 
            String chtmail,
            String followupcall) 
    {
        this.id = id;
        this.note = note;
        this.appoinmentdatetime = appoinmentdatetime;
        this.coordinatordetails = coordinatordetails;
        this.fhedetails = fhedetails;
        this.vendordetails = vendordetails;
        this.remaindercalltobeneficiary = remaindercalltobeneficiary;
        this.remaindercalltocoordinater = remaindercalltocoordinater;
        this.primaryreport = primaryreport;
        this.investigationreport = investigationreport;
        this.consulatant20minssession = consulatant20minssession;
        this.finalreporttoclient = finalreporttoclient;
        this.chtmail = chtmail;
        this.followupcall = followupcall;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id;}
    public String getNote() { return note; }
    public void setNote(String note) { this.note = note;}
    public String getAppoinmentdatetime() { return appoinmentdatetime; }
    public void setAppoinmentdatetime(String appoinmentdatetime) { this.appoinmentdatetime = appoinmentdatetime;}
    public String getCoordinatordetails() { return coordinatordetails; }
    public void setCoordinatordetails(String coordinatordetails) { this.coordinatordetails = coordinatordetails;}
    public String getFhedetails() { return fhedetails; }
    public void setFhedetails(String fhedetails) { this.fhedetails = fhedetails;}
    public String getVendordetails() { return vendordetails; }
    public void setVendordetails(String vendordetails) { this.vendordetails = vendordetails;}
    public String getRemaindercalltobeneficiary() { return remaindercalltobeneficiary; }
    public void setRemaindercalltobeneficiary(String remaindercalltobeneficiary) { this.remaindercalltobeneficiary = remaindercalltobeneficiary;}
    public String getRemaindercalltocoordinater() { return remaindercalltocoordinater; }
    public void setRemaindercalltocoordinater(String remaindercalltocoordinater) { this.remaindercalltocoordinater = remaindercalltocoordinater;}
    public String getPrimaryreport() { return primaryreport; }
    public void setPrimaryreport(String primaryreport) { this.primaryreport = primaryreport;}
    public String getInvestigationreport() { return investigationreport; }
    public void setInvestigationreport(String investigationreport) { this.investigationreport = investigationreport;}
    public String getConsulatant20minssession() { return consulatant20minssession; }
    public void setConsulatant20minssession(String consulatant20minssession) { this.consulatant20minssession = consulatant20minssession;}
    public String getFinalreporttoclient() { return finalreporttoclient; }
    public void setFinalreporttoclient(String finalreporttoclient) { this.finalreporttoclient = finalreporttoclient;}
    public String getChtmail() { return chtmail; }
    public void setchtmail(String chtmail) { this.chtmail = chtmail;}
    public String getFollowupcall() { return followupcall; }
    public void setFollowupcall(String followupcall) { this.followupcall = followupcall;}}