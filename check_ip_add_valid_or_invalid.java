public class check_ip_add_valid_or_invalid {

    public static void main(String[] args) {
        // Example inputs
        String[] ipAddresses = {
                "192.168.0.12",
                "172.16.56",
                "0.0.0.1",
                "1.12.72.2"
        };

        for (String ip : ipAddresses) {
            String[] parts = ip.split("\\.");

            if (parts.length != 4) {
                System.out.println(ip + " is an invalid IP");
                continue;
            }

            boolean isValid = true;

            for (String part : parts) {
                if (part.isEmpty() || !part.matches("\\d+")) {
                    isValid = false;
                    break;
                }

                if (part.length() == 1 || (part.length() > 1 && part.charAt(0) == '0')) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                System.out.println(ip + " is a Valid IP");
            } else {
                System.out.println(ip + " is an Invalid IP");
            }
        }
    }
}
