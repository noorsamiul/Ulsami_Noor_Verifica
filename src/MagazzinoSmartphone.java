public class MagazzinoSmartphone {
    private Smartphone[] smartphones;
    private int count;

    public MagazzinoSmartphone() {
        smartphones = new Smartphone[10]; // Assuming initial capacity of 10
        count = 0;
    }

    public MagazzinoSmartphone(MagazzinoSmartphone other) {
        smartphones = new Smartphone[10];

    }


    public void addSmartphone(Smartphone smartphone) {
        int n=0;



        
    }
    public void removeSmartphone(Smartphone smartphone) {
        int pos=count;
        boolean test=true;
        if(pos!=-1){
            smartphones[pos]=null; //opzionale
            for (int i = pos; i < count; i++) {
                smartphones[i]= smartphones[i+1];
            }
            smartphones[--count]=null;
        }
    }

    public Smartphone[] getSmartphonesArray() {
        Smartphone[] smartphoneArray = new Smartphone[count];
        System.arraycopy(smartphones, 0, smartphoneArray, 0, count);
        return smartphoneArray;
    }


    public Smartphone getSmartphoneByBrand(String brand) {
        Smartphone smartphone = null;


        return smartphone;
    }

    public MagazzinoSmartphone getSmartphonesByStorageCapacity(int storageCapacity) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();

        return magazzinoSmartphone;
    }

    public MagazzinoSmartphone getSmartphonesByPriceRange(double minPrice, double maxPrice) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();

        return magazzinoSmartphone;
    }

    @Override
    public String toString() {
        String result = "\nMagazzinoSmartphone:\n";
        result =  "MagazzinoSmartphone:" ;
        return result;
    }

    public int getCount() {
        return count;
    }

    public boolean equals(Object obj) {
       

        return true;
    }


}