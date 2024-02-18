package SelfProjects.HukukBurosu;

public class Test {
    public static void main(String[] args) {
        Ofis ofis =new Ofis("HG","alfhlfhaşlhf");

        Muvekkil muvekkil = new Muvekkil("Hasan","Gultekin",25,"5449454140","London","criminal");
        Muvekkil muvekkil1 = new Muvekkil("Ali","Yuzuak",24,"5449453458","Istanbul","civil");
        Muvekkil muvekkil2 = new Muvekkil("Yasin","Ilhan",28,"5449454234","Tokat","civil");
        Muvekkil muvekkil3 = new Muvekkil("Talha","Erkaya",25,"5449454242","Konya","criminal");
        Muvekkil muvekkil4 = new Muvekkil("Mansur","Fındık",27,"5449444444","Canakkale","criminal");
        Muvekkil muvekkil5 = new Muvekkil("Server","Arslan",24,"544022563","Ankara","criminal");

        ofis.addClients(muvekkil);
        ofis.addClients(muvekkil1);
        ofis.addClients(muvekkil2);
        ofis.addClients(muvekkil3);
        ofis.addClients(muvekkil4);
        ofis.addClients(muvekkil5);

        System.out.println("--------------------------------------------------");

        ofis.listCivilClients();

        System.out.println();

        ofis.listCriminalClients();

        System.out.println("-------------------------------------------------");

        ofis.getClientByCaseNumber(1003);
    }
}
