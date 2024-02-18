package SelfProjects.HukukBurosu;
import java.util.ArrayList;
public class Ofis {
    private String name;
    private String address;
    private ArrayList<Muvekkil> criminalClients;
    private ArrayList<Muvekkil> civilClients;
    private ArrayList<Muvekkil> allClients;
    public Ofis( String name, String address) {
        setName(name);
        setAddress(address);
        criminalClients = new ArrayList<>();
        civilClients = new ArrayList<>();
        allClients = new ArrayList<>();
    }

    public ArrayList<Muvekkil> getCriminalClients() {
        return criminalClients;
    }

    public ArrayList<Muvekkil> getCivilClients() {
        return civilClients;
    }

    public ArrayList<Muvekkil> getAllClients() {
        return allClients;
    }
    public void setCriminalClients(ArrayList<Muvekkil> criminalClients) {
        this.criminalClients = criminalClients;
    }

    public void setCivilClients(ArrayList<Muvekkil> civilClients) {
        this.civilClients = civilClients;
    }

    public void setAllClients(ArrayList<Muvekkil> allClients) {
        this.allClients = allClients;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addClients(Muvekkil muvekkil){
        if (muvekkil.getFileType().equalsIgnoreCase("criminal")){
            criminalClients.add(muvekkil);
            allClients.add(muvekkil);
        } else if (muvekkil.getFileType().equalsIgnoreCase("civil")){
           civilClients.add(muvekkil);
           allClients.add(muvekkil);
        }else System.out.println("Invalid Case/Client Type");
    }
    public void getClientByCaseNumber(int caseNo){
        for (Muvekkil muvekkil:allClients){
            if (muvekkil.getCriminalCaseNumber()==caseNo){
                System.out.println(muvekkil);
            } else if (muvekkil.getCivilCaseNumber()==caseNo) {
                System.out.println(muvekkil);
            } else if (muvekkil.getCivilCaseNumber()==caseNo && muvekkil.getCriminalCaseNumber()==caseNo ) {
                System.out.println("Invalid Case Number");
            }
        }
    }

    public void listCriminalClients(){
        System.out.println("List of Criminal Clients");
        System.out.println(criminalClients + "\n");
    }
    public void listCivilClients(){
        System.out.println("List of Civil Clients");
        System.out.println(civilClients+ "\n");
    }
    public void listAllClients(){
        System.out.println("List of All Clients");
        System.out.println(allClients+ "\n");
    }
    @Override
    public String toString() {
        return "Ofis{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", criminalClients=" + criminalClients +
                ", civilClients=" + civilClients +
                ", allClients=" + allClients +
                '}';
    }
}
