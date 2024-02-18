package gunler.gun51_62.gun54_Polymorphism_2.Apple;

public class AppleStore {
    public static void main(String[] args) {

        // Objectin erisebilirligini reference kismi belirler
        // Her ne kadar object child classdan olusturulsa da
        // Reference parent ve erisilebilirlik parent class tarafindan belirlendiginden
        // Object create edildigi Child class daki methoda ulasamaz

        AppleDevice mac = new Mac();
        mac.use();
        // mac.code();

        AppleDevice ipad = new Ipad();
        ipad.use();
        // ipad.draw();

        Ipad ipad2 = new Ipad();
        ipad2.use();
        ipad2.draw();

        AppleDevice appleWatch = new AppleWatch();
        appleWatch.use();
        // appleWatch.wear();

    }
}
