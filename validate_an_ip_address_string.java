public class validate_an_ip_address_string {
     public int isValid(String s) {
        String[] parts = s.split("\\.");

        if (parts.length != 4) {
            return 0;
        }

        for (String part : parts) {
            if (part.isEmpty() || part.length() > 3) {
                return 0;
            }

            for (char c : part.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return 0;
                }
            }

            int num = Integer.parseInt(part);
            if (num < 0 || num > 255 || (part.length() > 1 && part.charAt(0) == '0')) {
                return 0;
            }
        }

        return 1;
    }
}
