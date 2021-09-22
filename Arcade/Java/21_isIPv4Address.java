// Given a string, find out if it satisfies the IPv4 address naming rules.

final class IsIPv4Address {
 
    boolean isIPv4Address(String inputString) {
        return inputString.matches("([0-9]\\.|[1-9][0-9]\\.|[1][0-9][0-9]\\.|[2][0-4][0-9]\\.|25[0-5]\\.){3}(25[0-5]|[2][0-4][0-9]|[1][0-9][0-9]|[1-9][0-9]|[0-9])");
    }
}