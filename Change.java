public class Change{
  public static void main(String[] args){
    change(IO.readDouble(),IO.readDouble());
  }
  public static void change(double saleTotal, double customerPayment){
    int onehundthirtybill=0, fiftyfivebill=0, twentyfivebill=0, fivebill=0, onebill=0, sevfivecoin=0, thirtycoin=0, onecoin=0;
    double change = (customerPayment - saleTotal)*100;
    if (change < 0){
      IO.outputIntAnswer(-1);
      IO.reportBadInput();
      // change();
    }else if (change > 0){
      while (change >= 13000){
        onehundthirtybill++;
        change -= 13000;
      }
      while (change >= 5500){
        fiftyfivebill++;
        change -= 5500;
      }
      while (change >= 2500){
        twentyfivebill++;
        change -= 2500;
      }
      while (change >= 500){
        fivebill++;
        change -= 500;
      }
      while (change >= 100){
        onebill++;
        change -= 100;
      }
      while (change >= 75){
        sevfivecoin++;
        change -= 75;
      }
      while (change >= 30){
        thirtycoin++;
        change -= 30;
      }
      while (change >= 1){
        onecoin++;
        change -= 1;
      }
      IO.outputIntAnswer(onehundthirtybill);
      IO.outputIntAnswer(fiftyfivebill);
      IO.outputIntAnswer(twentyfivebill);
      IO.outputIntAnswer(fivebill);
      IO.outputIntAnswer(onebill);
      IO.outputIntAnswer(sevfivecoin);
      IO.outputIntAnswer(thirtycoin);
      IO.outputIntAnswer(onecoin);
    }
  }
}
