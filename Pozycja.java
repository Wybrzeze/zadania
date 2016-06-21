public class Pozycja
    {
 
        String nazwaTowaru;
        int ileSztuk; 
        double cena; 
        double wartosc;
        String a;
 
        Pozycja(String nazwaTowaru, int ileSztuk, double cena)
        {
            this.nazwaTowaru = nazwaTowaru;
            this.ileSztuk = ileSztuk;
            this.cena = cena;
        }
       
        public double obliczWartosc()
        {
            wartosc = ileSztuk * cena;
            return wartosc;
        }
       
 
        public String toString(String nazwaTowaru, String cena,
                String ileSztuk, String wartoscZamowienia)
        {
            this.nazwaTowaru = nazwaTowaru;
            this.cena = Double.Parse(cena);
            this.ileSztuk = int.Parse(ileSztuk);
            this.wartosc = Double.Parse(wartoscZamowienia);
            a = nazwaTowaru + " " + cena + " " + ileSztuk + " " + wartosc;
            return a;
        }
 
 
 
    }