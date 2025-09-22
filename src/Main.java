//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    double purchasePrice = 25.35;
    final double SALES_TAX = 0.05;
    double computedTax = purchasePrice * SALES_TAX;
    double finalPrice = purchasePrice + computedTax;

    System.out.println("Your computed sales tax is $" + computedTax);
    System.out.println("Your final price is $" + finalPrice);
    }

