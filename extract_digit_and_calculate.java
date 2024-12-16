public class extract_digit_and_calculate {
    public static void main(String[] args) {

        String text = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.";
        int laptopPrice = Integer.parseInt(text.replaceAll("[^0-9]", "").substring(0, 5)); // 85000
        int mousePrice = Integer.parseInt(text.replaceAll("[^0-9]", "").substring(5, 9)); // 2500

        int totalPrice = laptopPrice + mousePrice;
        double discount = totalPrice * 0.15;
        double price = totalPrice - discount;

        System.out.println("Total Price " + price );
    }
    }


