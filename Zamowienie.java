 public class Zamowienie
    {
 
        int ileDodanych;
        int maxRozmiar;
       Pozycja[] pozycje = new Pozycja[10];
 
        Zamowienie()
        {
            maxRozmiar = 10;
        }
 
        Zamowienie(int maxRozmiar)
        {
            this.maxRozmiar = maxRozmiar;
        }
 
        public void DodajPozycje(Pozycja[] p) 
        {
            this.pozycje = p; 
        }
 
        public double ObliczWartosc()
        {
            double wartoscZam = 10; 
            return wartoscZam;
        }
 
      
           
    }