public class LogMessage {

    private String machineId;
    private String description;

    /** Precondition: message is a valid log message. */
    public LogMessage(String message) {
        machineId = message.substring(0, message.indexOf(":"));
        description = message.substring(message.indexOf(":") + 1);
    }

    public boolean containsWord (String word) {
        if (description.contains(word)) {
            if (description.indexOf(word) == 0 || String.valueOf(description.charAt(description.indexOf(word)-1)).equals(" ")) {
                return true;
            } else if (description.indexOf(word) == word.length()-1 || String.valueOf(description.charAt(description.indexOf(word)+word.length())).equals(" ")){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
